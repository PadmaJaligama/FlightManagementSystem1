package com.flight.management;

import java.util.HashMap;
import java.util.Map;

public class Admin {
	
	static Map<String,String> flightAvail;
	/**
	 * below method for checking the flight status
	 * @return
	 */
	static Map<String, String> flightStatus(){
		flightAvail = new HashMap<String,String>();
		flightAvail.put("12345XX", "Y");
		flightAvail.put("10001X", "Y");
		flightAvail.put("10001Y", "Y");
		return flightAvail;
	}

	
}
