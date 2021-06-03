package com.example.loginproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText UsernameInput = (EditText) findViewById(R.id.UsernameInput);
        final EditText PasswordInput = (EditText) findViewById(R.id.PasswordInput);
        Button Login = (Button) findViewById(R.id.Login);

        Login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String name = UsernameInput.getText().toString();
            String password = PasswordInput.getText().toString();

            Intent intent= new Intent(getApplicationContext(),LogActivity.class);
            intent.putExtra("UsernameInput",name);
            intent.putExtra("PasswordInput",password);
            startActivity(intent);



           }
        });

    }
}