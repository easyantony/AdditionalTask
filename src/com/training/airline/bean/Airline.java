package com.training.airline.bean;

public class Airline {
	
	private String destination;
	private String day;
	private String aircraftType;
	private String flightNumber;
	private int time;
	
	public Airline (String destination, String day, String aircraftType, String flightNumber, int time) {
		
		this.destination = destination;
		this.aircraftType = aircraftType;
		this.day = day;
		this.flightNumber = flightNumber;
		this.time = time;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		destination = destination;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		day = day;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		aircraftType = aircraftType;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		flightNumber = flightNumber;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		time = time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aircraftType == null) ? 0 : aircraftType.hashCode());
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((flightNumber == null) ? 0 : flightNumber.hashCode());
		result = prime * result + time;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (aircraftType == null) {
			if (other.aircraftType != null)
				return false;
		} else if (!aircraftType.equals(other.aircraftType))
			return false;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber == null) {
			if (other.flightNumber != null)
				return false;
		} else if (!flightNumber.equals(other.flightNumber))
			return false;
		if (time != other.time)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", day=" + day + ", aircraftType=" + aircraftType
				+ ", flightNumber=" + flightNumber + ", time=" + time + "]";
	}

	
	
	

}
