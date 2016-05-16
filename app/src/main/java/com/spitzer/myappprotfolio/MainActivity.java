package com.spitzer.myappprotfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setVies();
    }

    private void setVies() {

        Button buttonBigger = (Button) findViewById(R.id.button_bigger);
        Button buttonPopular = (Button) findViewById(R.id.button_movies);
        Button buttonStock = (Button) findViewById(R.id.button_stock);
        Button buttonMaterial = (Button) findViewById(R.id.app_material);
        Button buttonUbiquitous = (Button) findViewById(R.id.button_ubiquitous);
        Button buttonCapstone = (Button) findViewById(R.id.button_capstone);

        buttonBigger.setBackgroundColor(getResources().getColor(android.R.color.background_light));
        buttonPopular.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        buttonStock.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
        buttonMaterial.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_dark));
        buttonUbiquitous.setBackgroundColor(getResources().getColor(android.R.color.secondary_text_dark));
        buttonCapstone.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));

        buttonBigger.setOnClickListener(this);
        buttonPopular.setOnClickListener(this);
        buttonStock.setOnClickListener(this);
        buttonMaterial.setOnClickListener(this);
        buttonUbiquitous.setOnClickListener(this);
        buttonCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_bigger:
                Toast.makeText(this, "This Button will launch my Build it Bigger app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_movies:
                Toast.makeText(this, "This Button will launch my Popular Movies app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_stock:
                Toast.makeText(this, "This Button will launch my Stock Hawk app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.app_material:
                Toast.makeText(this, "This Button will launch my Make Your App Material app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_ubiquitous:
                Toast.makeText(this, "This Button will launch my Go Ubiquitous app", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_capstone:
                Toast.makeText(this, "This Button will launch my Capstone app", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
    }
}
