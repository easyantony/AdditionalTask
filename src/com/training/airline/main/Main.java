package com.training.airline.main;

import com.training.airline.bean.*;
import com.training.airline.logic.Airport;
import com.training.airline.view.*;


public class Main {

	public static void main(String[] args) {
		
		Airport airlines = new Airport();
		
		airlines.add(new Airline ("Moscow", "Monday", "Boeing", "AB 1100", 8));
		airlines.add(new Airline ("Minsk", "Monday", "Boeing", "AB 1100", 20));
		airlines.add(new Airline ("Moscow", "Tuesday", "Boeing", "AB 1100", 8));
		airlines.add(new Airline ("Kiev", "Tuesday", "Boeing", "AB 1100", 20));
		airlines.add(new Airline ("Nepal", "Wednesday", "Boeing", "AB 1100", 8));
		airlines.add(new Airline ("Miami", "Wednesday", "Boeing", "AB 1100", 20));
		airlines.add(new Airline ("Brest", "Thursday", "Boeing", "AB 1100", 8));
		airlines.add(new Airline ("NewYork", "Thursday", "Boeing", "AB 1100", 20));
		airlines.add(new Airline ("Minsk", "Friday", "Boeing", "AB 1100", 8));
		airlines.add(new Airline ("Moscow", "Friday", "Boeing", "AB 1100", 20));
		airlines.add(new Airline ("Kiev", "Saturday", "Boeing", "AB 1100", 8));
		airlines.add(new Airline ("Brest", "Saturday", "Boeing", "AB 1100", 20));
		airlines.add(new Airline ("Rome", "Sunday", "Boeing", "AB 1100", 8));
		airlines.add(new Airline ("Vilnius", "Sunday", "Boeing", "AB 1100", 20));				

	}
				
}
