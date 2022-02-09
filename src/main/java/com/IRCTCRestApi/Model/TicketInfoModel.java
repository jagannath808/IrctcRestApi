package com.IRCTCRestApi.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="TicketInfo")

public class TicketInfoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String pnr;
	private String name;
	private String sto;
	private String sfrom;
	private String jdate;
	private double price;
	private String trainName;
	
	public TicketInfoModel() {
		
	}

}
