package com.example.hellogeekbrains;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class chose_theme extends AppCompatActivity implements View.OnClickListener {
public Button choice_button_light;
    public Button choice_button_night;
    public TextView choice_textView;

    @Override
    public Resources.Theme getTheme() {
       Resources.Theme theme = super.getTheme();
        return super.getTheme();
    }



    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.choice_theme);
        choice_button_light = findViewById(R.id.choice_button_light);
        choice_button_night = findViewById(R.id.choice_button_night);
        choice_textView = findViewById(R.id.choice_textView);

    choice_button_light.setOnClickListener(this);
    choice_button_night.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.choice_button_light:


                // TODO: 20.02.2022  Прописать действие  
                break;
            case R.id.choice_button_night:
                
                
break;
        }


    }
}
