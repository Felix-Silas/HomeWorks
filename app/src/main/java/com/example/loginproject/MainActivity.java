package com.example.loginproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onClick_login(View v) {

        EditText text_id = (EditText) findViewById(R.id.editText_id);
        EditText text_pw = (EditText) findViewById(R.id.editText_pw);
        Button onClick_login = (Button) findViewById(R.id.onClick_login);
        String trfa="true";
        String id = text_id.getText().toString();
        String pw = text_pw.getText().toString();

        if (pw.length() > 7 && pw.length() < 16 && id.length()>0) {

            Intent intent_01 = new Intent(getApplicationContext(), LogActivity.class);

            intent_01.putExtra("입력한 아이디", id);
            intent_01.putExtra("입력한 비밀번호", pw);

            startActivity(intent_01);

        }
        else {
            Toast.makeText(getApplicationContext(),"똑바로 로그인하자...",Toast.LENGTH_LONG).show();
        }
        }
    }
