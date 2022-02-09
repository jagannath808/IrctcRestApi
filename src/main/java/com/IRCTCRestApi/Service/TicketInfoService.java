package com.IRCTCRestApi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IRCTCRestApi.Model.TicketInfoModel;
import com.IRCTCRestApi.Repo.PassengerData;
import com.IRCTCRestApi.Repo.TicketInfoRepo;
import com.IRCTCRestApi.Response.TicketInfo;

@Service
public class TicketInfoService {
	@Autowired
	TicketInfoRepo ticketInfoRepo;
	public TicketInfo getTicketInfo(String pnr) {
		 TicketInfoModel infoByPnr = ticketInfoRepo.findTicketInfoByPnr(pnr);
		
		 TicketInfo ticketInfo = new TicketInfo();
			ticketInfo.setName(infoByPnr.getName());
			ticketInfo.setFrom(infoByPnr.getSfrom());
			ticketInfo.setTo(infoByPnr.getSto());
			ticketInfo.setPrice(infoByPnr.getPrice());
			ticketInfo.setTrainName(infoByPnr.getTrainName());
			ticketInfo.setJdate(infoByPnr.getJdate());
			ticketInfo.setPnr(infoByPnr.getPnr());
		 
		return ticketInfo;
	}

}
