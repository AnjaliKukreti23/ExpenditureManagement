package com.example.Assignment3.SpendTracking.Persistence;

import com.example.Assignment3.SpendTracking.domain.Expenditure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Repository
public class ExpenditurePopulate implements CommandLineRunner {
    @Autowired
    ExpenditureRespository repository;



    public void run(String...s){
       LocalDate date1=LocalDate.of(2020,2,7);
        LocalDate date2=LocalDate.of(2020,2,7);
        LocalDate date3=LocalDate.of(2021,2,8);
       repository.save(new Expenditure(new BigDecimal("5000"),date1,"Rent"));
        repository.save(new Expenditure(new BigDecimal("2000"),date2,"Rent"));
        repository.save(new Expenditure(new BigDecimal("2000"),date3,"Rent"));
    }
}
