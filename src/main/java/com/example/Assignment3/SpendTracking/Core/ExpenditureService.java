package com.example.Assignment3.SpendTracking.Core;

import com.example.Assignment3.SpendTracking.Persistence.ExpenditureRespository;
import com.example.Assignment3.SpendTracking.data.*;
import com.example.Assignment3.SpendTracking.data.MonthlyExpendituresSum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Month;
import java.util.List;

@Service
public class ExpenditureService {

    @Autowired
    private ExpenditureRespository expenditureRespository;

    // for returning the whole list of expenditures: click on spend.
    public GetExpenditureResponse getExpenditures(final GetExpendituresRequest request){
        final var response=new GetExpenditureResponse();

        for(final var expenditure:expenditureRespository.findAll()){
            response.addExpenditure(new ExpenditureSummary(expenditure.getAmount(),expenditure.getDate(),expenditure.getDescription()));

        }
        return response;
    }

    // returning the expense details when clicking on home.

  /*  public GetMonthlyExpenditureResponse getMonthlyExpenditure() {
        final var response = new GetMonthlyExpenditureResponse();

        List<MonthlyExpendituresSum> expenditures = expenditureRespository.findGroupByMonthTotalExpenditure();
        for (final var monthlyExpenditure : expenditures) {
           /* String month = changeMonthNumberToName(monthlyExpenditure.getMonth());
            String summryDate = month + ", " + monthlyExpenditure.getYear();
          */
           /* response.addMonthlyExpenditure(new MonthlyExpendituresSum(monthlyExpenditure.getMonth(),monthlyExpenditure.getYear(),monthlyExpenditure.getSum());
          // System.out.println(monthlyExpenditure.getMonth());

        }
            return response;
        }*/


    public GetMonthNameResponse getMonthlyExpenditure() {
        final var response = new GetMonthNameResponse();
        MonthNameConvertor monthNameConvertor = new MonthNameConvertor();
        List<MonthlyExpendituresSum> expenditures = expenditureRespository.findGroupByMonthTotalExpenditure();
        for (final var monthlyExpenditure : expenditures) {

           /* String monthName = monthNameConvertor.monthNumberToMonthName(monthlyExpenditure.getMonth());
            int year = monthlyExpenditure.getYear();

            String monthAndYear = monthName +" "+ year;
            BigDecimal amount=monthlyExpenditure.getSum();
*/

            String monthAndYear= Month.of(monthlyExpenditure.getMonth()).name()+" , "+monthlyExpenditure.getYear();

            response.addExpenditure(new GetExpensesByMonthNameSummary(monthAndYear, monthlyExpenditure.getSum()));

        }
        return response;
    }

   /* private String changeMonthNumberToName(int month){
        String monthName = "";
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
    }*/

    }
