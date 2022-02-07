package com.example.hellogeekbrains;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button nextLayout;   // кнопки
   // private Button backLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextLayout = findViewById(R.id.nextLayout);
       // backLayout = findViewById(R.id.back_Layout);
nextLayout.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {   // процедура переключает между основным и второстепенным
switch (v.getId()){
    case R.id.nextLayout:
        setContentView(R.layout.liner_calc);

        break;



}



        }
    }
