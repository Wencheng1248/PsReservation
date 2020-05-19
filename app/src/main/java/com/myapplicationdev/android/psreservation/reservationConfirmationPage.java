package com.myapplicationdev.android.psreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class reservationConfirmationPage extends AppCompatActivity {
CheckBox cbEnabled;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_confirmation_page);
        // Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();
        // Get the String array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");
        // Get the TextView object
        TextView tvName = findViewById(R.id.textViewDisplayGetName);
        TextView tvPax = findViewById(R.id.textViewDisplayPax);
        TextView tvNumber = findViewById(R.id.textViewDisplayGetNumber);
        TextView tvDate = findViewById(R.id.textViewGetDisplayDate);
        TextView tvTime = findViewById(R.id.textViewGetDisplayTime);
        cbEnabled = findViewById(R.id.checkBox);
        Button btnConfirm = findViewById(R.id.buttonConfirm);

        // Display the name and age on the TextView
        tvName.setText(info[0]);
        tvPax.setText(info[1]);
        tvNumber.setText(info[2]);
        tvDate.setText(info[3]);
        tvTime.setText(info[4]);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbEnabled.isChecked()){

                    Toast.makeText(reservationConfirmationPage.this,"Reservation Confirmed",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(reservationConfirmationPage.this,"Reservation cancelled",Toast.LENGTH_LONG).show();
                }

            }
        });

    }


    }

