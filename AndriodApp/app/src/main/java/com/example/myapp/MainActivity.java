package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView sa,sb;
    Button b1,b2,b3,b4;
    RadioGroup rg;
    int scorea=0;
    int scoreb=0;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.inca);
        b2=(Button) findViewById(R.id.deca);
        b3=(Button)findViewById(R.id.incb);
        b4=(Button)findViewById(R.id.decb);
        sa=(TextView)findViewById(R.id.sra);
        sb=(TextView)findViewById(R.id.srb);
        rg=(RadioGroup)findViewById(R.id.radioGroup);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)rg.findViewById(i);
                int sc=Integer.parseInt(rb.getText().toString());
                scorea+=sc;
                sa.setText("score a "+scorea);
            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)rg.findViewById(i);
                int sc=Integer.parseInt(rb.getText().toString());
                if(scorea<=0) {
                   sa.setText("0");
                }
                else {
                    scorea -= sc;
                    if(scorea<=0)
                    {
                        sa.setText("0");
                    }
                    else {
                        sa.setText("score a " + scorea);
                    }
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)rg.findViewById(i);
                int sc=Integer.parseInt(rb.getText().toString());
                scoreb+=sc;
                sb.setText("score b "+scoreb);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)rg.findViewById(i);
                int sc=Integer.parseInt(rb.getText().toString());
                if(scoreb<=0) {
                    sb.setText("0");
                }
                else {
                    scoreb -= sc;
                    if(scoreb<=0)
                    {
                        sb.setText("0");
                    }
                    else {
                        sb.setText("score b " + scoreb);
                    }
                }
            }
        });



    }
}