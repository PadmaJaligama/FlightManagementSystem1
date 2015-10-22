package com.flight.management;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Flight {
	
	String flightName;
	String flightNo;
	String source;
	String destination;
	Date travelDate;
	String flightStatus;
	
	int checkFlightStatus(String flightNo){
		int ticketNo = 0;
		
			Map<String, String> status= Admin.flightStatus();
			if("Y".equals(status.get(flightNo))){
			  return 1000001;
		} else {
			
		}
		return ticketNo;
		
	}
	
	static List<String> bookedHistory(){
		List<String> ticketNoLs = new ArrayList<String>();
		ticketNoLs.add("abc");
		ticketNoLs.add("12345XX"); 
		ticketNoLs.add("10001X");
		ticketNoLs.add("10001Y");
		return ticketNoLs;
	}
	
	public String getFlightStatus() {
		return flightStatus;
	}
	public void setFlightStatus(String flightStatus) {
		this.flightStatus = flightStatus;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
}
