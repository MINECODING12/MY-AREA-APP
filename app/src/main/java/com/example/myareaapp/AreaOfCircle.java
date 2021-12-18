package com.example.myareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class AreaOfCircle extends AppCompatActivity {

    private TextView mAddRadius;
    private TextView mResult;
    private TextView mButtonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areaofcircle);
        mAddRadius = (EditText) findViewById(R.id.editradius);
        mResult=(TextView) findViewById(R.id.result) ;
        mButtonCalculate=(Button) findViewById(R.id.calculate);

        mButtonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                calculates();
            }
        });
    }
    public void calculates()
    {
        Double value1= Double.parseDouble(mAddRadius.getText().toString());
        Double calculateValue =22*(value1*value1)/7;
        mResult.setText(calculateValue.toString());



    }
}