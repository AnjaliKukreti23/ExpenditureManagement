package com.example.Assignment3.SpendTracking.Persistence;

import com.example.Assignment3.SpendTracking.domain.Expenditure;
import com.example.Assignment3.SpendTracking.data.MonthlyExpendituresSum;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExpenditureRespository extends CrudRepository<Expenditure, Long> {

//@Query(
//value=
//"SELECT FUNCTION('MONTH', e.date), FUNCTION('YEAR', e.date), SUM(e.amount) "+
//    "FROM Expenditure e "+
//    "GROUP BY FUNCTION('MONTH', e.date), FUNCTION('YEAR', e.date)")

    /*List<MonthlyExpenditureSummary> findByMonthAndYearWithSumAmount(
        );*/

   /* @Query(
            value =
            "SELECT "+" new com.example.Assignment3.SpendTracking.data.MonthlyExpendituresSum(extract(month from e.date),SUM(e.amount))"+
             "FROM Expenditure e "+
             "GROUP BY extract(month from e.date)"
    )
    public List<MonthlyExpendituresSum> findGroupByMonthTotalExpenditure();*/

    @Query(
            value =
                  "SELECT "+" new com.example.Assignment3.SpendTracking.data.MonthlyExpendituresSum(extract(month from e.date),extract(year from e.date),SUM(e.amount))"+
                 "FROM Expenditure e "+
                 "GROUP BY extract(month from e.date),extract(year from e.date)"

    )
    public List<MonthlyExpendituresSum> findGroupByMonthTotalExpenditure();


}