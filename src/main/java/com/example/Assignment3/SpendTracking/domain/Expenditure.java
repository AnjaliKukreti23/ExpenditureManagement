package com.example.Assignment3.SpendTracking.domain;

/* Amount that is spend.

 */

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="expenditure")
public class Expenditure {

    /**
     * The amount that is spent.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;



    @Column(name="amount",nullable=false,updatable=false)
    private BigDecimal amount;

    /**
     * Date on which the amount is spent.
     */
    @Column(name="date",nullable=false,updatable=false)

    @Temporal(TemporalType.DATE)
    private LocalDate date;

    /**
     * Where that amount is spent.
     */
    @Column(name="description",nullable=false,updatable=false)
    private String description;




    Expenditure(){
        super();
    }

    public Expenditure(final BigDecimal amount,final LocalDate date,final String description ){
        this();
        this.amount=amount;
        this.date=date;
        this.description=description;
    }

    public BigDecimal getAmount(){
        return amount;
    }

    public LocalDate getDate(){
        return date;
    }

    public String getDescription(){
        return description;
    }
}
