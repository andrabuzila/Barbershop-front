package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 *
 */
public class UserActivity extends AppCompatActivity {

    Button view, appointment, order;

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        view = findViewById(R.id.ViewBarbers);
        appointment = findViewById(R.id.Appointment);
        order = findViewById(R.id.Order);

        view.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserActivity.this, ViewBarbersActivity.class));
            }
        });

        appointment.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserActivity.this, AppointmentActivity.class));
            }
        });

        order.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserActivity.this, OrderActivity.class));
            }
        });
    }
}