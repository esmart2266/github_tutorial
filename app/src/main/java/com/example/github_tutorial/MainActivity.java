package com.example.github_tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getdata();
        login();
        roshan();
    }

    public void getdata() {
        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
    }

    public void login(){
        Toast.makeText(this, "Please Login", Toast.LENGTH_SHORT).show();
    }

    public void roshan(){
        Toast.makeText(this, "Roshan", Toast.LENGTH_SHORT).show();
    }
}