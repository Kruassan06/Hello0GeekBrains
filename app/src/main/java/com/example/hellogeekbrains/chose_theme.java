package com.example.hellogeekbrains;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class chose_theme extends AppCompatActivity implements View.OnClickListener {
    private static final String PREF_NAME = "PREF_NAME1";
    private static final String PREF_NAME_KEY = "PREF_NAME_KEY";
    public RadioButton choice_button_light;
    public RadioButton choice_button_night;
//
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
setAppTheme(getAppTheme());
        setContentView(R.layout.choice_theme);
        choice_button_light = findViewById(R.id.choice_button_light);
        choice_button_night = findViewById(R.id.choice_button_night);
    choice_button_light.setOnClickListener(this);
    choice_button_night.setOnClickListener(this); }
    @Override
    public void onClick(View v) {
        switch (v.getId()){ case R.id.choice_button_light:
            setAppTheme(R.style.Theme_Vaz_2106);
            case R.id.choice_button_night:
                setAppTheme(R.style.Theme_Vaz_21099);
break; }
Intent choice_themes = new Intent(chose_theme.this, MainActivity.class);
        choice_themes.putExtra(MainActivity.key_two,getAppTheme());
chose_theme.this.setResult(RESULT_OK,choice_themes);
finish();
    }
    public void setAppTheme(int theme){
        SharedPreferences sharedPreferences = getSharedPreferences(PREF_NAME,MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putInt(PREF_NAME_KEY,theme);
        editor.apply();
    }
    public int getAppTheme(){
        SharedPreferences sharedPreferences = getSharedPreferences(PREF_NAME,MODE_PRIVATE);
return sharedPreferences.getInt(PREF_NAME_KEY,R.style.Theme_Vaz_2106);
    }


}
