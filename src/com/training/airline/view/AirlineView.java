package com.training.airline.view;

import java.util.ArrayList;
import com.training.airline.bean.*;
import com.training.airline.logic.*;

public class AirlineView {
	
	public static void print(String destination) {
		
		ArrayList<Airline> result = Airport.findByDestination(destination);
		for (Airline element: result) {
			System.out.println(element);
		}
	}
	

	public static void printDay(String day) {
		
		ArrayList<Airline> result = Airport.findByDay(day) ;
		for (Airline element: result) {
			System.out.println(element);
		
		}	
	}
	
	public static void printDayAndTime(String day, int time) {
		
		ArrayList<Airline> result = Airport.findByDayAndTime(day,time);
		for (Airline element: result) {
			System.out.println(element);
		
		}	
	}

}
	
