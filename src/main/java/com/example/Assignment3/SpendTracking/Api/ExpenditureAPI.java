package com.example.Assignment3.SpendTracking.Api;

import com.example.Assignment3.SpendTracking.Core.ExpenditureService;
import com.example.Assignment3.SpendTracking.data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;

@RequestMapping("/expenditures")
@RestController
class ExpenditureAPI {
    @Autowired
    private ExpenditureService expenditureService;

    @GetMapping
    public ResponseEntity<GetExpenditureResponse>getExpenditure(final BigDecimal amount, final Date date,
                                                                final String description){
        return ResponseEntity.ok(expenditureService.getExpenditures(new GetExpendituresRequest(amount,date,description)));
    }


   /* @GetMapping("/home")
    public ResponseEntity<GetMonthlyExpenditureResponse> getMonthlyExpenditure(){
        return ResponseEntity.ok(expenditureService.getMonthlyExpenditure());
    }*/

    @GetMapping("/home2")
    public ResponseEntity<GetMonthNameResponse> getMonthlyExpenditure(){
        return ResponseEntity.ok(expenditureService.getMonthlyExpenditure());
    }


}
