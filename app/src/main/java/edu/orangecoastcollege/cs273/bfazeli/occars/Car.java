package edu.orangecoastcollege.cs273.bfazeli.occars;

/**
 * Created by bijanfazeli on 9/15/16.
 */
public class Car {

    private static final double TAX_RATE = .08;

    private double mDownPayment;
    private int mLoanTerm;
    private double mPrice;

    public void setDownPayment(double downPayment) {
        mDownPayment = downPayment;
    }

    public void setLoanTerm(int loanTerm) {
        mLoanTerm = loanTerm;
    }

    public void setPrice(double price) {
        mPrice = price;
    }

    public double getDownPayment() {
        return mDownPayment;
    }

    public int getLoanTerm() {
        return mLoanTerm;
    }

    public double getPrice() {
        return mPrice;
    }

    public double calculateBorrowedAmount ()
    {

    }

    public double calculateInterestAmount () {

    }

    public double calculateMonthlyPayment () {

    }

    public double calculateTaxAmount() {

    }

    public double calculateTotalCost() {

    }


}
