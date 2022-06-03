package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 *
 */
public class MainActivity extends AppCompatActivity {

    private Button b;
    private Button b1;
    private Button b2;

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = findViewById(R.id.SignIn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUserPage();
            }
        });

        b1 = findViewById(R.id.Admin);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdminLogin();
            }
        });

        b2 = findViewById(R.id.SignUp);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUp();
            }
        });
    }

    /**
     *
     */
    public void openUserPage(){
        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
    }

    /**
     *
     */
    public void openAdminLogin(){
        Intent intent = new Intent(this, LoginAdminActivity.class);
        startActivity(intent);
    }

    /**
     *
     */
    public void openSignUp(){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}