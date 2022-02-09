package com.IRCTCRestApi.Response;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@XmlRootElement
@NoArgsConstructor
@AllArgsConstructor
public class TicketInfo {
	
	private String pnr;
	private String name;
	private String to;
	private String from;
	private String jdate;
	private double price;
	private String trainName;

}
