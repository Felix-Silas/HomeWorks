package com.example.loginproject;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Button;
import android.view.View;

public class LogActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button Button_back = (Button)findViewById(R.id.Button_back);
        TextView textView_id = (TextView)findViewById(R.id.textView_id);
        TextView textView_pw = (TextView)findViewById(R.id.textView_pw);

        Intent intent_01 = getIntent();

        String id = intent_01.getStringExtra("입력한 아이디");
        String pw = intent_01.getStringExtra("입력한 비밀번호");

        textView_id.setText(String.valueOf(id));
        textView_pw.setText(String.valueOf(pw));

        Button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}