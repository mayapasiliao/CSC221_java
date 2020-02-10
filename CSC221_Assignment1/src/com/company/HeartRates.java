package com.company;

import java.util.GregorianCalendar;

//  Must include the following methods:
//      Constructor that receives first name, last name, and date of birth (month, day, year) as parameters.
//      Set and get methods for each attribute.
//      Method that calculates and returns the person's age (in years).
//      Method that calculates and returns the person's maximum heart rate.
//      Method that calculates and returns the person's target heart rate

public class HeartRates {
    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int year;


    HeartRates(String firstName, String lastName, int month, int day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    void setFirstName(String a) {
        firstName = a;
    }

    void setLastName(String a) {
        lastName = a;
    }

    void setMonth(int a) {
        month = a;
    }

    void setDay(int a) {
        day = a;
    }

    void setYear(int a) {
        year = a;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    int getMonth() {
        return month;
    }

    int getDay() {
        return day;
    }

    int getYear() {
        return year;
    }

    int age() {
    	GregorianCalendar gcal = new GregorianCalendar();
        return gcal.get(GregorianCalendar.YEAR) - year;
    }

    int maxHeartRate() {
        return 220 - age();
    }

    double[] targetHeartRate() {
        double[] targetHeartRateRange = new double[2];
        double min = maxHeartRate() * 0.50;
        double max = maxHeartRate() * 0.85;

        targetHeartRateRange[0] = min;
        targetHeartRateRange[1] = max;

        return targetHeartRateRange;
    }
}