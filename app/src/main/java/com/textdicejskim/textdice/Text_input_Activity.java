package com.textdicejskim.textdice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Random;

public class Text_input_Activity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<EditText> mInPut = new ArrayList<>();

    private EditText mInput1;
    private EditText mInput2;
    private EditText mInput3;
    private EditText mInput4;
    private EditText mInput5;
    private EditText mInput6;
    private EditText mInput7;
    private EditText mInput8;
    private EditText mInput9;
    private EditText mInput10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_input);

        mInput1 = (EditText) findViewById(R.id.input_1);
        mInput2 = (EditText) findViewById(R.id.input_2);
        mInput3 = (EditText) findViewById(R.id.input_3);
        mInput4 = (EditText) findViewById(R.id.input_4);
        mInput5 = (EditText) findViewById(R.id.input_5);
        mInput6 = (EditText) findViewById(R.id.input_6);
        mInput7 = (EditText) findViewById(R.id.input_7);
        mInput8 = (EditText) findViewById(R.id.input_8);
        mInput9 = (EditText) findViewById(R.id.input_9);
        mInput10 = (EditText) findViewById(R.id.input_10);

        findViewById(R.id.output_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.output_button :


        }
    }
    public static String random () {
        Random outRandom = new Random();
        int numR = outRandom.nextInt(10)
    }
}