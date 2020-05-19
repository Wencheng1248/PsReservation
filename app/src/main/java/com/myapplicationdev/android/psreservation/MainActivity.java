package com.myapplicationdev.android.psreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
Button btnReset;
Button btnMakeReservation;
EditText name;
EditText pax;
EditText phoneNum;
DatePicker dp;
TimePicker tp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnReset = findViewById(R.id.buttonReset);
        btnMakeReservation = findViewById(R.id.buttonReservation);
        name = findViewById(R.id.editTextName);
        pax = findViewById(R.id.editTextPax);
        phoneNum = findViewById(R.id.editTextPhone);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);

        btnMakeReservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String time = "Time is " + tp.getCurrentHour() + ":" + tp.getCurrentMinute() ;
                String date = "Date is: " + dp.getDayOfMonth() + "/" + (dp.getMonth()+1) +"/"+dp.getYear();


                String[] info ={name.getText().toString(),
                        pax.getText().toString(),
                        phoneNum.getText().toString(),
                       date,time

                };
                //Create an intent to start another activity

                Intent i = new Intent (MainActivity.this,reservationConfirmationPage.class);
                //Pass the string of array holding all the values over
                i.putExtra("info",info);
                //start the new activity
                startActivity(i);


            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            name.setText("");
            phoneNum.setText("");
            pax.setText("");

            }
        });
    }
}
