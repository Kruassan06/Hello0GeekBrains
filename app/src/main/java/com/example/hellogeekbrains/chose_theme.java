package com.example.hellogeekbrains;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class chose_theme extends AppCompatActivity {
public Button choice_button_light;
    public Button choice_button_night;
    public TextView choice_textView;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.choice_theme);
choice_button_light = findViewById(R.id.choice_button_light);
        choice_button_night = findViewById(R.id.choice_button_night);
        choice_textView = findViewById(R.id.choice_textView);

    }
}
