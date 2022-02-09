package com.IRCTCRestApi.Service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IRCTCRestApi.Model.TicketInfoModel;
import com.IRCTCRestApi.Repo.PassengerData;
import com.IRCTCRestApi.Repo.TicketInfoRepo;
import com.IRCTCRestApi.Request.Passenger;
import com.IRCTCRestApi.Response.TicketInfo;
import com.IRCTCRestApi.Util.HelperClass;

@Service
public class PassengerService {
	
	@Autowired
	TicketInfoRepo ticketInfoRepo;
	
	
	public TicketInfo bookTicket(Passenger passenger) {
		
		TicketInfoModel model = new TicketInfoModel();
		model.setName(passenger.getName());
		model.setSfrom(passenger.getFrom());
		model.setSto(passenger.getTo());
		model.setPrice(122.00);
		model.setTrainName("Train Name");
		model.setJdate(passenger.getJourneyDate());
		model.setPnr(HelperClass.getPnr());
		
		ticketInfoRepo.save(model);
		
		TicketInfo ticketInfo = new TicketInfo();
		ticketInfo.setName(model.getName());
		ticketInfo.setFrom(model.getSfrom());
		ticketInfo.setTo(model.getSto());
		ticketInfo.setPrice(model.getPrice());
		ticketInfo.setTrainName(model.getTrainName());
		ticketInfo.setJdate(model.getJdate());
		ticketInfo.setPnr(model.getPnr());
		
		return ticketInfo;
	}
	
	

}
