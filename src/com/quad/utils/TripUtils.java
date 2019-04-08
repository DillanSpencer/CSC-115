package com.quad.utils;

import java.util.Random;

import com.quad.date.Date;
import com.quad.date.Trip;

public class TripUtils {
	
	public static String[] listOfDestinations(Trip[] trips) {
		String[] s = new String[trips.length];
		for(int i = 0; i < trips.length; i++) {
			s[i] = trips[i].getDestination();
		}
		return s;
	}
	
	public static void findLongestTrip(Trip[] trips) {
		int max = trips[0].getDuration();
		int pos = 0;
		for(int i = 0; i < trips.length; i++) {
			if(trips[i].getDuration() >= max) {
				max = trips[i].getDuration();
				pos = i;
			}
		}
		System.out.println("The longest trip is " + 
						trips[pos].getDestination() + ": " +
						trips[pos].getDuration() + " days");
	}
	
	public static Trip[] generateTrips(int n) {
		Random r = new Random();
		Trip[] trips = new Trip[n];
		String[] names = ArrayUtils.generateStrings(n*2);
		
		for(int i = 0; i < n; i++) {
			trips[i] = new Trip(names[i], names[i*2], r.nextInt(50), "Car", new Date(r.nextInt(1+r.nextInt(11)), 2000 + r.nextInt(20)));
		}
		return trips;
	}

}
