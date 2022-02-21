package com.example.hellospring.services;

import java.util.Calendar;

public class CalculateDayOfWeek {
    public String calculateDayOfWeek() {

        Calendar cal = Calendar.getInstance();


        int date = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);

        int month = cal.get(Calendar.MONTH) + 1;
        System.out.println(month);

        int century = cal.get(Calendar.YEAR) / 100;
        System.out.println(century);

        int year = cal.get(Calendar.YEAR);

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println(dayOfWeek);


        if (month == 1) {
            month = 13;
            year --;
        }
        if (month == 2) {
            month = 14;
            year --;
        }


        int yearOfTheCentury = year % 100;
        System.out.println(yearOfTheCentury);


        int q = date;
        int m = month;
        int j = century;
        int k = yearOfTheCentury;
        int d = dayOfWeek;
        int h = (q + ((13 * (m + 1)) / 5) + k + (k / 4) + (j / 4) - 2 * j) % 7;
        h = ((h + 5) % 7) + 1;

        switch (h) {
            case 1: return "No, it's monday";
            case 2: return "No, it's tuesday";
            case 3: return "No, it's wednesday";
            case 4: return "No, it's thursday";
            case 5: return "Yes, it's friday";
            case 6: return "No, it's saturday";
            case 7: return "No, it's sunday";
        }
        return null;
    }
}
