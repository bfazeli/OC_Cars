package edu.orangecoastcollege.cs273.bfazeli.occars;

/**
 * Car class: Used to Create a Car Object.
 *
 * Created by bijanfazeli on 9/15/16.
 */
public class Car {

    //Private fields
    private static final double TAX_RATE = .08, APR_3_YEARS = .0462, APR_4_YEARS = .0419, APR_5_YEARS = .0416;

    private double mDownPayment;
    private int mLoanTerm;
    private double mPrice;

    /**
     * setDownPayment:  Sets the down payment amount for the current car.
     * @param downPayment:  A down payment to set
     */
    public void setDownPayment(double downPayment) {
        mDownPayment = downPayment;
    }

    /**
     * setLoanTerm: Sets the loan term for the current car.
     * @param loanTerm: A loan term to set
     */
    public void setLoanTerm(int loanTerm) {
        mLoanTerm = loanTerm;
    }

    /**
     * setPrice:    Sets the price.
     * @param price:    A price to set.
     */
    public void setPrice(double price) {
        mPrice = price;
    }

    /**
     * getDownPayment:  Gets the down payment of the current car.
     * @return: The down payment.
     */
    public double getDownPayment() {
        return mDownPayment;
    }

    /**
     * getLoanTerm: Gets the loan term of the current car.
     * @return: The loan term.
     */
    public int getLoanTerm() {
        return mLoanTerm;
    }

    /**
     * getPrice:    Gets the price of the current car.
     * @return: The price of the current car.
     */
    public double getPrice() {
        return mPrice;
    }

    /**
     * calculateBorrowedAmount: Calculates the borrowed amount for the current car.
     * @return: The borrowed amount.
     */
    public double calculateBorrowedAmount () { return calculateTotalCost() - mDownPayment;}

    /**
     * calculateInterestAmount: Calculates the interest amount for the current car
     * @return: The interest amount
     */
    public double calculateInterestAmount () {
        double interestRate;
        if (mLoanTerm == 3) interestRate = APR_3_YEARS;
        else if (mLoanTerm == 4) interestRate = APR_4_YEARS;
        else interestRate = APR_5_YEARS;

        return calculateBorrowedAmount() * interestRate;
    }

    /**
     * calculateMonthlyPayment: Calculates the monthly payment for the current car
     * @return: The monthly payment amount.
     */
    public double calculateMonthlyPayment ()
    { return (calculateBorrowedAmount() + calculateInterestAmount()) / (mLoanTerm * 12); }

    /**
     * calculateTaxAmount:  Calculates the tax amount for the current car.
     * @return: The tax amount for the current car.
     */
    public double calculateTaxAmount() { return  mPrice * TAX_RATE; }

    /**
     * calculateTotalCost:   Calculates the total cost for the current car.
     * @return: The total cost for the current car.
     */
    public double calculateTotalCost() { return mPrice + calculateTaxAmount(); }
}
