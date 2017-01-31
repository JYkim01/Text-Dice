package com.textdicejskim.textdice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Text_Output_Activity extends AppCompatActivity implements View.OnClickListener {

    private TextView mOutputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text__output_);

        mOutputText = (TextView) findViewById(R.id.output_text);

        Intent intent = getIntent();
        String text = intent.getStringExtra("text");

        mOutputText.setText(text);

        findViewById(R.id.return_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
