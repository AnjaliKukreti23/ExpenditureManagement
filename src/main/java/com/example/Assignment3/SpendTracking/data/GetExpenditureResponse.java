package com.example.Assignment3.SpendTracking.data;
import java.util.Collection;
import java.util.ArrayList;

/**
 * response for retrieving all the expenses details.
 */
public class GetExpenditureResponse {

    private Collection<ExpenditureSummary> expenditures;

    /**
     * adding an expenditure to response.
     * @param expenditure : the expenditure to add.
     */

    public void addExpenditure(final ExpenditureSummary expenditure){
        if(expenditures==null){
            expenditures=new ArrayList<>();
        }
        expenditures.add(expenditure);
    }

    public Collection<ExpenditureSummary> getExpenditures(){
        return expenditures;
    }
}
