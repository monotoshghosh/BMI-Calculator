package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //
    EditText weight;
    EditText height;
    TextView result;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        weight=findViewById(R.id.weight);
        height=findViewById(R.id.height);
        result=findViewById(R.id.result);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double w=Double.parseDouble(weight.getText().toString());
                double h=Double.parseDouble(height.getText().toString());
                double res = (w / (h * h));

                result.setText("Your BMI is "+res);

            }
        });


    }
}