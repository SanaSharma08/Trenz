package com.example.trenz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    private Button signUpButton,logInButton,homeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signUpButton=(Button) findViewById(R.id.main_signin_btn);
        logInButton=(Button) findViewById(R.id.main_login_btn);
        homeButton =(Button) findViewById(R.id.home_btn);






        logInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent( MainActivity.this,loginactivity.class);
                startActivity(intent);
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent( MainActivity.this,registerActivity.class);
                startActivity(intent);
            }
        });

    }

}