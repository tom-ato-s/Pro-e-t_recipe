package com.example.tabledenamic;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int indexBegin = 1;
    private int indexEnd = 5;
    private Button btnAdd;
    private TextView index;
    int a, b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        addListennerOnButton();
        init(1, 5);

    }
    public void addListennerOnButton() {
        btnAdd = (Button)findViewById(R.id.btnAddRow);

        btnAdd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        a = indexBegin = indexEnd;
                        b = indexEnd = indexEnd +1;
                        init (a,b);
                    }
                }
        );

    }
    public void init(int indexBegin, int indexEnd) {// сделали нулевую строку таблицы

           TableLayout stk = (TableLayout) findViewById(R.id.table_main);
           TableRow tbrow0 = new TableRow(this);
           TextView tv0 = new TextView(this);
           tv0.setText(".No");
           tv0.setTextColor(Color.WHITE);
           tbrow0.addView(tv0);
           TextView tv1 = new TextView(this);
           tv1.setText("Компонент");
           tv1.setTextColor(Color.WHITE);
           tbrow0.addView(tv1);
           TextView tv2 = new TextView(this);
           tv2.setText("В рецепте");
           tv2.setTextColor(Color.WHITE);
           tbrow0.addView(tv2);
           TextView tv3 = new TextView(this);
           tv3.setText("Надо положить");
           tv3.setTextColor(Color.WHITE);
           tbrow0.addView(tv3);
        if (indexEnd-indexBegin>1 ){
           stk.addView(tbrow0);};

       for (int i = indexBegin; i < indexEnd; i++){
            TableRow tbrow = new TableRow(this);
            EditText t1v = new EditText(this);
            t1v.setText(" " + i);
            t1v.setTextColor(Color.WHITE);
            t1v.setGravity(Gravity.CENTER);
            tbrow.addView(t1v);
            EditText t2v = new EditText(this);
            t2v.setText("");
             t2v.setHint("Компонент");
             t2v.setHintTextColor(Color.GRAY);
            t2v.setTextColor(Color.WHITE);
            t2v.setGravity(Gravity.CENTER);
            tbrow.addView(t2v);
            EditText t3v = new EditText(this);
            t3v.setText("0");
            t3v.setTextColor(Color.WHITE);
            t3v.setGravity(Gravity.CENTER);
            tbrow.addView(t3v);
            TextView t4v = new TextView(this);
            t4v.setText("0");
            t4v.setTextColor(Color.WHITE);
            t4v.setGravity(Gravity.CENTER);
            tbrow.addView(t4v);
            stk.addView(tbrow);

        }

    }



}
