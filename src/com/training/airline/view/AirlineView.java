package com.training.airline.view;

import java.util.ArrayList;
import com.training.airline.bean.*;
import com.training.airline.logic.*;

public class AirlineView {
	
	public static void print(String Destination) {
		
		ArrayList<Airline> result = Airport.findByDestination(Destination);
		for (Airline element: result) {
			System.out.println(element);
		}
	}
	

	public static void printDay(String Day) {
		
		ArrayList<Airline> result = Airport.findByDay(Day) ;
		for (Airline element: result) {
			System.out.println(element);
		
		}	
	}
	
	public static void printDayAndTime(String Day, int Time) {
		
		ArrayList<Airline> result = Airport.findByDayAndTime(Day,Time);
		for (Airline element: result) {
			System.out.println(element);
		
		}	
	}

}
	
