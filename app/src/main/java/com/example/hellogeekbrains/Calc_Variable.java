package com.example.hellogeekbrains;


import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.io.Serializable;

public class Calc_Variable extends AppCompatActivity implements Serializable {
//region Buttons

   // EditText text_number = null;




    public EditText getEditText() {
        return editText;
    }

    public void setEditText(EditText editText) {
        this.editText = editText;
    }

    EditText editText = null;
    // кнопки и переменные
    public Button b1;
    public Button b2;
    public Button b3;
    public Button b4;
    public Button b5;
    public Button b6;
    public Button b7;
    public Button b8;
    public Button b9;
    public Button b0 ;
    public Button bPlus;
    public Button bMinus;
    public Button bDele;
    public Button umno;
    public Button ravno ;
    public Button clear;
    public int numberOne;
    public int numberTwo;
    public int operation;
    public  String TextView_One;
    public  String TextView_Two;
    public Switch switch_themeNight;
    public Button theme;
/*

 */
public int calc (){





    return 0;
}


//endregion


        }
        //region    Активация кнопок


        //endregion




 /*text_number = findViewById(R.id.text_number);
         editText = findViewById(R.id.edit_number);
         b0=findViewById(R.id._0);
         b1= findViewById(R.id._1);
         b2 =findViewById(R.id._2);
         b3 =findViewById(R.id._3);
         b4 =findViewById(R.id._4);
         b5 =findViewById(R.id._5);
         b6 =findViewById(R.id._6);
         b7=findViewById(R.id._7);
         b8=findViewById(R.id._8);
         b9=findViewById(R.id._9);
         bPlus =findViewById(R.id.button_plus);
         bMinus=findViewById(R.id.button_minus);
         clear=findViewById(R.id.clear);
         bDele=findViewById(R.id.button_del);
         umno=findViewById(R.id.button_umn);
         ravno = findViewById(R.id.button_ravn);*/