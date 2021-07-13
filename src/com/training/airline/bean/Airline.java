package com.training.airline.bean;

public class Airline {
	
	private String Destination;
	private String Day;
	private String AircraftType;
	private String FlightNumber;
	private int Time;
	
	public Airline (String Destination, String Day, String AircraftType, String FlightNumber, int Time) {
		
		this.Destination = Destination;
		this.AircraftType = AircraftType;
		this.Day = Day;
		this.FlightNumber = FlightNumber;
		this.Time = Time;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public String getDay() {
		return Day;
	}

	public void setDay(String day) {
		Day = day;
	}

	public String getAircraftType() {
		return AircraftType;
	}

	public void setAircraftType(String aircraftType) {
		AircraftType = aircraftType;
	}

	public String getFlightNumber() {
		return FlightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		FlightNumber = flightNumber;
	}

	public int getTime() {
		return Time;
	}

	public void setTime(int time) {
		Time = time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AircraftType == null) ? 0 : AircraftType.hashCode());
		result = prime * result + ((Day == null) ? 0 : Day.hashCode());
		result = prime * result + ((Destination == null) ? 0 : Destination.hashCode());
		result = prime * result + ((FlightNumber == null) ? 0 : FlightNumber.hashCode());
		result = prime * result + Time;
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
		if (AircraftType == null) {
			if (other.AircraftType != null)
				return false;
		} else if (!AircraftType.equals(other.AircraftType))
			return false;
		if (Day == null) {
			if (other.Day != null)
				return false;
		} else if (!Day.equals(other.Day))
			return false;
		if (Destination == null) {
			if (other.Destination != null)
				return false;
		} else if (!Destination.equals(other.Destination))
			return false;
		if (FlightNumber == null) {
			if (other.FlightNumber != null)
				return false;
		} else if (!FlightNumber.equals(other.FlightNumber))
			return false;
		if (Time != other.Time)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [Destination=" + Destination + ", Day=" + Day + ", AircraftType=" + AircraftType
				+ ", FlightNumber=" + FlightNumber + ", Time=" + Time + "]";
	}

	
	
	

}
