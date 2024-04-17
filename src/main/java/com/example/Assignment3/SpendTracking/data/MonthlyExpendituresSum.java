package com.example.Assignment3.SpendTracking.data;

import jdk.jfr.DataAmount;

import java.math.BigDecimal;
import java.time.LocalDate;


public class MonthlyExpendituresSum {

    private int month;
    private int year;
    private BigDecimal sum;

    private String monthName;


    public MonthlyExpendituresSum(int month,int year,BigDecimal sum) {
        this.month=month;
        this.year=year;
        this.sum = sum;
    }

    public int getMonth() {
        return month;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public int getYear(){
        return year;
    }

    public String changeMonthNumberToName(int month){
        switch(month){
            case 1:
                monthName="January";
                break;

            case 2:
                monthName="February";
                break;

            case 3:
                monthName="March";
                break;

            case 4:
                monthName="April";
                break;

            case 5:
                monthName="May";
                break;

            case 6:
                monthName="June";
                break;

            case 7:
                monthName="July";
                break;

            case 8:
                monthName="August";
                break;

            case 9:
                monthName="September";
                break;

            case 10:
                monthName="October";
                break;

            case 11:
                monthName="November";
                break;

            case 12:
                monthName="December";
                break;

        }
        return monthName;
    }
}
