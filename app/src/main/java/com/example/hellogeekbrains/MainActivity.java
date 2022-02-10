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
  private String soder;


//endregion

final String TAG  = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   //region    Активация кнопок
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
       ravno = findViewById(R.id.button_ravn);
        nextLayout = findViewById(R.id.nextLayout);
b0.setOnClickListener(this);
b1.setOnClickListener(this);
b2.setOnClickListener(this);
b3.setOnClickListener(this);
b4.setOnClickListener(this);
b5.setOnClickListener(this);
b6.setOnClickListener(this);
b7.setOnClickListener(this);
b8.setOnClickListener(this);
b9.setOnClickListener(this);
bPlus.setOnClickListener(this);
bMinus.setOnClickListener(this);
clear.setOnClickListener(this);
bDele.setOnClickListener(this);
umno.setOnClickListener(this);
ravno.setOnClickListener(this);


    //endregion


        Log.d(TAG, "onCreate() called with: savedInstanceState = [" + savedInstanceState + "]");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart() called");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id._0:
                editText.append(b0.getText());
                break;
           case R.id._1:
               editText.append(b1.getText());

                break;
            case R.id._2:
                editText.append(b2.getText());
                break;
            case R.id._3:
                editText.append(b3.getText());
                break;
            case R.id._4:
                editText.append(b4.getText());
                break;
            case R.id._5:
                editText.append(b5.getText());
                break;
            case R.id._6:
                editText.append(b6.getText());
                break;
            case R.id._7:
                editText.append(b7.getText());
                break;
            case R.id._8:
                editText.append(b8.getText());
                break;
            case R.id._9:
                editText.append(b9.getText());
                break;
            case R.id.button_minus:
                numberOne = Integer.parseInt(String.valueOf(editText.getText()));

                editText.append(bMinus.getText());
                break;
            case R.id.button_ravn:
                numberTwo = Integer.parseInt(String.valueOf(editText.getText()));
                editText.append(ravno.getText());
                break;

            case R.id.button_plus:
              numberOne = Integer.parseInt(String.valueOf(editText.getText()));

                editText.append(bPlus.getText());
                editText.setText("");
                    break;
            case R.id.clear:
                editText.setText("");
                break;

            case R.id.button_del:
                numberOne = Integer.parseInt(String.valueOf(editText.getText()));

                editText.append(bDele.getText());


                break;

        }


    }

    public void Calcul (){
        if (editText != null
        ){


        }
    }

}



