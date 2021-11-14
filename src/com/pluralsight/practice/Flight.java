//method returning value
package com.pluralsight.practice;

public class Flight {

	private int passengers;
	private int seats;
	
	//constructor and other method elided for clarity 
	
	public boolean hasRoom(Flight f2) {
		int total = passengers + f2.passengers;
		return total <= seats;
	}
	public Flight createNewWithBoth(Flight f2) {
		Flight newFlight = new Flight();
		newFlight.seats = seats;
		newFlight.passengers = passengers + f2.passengers;
		return newFlight;
	}
	public static void main(String[] args) {
		Flight lax1 = new Flight();
	    Flight lax2 = new Flight();
	    //add passengers to both flights
	    
	    Flight lax3;
	    if(lax1.hasRoom(lax2))
	    	lax3 = lax1.createNewWithBoth(lax2);
	}
}
