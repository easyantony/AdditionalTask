package com.training.airline.logic;

import java.util.ArrayList;

import com.training.airline.bean.Airline;

public class Airport {
	private static ArrayList<Airline> airlines;
	
	public Airport() {
		airlines = new ArrayList<Airline>();
	}

	public ArrayList<Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(ArrayList<Airline> airlines) {
		Airport.airlines = airlines;
	}
	
	public void add(Airline a) {
		airlines.add(a);
	}
	
	public static ArrayList<Airline> findByDestination(String destination){
		ArrayList<Airline> result = new ArrayList<Airline>();
		
		for (Airline a : airlines) {
			if(a.getdestination().equals(destination)) {
				result.add(a);
			}
		}
		
		return result;
	}
	
	public static ArrayList<Airline> findByDay(String day){
		ArrayList<Airline> result = new ArrayList<Airline>();
		
		for (Airline a : airlines) {
			if(a.getday().equals(day)) {
				result.add(a);
			}
		}
		
		return result;
	}
	
	public static ArrayList<Airline> findByDayAndTime(String day, int time){
		ArrayList<Airline> result = new ArrayList<Airline>();
		
		for (Airline a : airlines) {
			if(a.getday().equals(day) & a.gettime() < time) {
				result.add(a);
			}
		}
		
		return result;
	}
	
}
