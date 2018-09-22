package com.dog.tong2so_anonymous;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText mEdtA, mEdtB;
    private TextView mTvResult;
    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtA = (EditText) findViewById(R.id.edt_a);
        mEdtB = (EditText) findViewById(R.id.edt_b);
        mTvResult = (TextView) findViewById(R.id.tv_result);
        mBtn = (Button) findViewById(R.id.btn);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(mEdtA.getText().toString());
                int b = Integer.parseInt(mEdtB.getText().toString());
                mTvResult.setText("" + (a + b));
            }
        });
    }
}
