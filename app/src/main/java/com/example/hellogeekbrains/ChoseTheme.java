package com.example.hellogeekbrains;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;


public class ChoseTheme extends AppCompatActivity implements View.OnClickListener {
    static final int ThemeOne = 1;
    static final int ThemeSecond = 2;
    private static final String PREF_NAME = "key_preference";
    private static final String PREF_NAME_KEY = "key_preference_theme";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setAppTheme(getAppTheme());
        setContentView(R.layout.choice_theme);
        init();


    }

    private void init() {
        RadioButton choice_button_light = findViewById(R.id.choice_button_light);
        RadioButton choice_button_night;
        choice_button_night = findViewById(R.id.choice_button_night);
        choice_button_light.setOnClickListener(this);
        choice_button_night.setOnClickListener(this);
        switch (getAppTheme()) {
            case 1:
                choice_button_light.setChecked(true);
                break;
            case 2:
                choice_button_night.setChecked(true);
                break;
        }


    }

    @Override
    public void onClick(View v) {  // TODO: 27.02.2022  добавил перменные, изменил слегка код 
        switch (v.getId()) {
            case R.id.choice_button_light: // TODO: 27.02.2022 пользуюсь пока подсказками .
                setAppTheme(R.style.Theme_TWO);

break;
            case R.id.choice_button_night:
                setAppTheme(R.style.Theme_ONE);
                break;
        }

//  передача из этой активити в основную
        Intent choice_themes = new Intent(ChoseTheme.this, MainActivity.class);
        choice_themes.putExtra(MainActivity.KEY_INTENT_THEME_FROM_SECOUND_TO_MAIN, getAppTheme());
        ChoseTheme.this.setResult(RESULT_OK, choice_themes);
        finish();
    }


    private void setAppTheme(int codeStyle) {
        SharedPreferences sharedPreferences = getSharedPreferences(MainActivity.PREF_NAME1, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(MainActivity.PREF_NAME_KEY1, codeStyle);
        editor.apply();
    }

    private int getAppTheme() {
        SharedPreferences sharedPreferences = getSharedPreferences(PREF_NAME, MODE_PRIVATE);
        return sharedPreferences.getInt(PREF_NAME_KEY, R.style.Theme_TWO);
    }


}
