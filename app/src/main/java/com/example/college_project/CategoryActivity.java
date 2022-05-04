package com.example.college_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class CategoryActivity extends AppCompatActivity {
    ImageView backBtn;
    Button seeAll;
    RelativeLayout hello;
    ImageView back_pressed;
    RelativeLayout hello2;
    RelativeLayout hello3;
    RelativeLayout hello4;
    RelativeLayout hello5;
    RelativeLayout hello6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        hello = findViewById(R.id.hello);
        hello2 = findViewById(R.id.hello2);
        hello3 = findViewById(R.id.hello3);
        hello4 = findViewById(R.id.hello4);
        hello5 = findViewById(R.id.hello5);
        hello6 = findViewById(R.id.hello6);
        back_pressed = findViewById(R.id.back_pressed);
        seeAll = findViewById(R.id.seeAll);

        back_pressed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this,DashboardActivity.class);
                startActivity(intent);
            }
        });
        hello2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this ,DashboardActivity1.class);
                startActivity(intent);
            }
        });
        hello3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this,DashboardActivity2.class);
                startActivity(intent);
            }
        });
        hello4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this,DashboardActivity3.class);
                startActivity(intent);
            }
        });
        hello5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this,DashboardActivity4.class);
                startActivity(intent);
            }
        });
        hello6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this,DashboardActivity5.class);
                startActivity(intent);
            }
        });

        backBtn = findViewById(R.id.back_pressed);
        seeAll = findViewById(R.id.seeAll);
        seeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this,DashboardActivity.class);
                startActivity(intent);
            }
        });
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}