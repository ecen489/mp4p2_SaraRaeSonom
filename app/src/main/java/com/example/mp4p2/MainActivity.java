package com.example.mp4p2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mp4p2.R;


public class MainActivity extends AppCompatActivity {


    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    Button buttonPlus, buttonMinus, buttonMult, buttonEq, buttonC, buttonPd;

    TextView tv1, tv2, tvComp;

    float mValueOne, mValueTwo;
    boolean AddBool, SubBool, MultBool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonMult = (Button) findViewById(R.id.buttonMult);
        buttonEq = (Button) findViewById(R.id.buttonEq);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonPd = (Button) findViewById(R.id.buttonPd);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tvComp = (TextView) findViewById(R.id.tvComp);

        tv1.setText("");
        tv2.setText("");
        tvComp.setText("");

        buttonPd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+".");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText(tv1.getText()+"9");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("");
                tv2.setText("");
                tvComp.setText("");
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv1.getText() == "") {
                    tv1.setText("");
                    Toast.makeText(getApplicationContext(), "Please input number",Toast.LENGTH_LONG).show();
                } else {
                    mValueOne = Float.parseFloat(tv1.getText()+"");
                    tv2.setText(tv1.getText()+"");
                    tvComp.setText("+");
                    AddBool = true;
                    tv1.setText(null);
                }
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv1.getText() == ""){
                    tv1.setText("");
                    Toast.makeText(getApplicationContext(), "Please input number",Toast.LENGTH_LONG).show();
                } else {
                    mValueOne = Float.parseFloat(tv1.getText() + "");
                    tv2.setText(tv1.getText() + "");
                    tvComp.setText("-");
                    SubBool = true;
                    tv1.setText(null);
                }
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv1.getText() == "") {
                    tv1.setText("");
                    Toast.makeText(getApplicationContext(), "Please input number",Toast.LENGTH_LONG).show();
                } else {
                    mValueOne = Float.parseFloat(tv1.getText() + "");
                    tv2.setText(tv1.getText() + "");
                    tvComp.setText("*");
                    MultBool = true;
                    tv1.setText(null);
                }
            }
        });

        buttonEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(tv1.getText()+"");
                if (AddBool == true) {
                    tv1.setText(mValueOne + mValueTwo + "");
                    AddBool = false;
                }
                if (SubBool == true) {
                    tv1.setText(mValueOne - mValueTwo + "");
                    SubBool = false;
                }
                if (MultBool == true) {
                    tv1.setText(mValueOne*mValueTwo + "");
                    MultBool = false;
                }
                tv2.setText("");
                tvComp.setText("");
            }
        });
    }
}
