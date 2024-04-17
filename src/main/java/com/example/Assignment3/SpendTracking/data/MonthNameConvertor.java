package com.example.Assignment3.SpendTracking.data;

import java.time.Month;

public class MonthNameConvertor {

    public String monthNumberToMonthName(int monthNumber){
        return Month.of(monthNumber).name();
    }
}
