package com.training.airline.logic;

import java.util.ArrayList;

import com.training.airline.bean.Airline;

public class Airport {
	private ArrayList<Airline> airlines;
	
	public Airport() {
		airlines = new ArrayList<Airline>();
	}

	public ArrayList<Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(ArrayList<Airline> airlines) {
		this.airlines = airlines;
	}
	
	public void add(Airline a) {
		airlines.add(a);
	}
	
	public ArrayList<Airline> findByDestination(String Destination){
		ArrayList<Airline> result = new ArrayList<Airline>();
		
		for (Airline a : airlines) {
			if(a.getDestination().equals(Destination)) {
				result.add(a);
			}
		}
		
		return result;
	}
	
	public ArrayList<Airline> findByDay(String Day){
		ArrayList<Airline> result = new ArrayList<Airline>();
		
		for (Airline a : airlines) {
			if(a.getDay().equals(Day)) {
				result.add(a);
			}
		}
		
		return result;
	}
	
	public ArrayList<Airline> findByDayAndTime(String Day, int Time){
		ArrayList<Airline> result = new ArrayList<Airline>();
		
		for (Airline a : airlines) {
			if(a.getDay().equals(Day) & a.getTime() < Time) {
				result.add(a);
			}
		}
		
		return result;
	}
	
}