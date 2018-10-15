package pl.edu.agh.iisg.to.javafx.cw1.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.math.BigInteger;
import java.time.LocalDate;

public class Transaction {

    private static final String EMPTY = "";

    private LocalDate date;
    private StringProperty payee;
    private Category category;
    private BigInteger inflow;


    private Transaction() {
        this(LocalDate.now(), EMPTY, new Category(EMPTY), BigInteger.ZERO);
    }

    public Transaction(LocalDate date, String payee, Category category, BigInteger inflow) {
        this.date = date;
        this.payee = new SimpleStringProperty(payee;
        this.category = category;
        this.inflow = inflow;
    }

    public final LocalDate getDate() {
        return date;
    }

    public final void setDate(LocalDate date) {
        this.date = date;
    }


    public final String getPayee() {
        return payee.get();
    }

    public final void setPayee(String payee) {
        this.payee.setValue(payee);
    }

    public final StringProperty getPayeeProperty() {
        return payee;
    }

    public final Category getCategory() {
        return category;
    }


    public final void setCategory(Category category) {
        this.category = category;
    }


    public final BigInteger getInflow() {
        return inflow;
    }

    public final void setInflow(BigInteger inflow) {
        this.inflow = inflow;
    }

    public static final Transaction newTransaction() {
        return new Transaction();
    }
}
