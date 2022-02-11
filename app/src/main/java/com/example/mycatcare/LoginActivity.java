package com.example.mycatcare;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    String username = "guest";
    String password = "guest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_activity);

        final EditText txtUser = findViewById(R.id.txtUser);
        final EditText txtPass = findViewById(R.id.txtPass);
        Button login = findViewById(R.id.login);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtUser.getText().toString().equalsIgnoreCase(username) && txtPass.getText().toString().equalsIgnoreCase(password)) {
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                } else {
                    Toast.makeText(LoginActivity.this, "Username/Password Salah", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
