package com.example.crunchifycalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.crunchifycalculator.R;

import static com.example.crunchifycalculator.R.id.editText;
import static com.example.crunchifycalculator.R.id.text;

public class MainActivity<editText> extends AppCompatActivity {

    Button btnClear, btnCancel,btnper, btndivide,btn7, btn8, btn9, btnmultiply, btn4,btn5,btn6,btnsubstract,btn1,btn2,btn3,btnadd,btn00,btn0,btndot,btnequals;
    TextView editText;

    float mValueOne, mValueTwo;

    boolean mAddition, mSubtract, mMultiplication, mDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0= findViewById(R.id.btn0);
        btn00= findViewById(R.id.btn00);
        btn1= findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3= findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5= findViewById(R.id.btn5);
        btn6= findViewById(R.id.btn6);
        btn7= findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnClear= findViewById(R.id.btnClear);
        btnCancel= findViewById(R.id.btnCancel);
        btnadd= findViewById(R.id.btnadd);
        btnsubstract=findViewById(R.id.btnsubstract);
        btnmultiply= findViewById(R.id.btnmultiply);
        btndivide= findViewById(R.id.btndivide);
        btnper=findViewById(R.id.btnper);
        btnequals=findViewById(R.id.btnequals);
        btndot= findViewById(R.id.btndot);

        editText =findViewById(R.id.editText);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null) {
                    editText.setText("");
                } else {
                    mValueOne = Float.parseFloat(editText.getText() + "");
                    mAddition = true;
                    editText.setText(null);
                }
            }
        });


        btnsubstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                mSubtract = true;
                editText.setText(null);
            }
        });

        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                mMultiplication = true;
                editText.setText(null);
            }
        });

        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(editText.getText() + "");
                mDivision = true;
                editText.setText(null);
            }
        });

        btnequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(editText.getText() + "");

                if (mAddition == true) {
                    editText.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }

                if (mSubtract == true) {
                    editText.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (mMultiplication == true) {
                    editText.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }

                if (mDivision == true) {
                    editText.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });


    }
}