package com.codingelab.Final_Abdul;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PHPmainActivity extends AppCompatActivity {

    private Button insert;

    private Button showData;

    private Button btnUpdate;

    private Button btnSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phpmain);

        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        ////////////////////////////////////////////////////////////////////////////////////////////
        // زر الإدخال

        this.insert = (Button) findViewById(R.id.insertdata);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent updateStudent = new Intent(PHPmainActivity.this, phpdbActivity.class);
                startActivity(updateStudent);
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////
        this.showData = (Button) findViewById(R.id.showData);
        showData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent show = new Intent(PHPmainActivity.this, ListviewActivity.class);
                startActivity(show);
            }
        });

// زر التعديل، يفتح قائمة بالبيانات، بعد الضغط علي أي صف، يفتح شاشة التعديل

        this.btnUpdate = (Button) findViewById(R.id.btnUpdate);
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent update = new Intent(PHPmainActivity.this, Listviewupdatephp.class);
                startActivity(update);
            }
        });


        this.btnSearch = (Button) findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Search = new Intent(PHPmainActivity.this, Searchphp.class);
                startActivity(Search);
            }
        });
    }
}
