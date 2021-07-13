package com.training.airline.view;

import java.util.ArrayList;
import com.training.airline.bean.*;
import com.training.airline.logic.*;

public class AirlineView {
	
	public String print(String Destination) {
		
		ArrayList<Airline> result = findByDestination(Destination);
		for (Airline element: result) {
			System.out.println(element);
		}
	}
	
	public String printDay(String Day) {
		
		ArrayList<Airline> result = findByDay(Day);
		for (Airline element: result) {
			System.out.println(element);
		
		}	
	}
	
	public String printDay(String Day, int Time) {
		
		ArrayList<Airline> result = findByDayAndTime(Day, Time);
		for (Airline element: result) {
			System.out.println(element);
		
		}	
	}

}
	
