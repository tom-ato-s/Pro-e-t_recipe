package com.example.resept;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick (View v) {
        EditText el1 = (EditText)findViewById(R.id.Porsiy);
        EditText el2 = (EditText)findViewById(R.id.Resept1);
        TextView resText1 = (TextView)findViewById(R.id.Nado1);

        int num1 = Integer.parseInt((el1.getText().toString()));
        int num2 = Integer.parseInt((el2.getText().toString()));
        int resProizv1 = num1*num2;
        resText1.setText(Integer.toString(resProizv1));
    }
}