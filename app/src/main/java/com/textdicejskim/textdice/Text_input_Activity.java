package com.textdicejskim.textdice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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

    ArrayList<EditText> mEditTextList;
    ArrayList<EditText> mInPut;

    public Text_input_Activity() {
        this.mInPut = new ArrayList<>();
        mEditTextList = new ArrayList<>();
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

        mEditTextList.add(mInput1);
        mEditTextList.add(mInput2);
        mEditTextList.add(mInput3);
        mEditTextList.add(mInput4);
        mEditTextList.add(mInput5);
        mEditTextList.add(mInput6);
        mEditTextList.add(mInput7);
        mEditTextList.add(mInput8);
        mEditTextList.add(mInput9);
        mEditTextList.add(mInput10);

        findViewById(R.id.output_button).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.output_button:
                for (EditText editText : mEditTextList) {
                    if (TextUtils.isEmpty(editText.getText().toString())) {
                        Toast.makeText(this, "입력해주세요.", Toast.LENGTH_SHORT).show();
                        return;
                    }
                }
                isRandom();
                Intent intent = new Intent(this, Text_Output_Activity.class);
                intent.putExtra("result", mInPut.get(0).getText().toString());
                finish();
                startActivity(intent);
        }
    }


    private void isRandom() {
        for (EditText editText : mEditTextList) {
            if (!TextUtils.isEmpty(editText.getText().toString())) {
                mInPut.add(editText);
            }
        }
        Collections.shuffle(mInPut);
    }
}