package com.quad.date;

public class Date {
	
	private int month;
	private int year;
	
	//months
	public static final int NUM_MONTHS = 12;
	public static final int JANUARY = 1;
	public static final int FEBRUARY = 2;
	public static final int MARCH = 3;
	public static final int APRIL = 4;
	public static final int MAY = 5;
	public static final int JUNE = 6;
	public static final int JULY = 7;
	public static final int AUGUST = 8;
	public static final int SEPTEMBER = 9;
	public static final int OCTOBER = 10;
	public static final int NOVEMBER = 11;
	public static final int DECEMBER = 12;
	
	public Date() {
		month = JANUARY;
		year = 2019;
	}
	
	public Date(int month, int year) {
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return ("("+month+", "+year+")");
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	

}
