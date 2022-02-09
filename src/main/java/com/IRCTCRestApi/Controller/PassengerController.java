package com.IRCTCRestApi.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.IRCTCRestApi.Request.Passenger;
import com.IRCTCRestApi.Response.TicketInfo;
import com.IRCTCRestApi.Service.PassengerService;
import com.IRCTCRestApi.Service.TicketInfoService;

@RestController
@RequestMapping("/irctc")
public class PassengerController {
	
	@Autowired
	PassengerService passengerService;
	@Autowired
	TicketInfoService ticketInfoService;
	
	@PostMapping(value="/bookticket")
	public ResponseEntity<String> bookTicket(@RequestBody Passenger passenger){
		
		TicketInfo ticketInfo = passengerService.bookTicket(passenger);
		
		String msg = "Ticket booking success..PNR no ::"+ticketInfo.getPnr();
		return new ResponseEntity<String>(msg ,HttpStatus.CREATED);
		
	}
	
	@GetMapping(value="/getInfo/{pnr}")
	public ResponseEntity<TicketInfo> getTicketInfo(@PathVariable String pnr){
		System.out.println("PNR number-"+pnr);
		TicketInfo ticketInfo = ticketInfoService.getTicketInfo(pnr);
		return new ResponseEntity<TicketInfo>(ticketInfo,HttpStatus.OK);
		
	}
	
	/* Testing this one*/
	@GetMapping(value="/get",
			//produces = {"application/json","application/xml"}
			produces = {MediaType.APPLICATION_JSON_VALUE,
						MediaType.APPLICATION_XML_VALUE}
			)
	public ResponseEntity<Passenger> getData(){
		Passenger passenger = new Passenger("Jaga","ja@ja",232323L,"kgp","bqa","12-21-12");
		System.out.println(passenger);
		return new ResponseEntity<Passenger>(passenger,HttpStatus.OK);
		
	}
	
	@GetMapping(value="/hi")
	public String getTicketInfo(){
		retrun "jagannat"
		
	}
}
