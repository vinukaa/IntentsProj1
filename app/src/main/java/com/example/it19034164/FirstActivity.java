package com.example.it19034164;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button but;
    EditText no1,no2;
    String str1,str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        no1 = findViewById(R.id.I1);
        no2 = findViewById(R.id.I2);
        but = findViewById(R.id.ok1);
    }

        protected void onResume() {
        super.onResume();
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                str1 = no1.getText().toString();
                str2 = no2.getText().toString();

                intent.putExtra("key1",str1);
                intent.putExtra("key2",str2);
                startActivity(intent);

                Context context = getApplicationContext();
                CharSequence message = "You clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP| Gravity.LEFT,0,0);
                toast.show();


            }
        });
        }
}