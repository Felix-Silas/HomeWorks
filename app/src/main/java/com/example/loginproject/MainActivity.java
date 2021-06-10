package com.example.loginproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText text_id = (EditText) findViewById(R.id.editText_id);
        EditText text_pw = (EditText) findViewById(R.id.editText_pw);
        Button Button_login = (Button) findViewById(R.id.Button_login);
        final TextView Button_show = (TextView) findViewById(R.id.Button_show);
        final int[] num = {0};
        final int TYPE_TEXT_VARIATION_PASSWORD= 0x00000091;
        final int TYPE_TEXT_VARIATION_VISIBLE_PASSWORD = 0x00000081;

        Button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {

                    String id = text_id.getText().toString();
                    String pw = text_pw.getText().toString();

                    if (pw.length() > 7 && pw.length() < 16 && id.length() > 0) {
                        Intent intent_01 = new Intent(getApplicationContext(), LogActivity.class);
                        intent_01.putExtra("입력한 아이디", id);
                        intent_01.putExtra("입력한 비밀번호", pw);

                        startActivity(intent_01);

                    } else {
                        Toast.makeText(getApplicationContext(), "똑바로 로그인하자...", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        Button_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int i = num[0]++;
                if(i%2==0){
                    Button_show.setText("Hide");
                    text_pw.setInputType(TYPE_TEXT_VARIATION_PASSWORD);
                }
                else{
                    Button_show.setText("Show");
                    text_pw.setInputType(TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                }

            }
        });
    }

}



