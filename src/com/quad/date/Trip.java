package com.quad.date;

public class Trip {
	
	private String origin;
	private String destination;
	
	//num days
	private int duration; 
	
	private String transport;
	
	//date of travel
	private Date date;
	
	public Trip() {
		origin = "Victoria";
		destination = "Neverland";
		duration = 0;
		transport = "Car";
		date = new Date();
	}
	
	public Trip(String origin, String destination, int duration, String transport, Date date) {
		this.origin = origin;
		this.destination = destination;
		this.duration = duration;
		this.transport = transport;
		this.date = date;
	}
	
	@Override
	public String toString() {
		return (origin + "-" + destination + "-" + duration + "-" + transport + "-" + date);
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getTransport() {
		return transport;
	}

	public void setTransport(String transport) {
		this.transport = transport;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
