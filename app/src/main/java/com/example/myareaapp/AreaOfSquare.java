package com.example.myareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AreaOfSquare extends AppCompatActivity {

    EditText mEditLength;
    TextView mTextResult;
    Button mButtonCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areaofsquare);
        mEditLength=(EditText) findViewById(R.id.editLength);
        mTextResult=(TextView) findViewById(R.id.result) ;
        mButtonCount=(Button) findViewById(R.id.calculate);

        mButtonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                calculates();
            }
        });
    }
    public void calculates()
    {
        Double value1= Double.parseDouble(mEditLength.getText().toString());
        Double calculateValue = value1*value1;
        mTextResult.setText(calculateValue.toString());
    }
}