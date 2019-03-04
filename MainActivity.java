package com.example.ece387app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text_ECE387;
    private Button button_ECE387;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_ECE387 = (TextView)findViewById(R.id.text_ECE387);
        button_ECE387 = (Button)findViewById(R.id.button_ECE387);
        button_ECE387.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_ECE387.setText("My Name is Haixu Dong");
                text_ECE387.setTextSize(50);
            }
        });
    }
}
