package com.example.resept;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText el;
    private EditText el1, el2, el3, el4, el5, el6, resText1;
    private TextView resText2, resText3, resText4, resText5, resText6;
    private Button button_;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListennerOnButton();
    }

    private void addListennerOnButton() {
        el = (EditText)findViewById(R.id.Porsiy);
        el1 = (EditText)findViewById(R.id.Resept1);
        el2 = (EditText)findViewById(R.id.Resept2);
        el3 = (EditText)findViewById(R.id.Resept3);
        el4 = (EditText)findViewById(R.id.Resept4);
        el5 = (EditText)findViewById(R.id.Resept5);
        el6 = (EditText)findViewById(R.id.Resept6);
        resText1 = (EditText)findViewById(R.id.Nado1);
        resText2 = (TextView)findViewById(R.id.Nado2);
        resText3 = (TextView)findViewById(R.id.Nado3);
        resText4 = (TextView)findViewById(R.id.Nado4);
        resText5 = (TextView)findViewById(R.id.Nado5);
        resText6 = (TextView)findViewById(R.id.Nado6);
        button_ = (Button)findViewById(R.id.button);
        button_.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int num = Integer.parseInt((el.getText().toString()));
                        int num1 = Integer.parseInt((el1.getText().toString()));
                        int num2 = Integer.parseInt((el2.getText().toString()));
                        int num3 = Integer.parseInt((el3.getText().toString()));
                        int num4 = Integer.parseInt((el4.getText().toString()));
                        int num5 = Integer.parseInt((el5.getText().toString()));
                        int num6 = Integer.parseInt((el6.getText().toString()));
                        int resProizv1 = num*num1;
                        int resProizv2 = num*num2;
                        int resProizv3 = num*num3;
                        int resProizv4 = num*num4;
                        int resProizv5 = num*num5;
                        int resProizv6 = num*num6;
                        resText1.setText(Integer.toString(resProizv1));
                        resText2.setText(Integer.toString(resProizv2));
                        resText3.setText(Integer.toString(resProizv3));
                        resText4.setText(Integer.toString(resProizv4));
                        resText5.setText(Integer.toString(resProizv5));
                        resText6.setText(Integer.toString(resProizv6));
                    }
                }
        );

    }







































  /*  public void onButtonClick (View v) {
        EditText el = (EditText)findViewById(R.id.Porsiy);
        EditText el1 = (EditText)findViewById(R.id.Resept1);
        EditText el2 = (EditText)findViewById(R.id.Resept2);
        EditText el3 = (EditText)findViewById(R.id.Resept3);
        EditText el4 = (EditText)findViewById(R.id.Resept4);
        EditText el5 = (EditText)findViewById(R.id.Resept5);
        EditText el6 = (EditText)findViewById(R.id.Resept6);

        TextView resText1 = (TextView)findViewById(R.id.Nado1);
        TextView resText2 = (TextView)findViewById(R.id.Nado2);
        TextView resText3 = (TextView)findViewById(R.id.Nado3);
        TextView resText4 = (TextView)findViewById(R.id.Nado4);
        TextView resText5 = (TextView)findViewById(R.id.Nado5);
        TextView resText6 = (TextView)findViewById(R.id.Nado6);

        int num = Integer.parseInt((el.getText().toString()));

        int num1 = Integer.parseInt((el1.getText().toString()));
        int num2 = Integer.parseInt((el2.getText().toString()));
        int num3 = Integer.parseInt((el3.getText().toString()));
        int num4 = Integer.parseInt((el4.getText().toString()));
        int num5 = Integer.parseInt((el5.getText().toString()));
        int num6 = Integer.parseInt((el6.getText().toString()));

        int resProizv1 = num*num1;
        int resProizv2 = num*num2;
        int resProizv3 = num*num3;
        int resProizv4 = num*num4;
        int resProizv5 = num*num5;
        int resProizv6 = num*num6;

        resText1.setText(Integer.toString(resProizv1));
        resText2.setText(Integer.toString(resProizv2));
        resText3.setText(Integer.toString(resProizv3));
        resText4.setText(Integer.toString(resProizv4));
        resText5.setText(Integer.toString(resProizv5));
        resText6.setText(Integer.toString(resProizv6));
    } */
}