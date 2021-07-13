package com.training.airline.logic;

import com.training.airline.bean.*;

public class AirportInspector {
	
	public static void main(String [] args) {
		Airport Air = new Airport();
		
		Air.add(new Airline ("Moscow", "Monday", "Boeing", "AB 1100", 8));
		Air.add(new Airline ("Minsk", "Monday", "Boeing", "AB 1100", 20));
		Air.add(new Airline ("Moscow", "Tuesday", "Boeing", "AB 1100", 8));
		Air.add(new Airline ("Kiev", "Tuesday", "Boeing", "AB 1100", 20));
		Air.add(new Airline ("Nepal", "Wednesday", "Boeing", "AB 1100", 8));
		Air.add(new Airline ("Miami", "Wednesday", "Boeing", "AB 1100", 20));
		Air.add(new Airline ("Brest", "Thursday", "Boeing", "AB 1100", 8));
		Air.add(new Airline ("NewYork", "Thursday", "Boeing", "AB 1100", 20));
		Air.add(new Airline ("Minsk", "Friday", "Boeing", "AB 1100", 8));
		Air.add(new Airline ("Moscow", "Friday", "Boeing", "AB 1100", 20));
		Air.add(new Airline ("Kiev", "Saturday", "Boeing", "AB 1100", 8));
		Air.add(new Airline ("Brest", "Saturday", "Boeing", "AB 1100", 20));
		Air.add(new Airline ("Rome", "Sunday", "Boeing", "AB 1100", 8));
		Air.add(new Airline ("Vilnius", "Sunday", "Boeing", "AB 1100", 20));
	}

}
