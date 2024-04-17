package com.example.Assignment3.SpendTracking.data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Request for retrieving the expenses.
 */
public class GetExpendituresRequest {
    private final BigDecimal amount;

    private final Date date;

    private final String description;


    public GetExpendituresRequest(final BigDecimal amount,final Date date,final String description){
        this.amount=amount;
        this.date=date;
        this.description=description;
    }

    /**
     * get the amount that was spent.
     * @return the amount that was spent.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * get the date of expenditure.
     * @return the date of expenditure.
     */
    public Date getDate() {
        return date;
    }

    /**
     * get the description of expenditure.
     * @return the description of expenditure.
     */
    public String getDescription() {
        return description;
    }
}
