package com.flight.management;

public class FlightManagementHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Book The Flight
		 */
		User usr = new User();
		Flight flight = getUserBookData();
		int tokenNo = usr.bookFlight(flight);
		if (tokenNo != 0) {
			System.out.println("Congratulations your Flight is Booked");
			System.out.println("Please Note your Token Number for Any reference" + tokenNo);
		} else {
			System.out.println("Sorry there are no Flights available");
		}
		
		/**
		 * Cancel the flight
		 */
		boolean status = usr.cancelFlight("12345XX"); 
		
		if(status == true) {
		System.out.println("Successfully cancelled");
		} else {
			System.out.println("Error Encountered");
		}
		
	}

	/**
	 * Sample Static Data
	 */
	static Flight getUserBookData() {
		Flight flight = new Flight();
		flight.setFlightName("AirIndia");
		flight.setSource("Atlanta");
		flight.setDestination("Florida");
		flight.setFlightNo("12345XX");
		return flight;
	}

}
