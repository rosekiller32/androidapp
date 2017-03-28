package com.example.yiting.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);

        Button btn1 = (Button) findViewById(R.id.screen2_button12_2);
        btn1.setOnClickListener(listener1);

        Button btn2 = (Button) findViewById(R.id.screen2_button12_3);
        btn2.setOnClickListener(listener2);

        Button btn3 = (Button) findViewById(R.id.screen2_button12_4);
        btn3.setOnClickListener(listener3);

    }

    View.OnClickListener listener1 = new View.OnClickListener(){
        public void onClick(View v){
            EditText screen2_editText2_2 = (EditText) findViewById(R.id.screen2_editText2_2);
            screen2_editText2_2.setText("");

            EditText screen2_editText4_2 = (EditText) findViewById(R.id.screen2_editText4_2);
            screen2_editText4_2.setText("");

            EditText screen2_editText5_2 = (EditText) findViewById(R.id.screen2_editText5_2);
            screen2_editText5_2.setText("");

            EditText screen2_editText6_2 = (EditText) findViewById(R.id.screen2_editText6_2);
            screen2_editText6_2.setText("");

            EditText screen2_editText7_2 = (EditText) findViewById(R.id.screen2_editText7_2);
            screen2_editText7_2.setText("");

            EditText screen2_editText8_2 = (EditText) findViewById(R.id.screen2_editText8_2);
            screen2_editText8_2.setText("");

        }
    };

    View.OnClickListener listener2 = new View.OnClickListener(){
        public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(screen2.this, screen33.class);
            startActivity(intent);
        }
    };

    View.OnClickListener listener3 = new View.OnClickListener(){
        public void onClick(View v){
            Intent intent = new Intent();
            intent.setClass(screen2.this, screen3.class);
            startActivity(intent);
        }
    };
}
