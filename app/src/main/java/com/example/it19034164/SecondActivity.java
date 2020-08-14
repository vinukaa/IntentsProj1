package com.example.it19034164;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText no3,no4;
    String str1,str2;
    Button AB1,SB2,MB3,DB4;
    float res;
    int num1,num2;
    String opr;
    TextView TextV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        no3 = findViewById(R.id.I3);
        no4 = findViewById(R.id.I4);
        AB1 = findViewById(R.id.BT1);
        SB2 = findViewById(R.id.BT2);
        MB3 = findViewById(R.id.BT3);
        DB4 = findViewById(R.id.BT4);
        TextV = findViewById(R.id.Text1);


        str1=(getIntent().getStringExtra("key1"));
        str2=(getIntent().getStringExtra("key2"));

        no3.setText(str1);
        no4.setText(str2);

        AB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(no3.getText().toString());
                num2 = Integer.parseInt(no4.getText().toString());
                opr = "+";
                res = num1+num2;
                TextV.setText(no3.getText().toString()+ " " + opr +" " +no4.getText().toString() +" = "+String.valueOf(res));
            }

        });

        SB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(no3.getText().toString());
                num2 = Integer.parseInt(no4.getText().toString());
                opr = "-";
                res = num1-num2;
                TextV.setText(no3.getText().toString()+ " " + opr +" " +no4.getText().toString() +" = "+String.valueOf(res));
            }

        });

        MB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(no3.getText().toString());
                num2 = Integer.parseInt(no4.getText().toString());
                opr = "*";
                res = num1*num2;
                TextV.setText(no3.getText().toString()+ " " + opr +" " +no4.getText().toString() +" = "+String.valueOf(res));
            }

        });

        DB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(no3.getText().toString());
                num2 = Integer.parseInt(no4.getText().toString());
                opr = "/";
                res = num1/num2;
                TextV.setText(no3.getText().toString()+ " " + opr +" " +no4.getText().toString() +" = "+String.valueOf(res));
            }

        });
    }
}