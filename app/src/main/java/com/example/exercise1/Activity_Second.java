package com.example.exercise1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public  class Activity_Second extends AppCompatActivity{

    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txEmail = findViewById(R.id.emailField);
        txPassword = findViewById(R.id.passwordField);


        Bundle bundle = getIntent().getExtras();


        String email = bundle.getString("a");
        String pass = bundle.getString("b");

        // menampilkan value
        txEmail.setText(email);
        txPassword.setText(pass);
    }
}