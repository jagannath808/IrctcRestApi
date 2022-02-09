package com.IRCTCRestApi.Util;

import java.util.UUID;

public class HelperClass {


	public static String getPnr() {
		String pnr =UUID.randomUUID().toString()
					.replace("-","").substring(1,4);
		
		return "PNR"+pnr.toUpperCase();
	}
	
}
