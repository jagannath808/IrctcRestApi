package com.IRCTCRestApi.Request;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
	
	String name;
	String email;
	Long phone;
	String from;
	String to;
	String journeyDate;
}
