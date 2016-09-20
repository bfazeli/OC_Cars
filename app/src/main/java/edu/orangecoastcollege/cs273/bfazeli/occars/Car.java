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

    public double calculateBorrowedAmount () { return calculateTotalCost() - mDownPayment;}

    public double calculateInterestAmount () {
        double interestRate;
        if (mLoanTerm == 3) interestRate = 0.0462;
        else if (mLoanTerm == 4) interestRate = 0.0416;
        else interestRate = 0.0419;

        return calculateBorrowedAmount() * interestRate;
    }

    public double calculateMonthlyPayment ()
    { return (calculateBorrowedAmount() + calculateInterestAmount()) / (mLoanTerm * 12); }

    public double calculateTaxAmount() { return  mPrice * TAX_RATE; }

    public double calculateTotalCost() { return mPrice * calculateTaxAmount(); }


}
