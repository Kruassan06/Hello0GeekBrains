package com.example.hellogeekbrains;

import android.nfc.Tag;
import android.os.PersistableBundle;
import android.os.TestLooperManager;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//region Buttons
/*
    TextView text_number;
    TextView editText ;//   // TODO: 08.02.2022 потом вот так переделать для красоты.!!!
    public Button nextLayout;   // кнопки и переменные
    public Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0 ;//=findViewById(R.id._0);
    private Button bPlus;
    private Button bMinus;
    private Button bDele;
    private Button umno;
    private Button ravno ;
    private Button clear;
     private int numberOne;
    private int numberTwo;
  public static  String soder = "";
*/

//endregion

public static final String key_one = "key_one";
public static final String key_two = "key_two";
    final String TAG  = "";


    Calc calc = new Calc();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activite_main);

   //region    Активация кнопок
        calc.text_number = findViewById(R.id.text_number);
        calc.editText = findViewById(R.id.edit_text);
        calc.b0=findViewById(R.id._0);
        calc.b1= findViewById(R.id._1);
        calc.b2 =findViewById(R.id._2);
        calc.b3 =findViewById(R.id._3);
        calc.b4 =findViewById(R.id._4);
        calc.b5 =findViewById(R.id._5);
        calc.b6 =findViewById(R.id._6);
        calc.b7=findViewById(R.id._7);
        calc.b8=findViewById(R.id._8);
        calc.b9=findViewById(R.id._9);
        calc.bPlus =findViewById(R.id.button_plus);
        calc.bMinus=findViewById(R.id.button_minus);
        calc.clear=findViewById(R.id.clear);
        calc.bDele=findViewById(R.id.button_del);
        calc.umno=findViewById(R.id.button_umn);
        calc.ravno = findViewById(R.id.button_ravn);


        calc.text_number.setOnClickListener(this);
        calc.b0.setOnClickListener(this);
        calc.b1.setOnClickListener(this);
        calc.b2.setOnClickListener(this);
        calc.b3.setOnClickListener(this);
        calc.b4.setOnClickListener(this);
        calc.b5.setOnClickListener(this);
        calc.b6.setOnClickListener(this);
        calc.b7.setOnClickListener(this);
        calc.b8.setOnClickListener(this);
        calc.b9.setOnClickListener(this);
        calc.bPlus.setOnClickListener(this);
        calc.bMinus.setOnClickListener(this);
        calc.clear.setOnClickListener(this);
        calc.bDele.setOnClickListener(this);
        calc.umno.setOnClickListener(this);
        calc.ravno.setOnClickListener(this);
    //endregion
    }
     //   Log.d(TAG, "onCreate() called with: savedInstanceState = [" + savedInstanceState + "]");

    protected void onResume() {
        super.onResume();
        //calc.editText.append(calc.TextView_One);
    //    calc.text_number.append(calc.TextView_Two);
        Log.d(TAG, "onResume() called");

    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

      //  outState.putString(key_one, calc.editText.getText().toString());   // передаю в перменную String значения EditText
     //    outState.getString(key_two,calc.text_number.getText().toString());  // передаю в перменную String значения TextVeiw


        }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState() called");

   //   calc.editText.setText(savedInstanceState.getString(key_one));
    //    calc.text_number.setText(savedInstanceState.getString(key_two));// восстанавливаю после убитого процесса


    }






    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id._0:
                calc.editText.append(calc.b0.getText());
                break;
           case R.id._1:
               calc.editText.append(calc.b1.getText());

                break;
            case R.id._2:
                calc.editText.append(calc.b2.getText());
                break;
            case R.id._3:
                calc.editText.append(calc.b3.getText());
                break;
            case R.id._4:
                calc.editText.append(calc.b4.getText());
                break;
            case R.id._5:
                calc.editText.append(calc.b5.getText());
                break;
            case R.id._6:
                calc.editText.append(calc.b6.getText());
                break;
            case R.id._7:
                calc.editText.append(calc.b7.getText());
                break;
            case R.id._8:
                calc.editText.append(calc.b8.getText());
                break;
            case R.id._9:
                calc.editText.append(calc.b9.getText());
                break;
            case R.id.button_minus:
                calc.editText.append(calc.bMinus.getText());
                calc.text_number.append(calc.editText.getText());
                calc.editText.setText(null);
                break;
            case R.id.button_ravn:
                calc.editText.append(calc.ravno.getText());
                break;
            case R.id.button_plus:
                calc.editText.append(calc.bPlus.getText());
                calc.text_number.append(calc.editText.getText());
                calc.editText.setText(null);
                    break;
            case R.id.clear:
                calc.text_number.setText(null);
                calc.editText.setText(null);
                break;
            case R.id.button_del:
                calc.editText.append(calc.bDele.getText());
                calc.text_number.append(calc.editText.getText());
                calc.editText.setText(null);
                break;

        }
    }
}



