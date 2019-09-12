package com.example.droiddesserts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView orderReceived = findViewById(R.id.order_received_text_view);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.MESSAGE);
        orderReceived.setText(message);


    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton)view).isChecked();

        switch (view.getId()) {

            case R.id.same_day: if (checked) {

            }



        }

    }
}
