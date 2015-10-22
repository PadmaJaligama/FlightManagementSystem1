package com.flight.management;

import java.util.List;

public class User {
	Flight flight;
	int ticketNo;
	static int noTickets = 1;
	int bookFlight(Flight flight){
		if(flight.getFlightNo() != null){
			ticketNo = flight.checkFlightStatus(flight.getFlightNo());
		}
		return ticketNo;
		
	}
	boolean cancelFlight(String flightNo){
		List<String> ls = Flight.bookedHistory();
		
		if(null != flightNo && ls.contains(flightNo))
				{
					return true;
				} else 
					return false;
	}
	
}
