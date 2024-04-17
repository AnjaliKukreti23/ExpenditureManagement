package com.example.Assignment3.SpendTracking.data;

import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class ExpenditureSummary {

    private final BigDecimal amount;

    private final LocalDate date;

    private final String description;


    public ExpenditureSummary(final BigDecimal amount, final LocalDate date, final String description){
        this.amount=amount;
        this.date=date;
        this.description=description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }


}
