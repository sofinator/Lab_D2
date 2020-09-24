package ca.yorku.lab_d2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EntryForm extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mortgage_layout);
    }

    public void buttonClick(View v) {
        EditText principleView = (EditText) findViewById(R.id.principleBox);
        String pS= principleView.getText().toString();
        EditText amortView = (EditText) findViewById(R.id.amortBox);
        String aS= amortView.getText().toString();
        EditText interestView = (EditText) findViewById(R.id.interestBox);
        String iS= principleView.getText().toString();

        MortgageModel myModel = new MortgageModel(pS,aS,iS);
        myModel.computePayment();
    }
}
