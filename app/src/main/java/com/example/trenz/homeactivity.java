package com.example.trenz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homeactivity extends AppCompatActivity
{
    private Button clothButton,accButton,shoeButton,bagButton,freshButton,seasonButton,litButton,trendButton,boldButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);
        clothButton =(Button) findViewById(R.id.clothing);
        accButton =(Button) findViewById(R.id.acc);
        shoeButton =(Button) findViewById(R.id.shoes);
        bagButton =(Button) findViewById(R.id.Bags);
        freshButton =(Button) findViewById(R.id.home_farrival);
        seasonButton =(Button) findViewById(R.id.seasonal);
        litButton =(Button) findViewById(R.id.lit);
        trendButton =(Button) findViewById(R.id.trend);
        boldButton=(Button) findViewById(R.id.bold_outfit);
        clothButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent( homeactivity.this,cloths.class);
                startActivity(intent);
            }
        });
        accButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent( homeactivity.this,accsessories.class);
                startActivity(intent);
            }
        });
        shoeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent( homeactivity.this,shoes.class);
                startActivity(intent);
            }
        });
        bagButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent( homeactivity.this,bags.class);
                startActivity(intent);
            }
        });
        freshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent( homeactivity.this,fresharrival.class);
                startActivity(intent);
            }
        });
        seasonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent( homeactivity.this,seasonall.class);
                startActivity(intent);
            }
        });
        litButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent( homeactivity.this,lit.class);
                startActivity(intent);
            }
        });
        trendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent( homeactivity.this,trend.class);
                startActivity(intent);
            }
        });
        boldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent( homeactivity.this,bold.class);
                startActivity(intent);
            }
        });



    }
}