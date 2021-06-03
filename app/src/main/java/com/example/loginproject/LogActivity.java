package com.example.loginproject;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class LogActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView UsernameInput = (TextView)findViewById(R.id.UsernameInput);
        TextView PasswordInput = (TextView)findViewById(R.id.PasswordInput);
        Intent intent = getIntent();
        UsernameInput.setText(intent.getStringExtra("UsernameInput".toString()));
        PasswordInput.setText(intent.getStringExtra("PasswordInput".toString()));




    }
}