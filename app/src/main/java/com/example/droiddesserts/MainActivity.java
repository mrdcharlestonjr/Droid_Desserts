package com.example.droiddesserts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static String MESSAGE = "";

    private String orderMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolBar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolBar);

        ImageView donutImageView = findViewById(R.id.donut_image_view);
        donutImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderMessage = getString(R.string.donut_message);
                displayToast(orderMessage);
                intentToSecondWithMessage();
            }
        });





    }


    private void displayToast(String message) {
        Toast toast = Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT);
        toast.show();
    }

    private void intentToSecondWithMessage(){
        Intent toSecondActivity = new Intent(this,SecondActivity.class);
        toSecondActivity.putExtra(MESSAGE,orderMessage);
        startActivity(toSecondActivity);
    }
}
