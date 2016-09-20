package edu.orangecoastcollege.cs273.bfazeli.occars;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by bijanfazeli on 9/15/16.
 */
public class LoanSummaryActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acitivity_summary_loan);

        TextView monthlyPaymentTextView = (TextView) findViewById(R.id.monthlyPaymentTextView);
        TextView loanReportTextView = (TextView) findViewById(R.id.loanReportTextView);

        Intent purchaseIntent = getIntent();

        String monthlyPaymentText = purchaseIntent.getStringExtra("MonthlyPayment");
        String loanReportText = purchaseIntent.getStringExtra("LoanSummary");

        monthlyPaymentTextView.setText(monthlyPaymentText);
        loanReportTextView.setText(loanReportText);
    }

    public void returnToDataEntry(View view) { this.finish(); }
}
