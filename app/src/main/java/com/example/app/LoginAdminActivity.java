package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 *
 */
public class LoginAdminActivity extends AppCompatActivity {

    private Button b;

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);

        b = findViewById(R.id.SignInAdmin);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdminPage();
            }
        });
    }

    /**
     *
     */
    public void openAdminPage(){
        Intent intent = new Intent(this, AdminPageActivity.class);
        startActivity(intent);
    }
}