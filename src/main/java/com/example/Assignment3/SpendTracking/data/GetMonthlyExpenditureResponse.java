package com.example.Assignment3.SpendTracking.data;

import java.util.ArrayList;
import java.util.Collection;

public class GetMonthlyExpenditureResponse {

    private Collection<MonthlyExpendituresSum> listOfExpenses;

    public void addMonthlyExpenditure(final MonthlyExpendituresSum monthlyExpendituresSum){
        if(listOfExpenses==null){
            listOfExpenses=new ArrayList<>();
        }
        listOfExpenses.add(monthlyExpendituresSum);
    }

    public Collection<MonthlyExpendituresSum> getMonthlyExpenditures(){
        return listOfExpenses;
    }
}




