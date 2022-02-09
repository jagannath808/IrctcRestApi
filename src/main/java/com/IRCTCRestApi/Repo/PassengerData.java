package com.IRCTCRestApi.Repo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.IRCTCRestApi.Request.Passenger;
import com.IRCTCRestApi.Response.TicketInfo;

@Repository
public class PassengerData {
	
	Map<String,TicketInfo> data = new HashMap<String,TicketInfo>();
	
	public void bookTicket(TicketInfo ticketInfo) {
		data.put(ticketInfo.getPnr(), ticketInfo);
		
	}

	public TicketInfo getTicketInfo(String pnr) {
		
		System.out.println(data.get(pnr));
		return data.get(pnr);
		
	}
	

}
