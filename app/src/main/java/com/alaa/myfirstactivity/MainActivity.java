package com.alaa.myfirstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText status,ag,exp;
    TextView shw;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btn = (Button)findViewById(R.id.calc);
       status= (EditText) findViewById(R.id.textM);
        ag = (EditText)  findViewById(R.id.age);
       exp = (EditText) findViewById(R.id.ex);
       shw = (TextView) findViewById(R.id.txt);
       String maritalStatus = status.getText().toString();
       String experience = exp.getText().toString();
       String Agge = ag.getText().toString();
       int expc = Integer.parseInt(exp.getText().toString());
       int agge = Integer.parseInt(Agge);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
         /**  Weird equations but no problem :) **/
           public void onClick(View view) {
               int salary = 0;
               if (maritalStatus.equals("M"))
               {
                   if (expc >= 5)
                   {
                     salary += (agge*10000);
                   }
                   else
                   {
                       salary += (agge*5000);
                   }
               }
               else if (maritalStatus.equals("S"))
               {
                   if (expc >= 5)
                   {
                       salary += (agge * 5000);
                   }
                   else
                   {
                       salary += (agge*2500);
                   }
               }
               shw.setText("Your salary is"+ salary);
           }
       });
    }

}