package com.textdicejskim.textdice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Collections;

public class Text_input_Activity extends AppCompatActivity implements View.OnClickListener {

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

    ArrayList<EditText> mInPut;

    public Text_input_Activity() {
        this.mInPut = new ArrayList<>();
    }

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
            case R.id.output_button:
                Intent intent = new Intent(this, Text_Output_Activity.class);
                intent.putExtra("result",mInPut);
                startActivity(intent);
        }
    }
    private void random() {
        mInPut.add(mInput1); mInPut.add(mInput2); mInPut.add(mInput3);
        mInPut.add(mInput4); mInPut.add(mInput5); mInPut.add(mInput6);
        mInPut.add(mInput7); mInPut.add(mInput8); mInPut.add(mInput9);
        mInPut.add(mInput10);

        Collections.shuffle(mInPut);
        return;
    }
}