package com.example.hellogeekbrains;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


public static final String key_one = "key_one";
public static final String key_two = "key_two";
    private static final String PREF_NAME = "PREF_NAME1";
    private static final String PREF_NAME_KEY = "PREF_NAME_KEY";
    private static final int REQEST_CODE = 0;

    final String TAG  = "";


    Calc_Variable calc = new Calc_Variable();

    @Override
    protected void onRestart() {
        super.onRestart();
        recreate();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences sharedPreferences = getSharedPreferences(PREF_NAME, MODE_PRIVATE);
      setTheme(getAppTheme());
        //  setTheme(sharedPreferences.getInt(PREF_NAME1, R.style.Theme_HelloGeekBrains));
        setContentView(R.layout.activite_main);

   //region    Активация кнопок
       // calc.text_number = findViewById(R.id.text_number);
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
        calc.theme = findViewById(R.id.choice_button);
        calc.switch_themeNight = findViewById(R.id.switch_themeNight);
     //   calc.switch_themeNight = findViewById(R.id.switch_themeNight);

//        calc.switch_themeNight.setOnClickListener(this);
       // calc.text_number.setOnClickListener(this);
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
        calc.theme.setOnClickListener(this);
       calc.switch_themeNight.setOnClickListener(this);

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

     outState.putString(key_one, calc.editText.getText().toString());

        }
    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState() called");

        //calc.text_number.setText(savedInstanceState.getString(key_two));// восстанавливаю после убитого процесса
     calc.editText.setText(savedInstanceState.getString(key_one));


    }

public void startActivity (){
        Intent intent = new Intent(MainActivity.this, chose_theme.class);
        //startActivity(intent);
    startActivityForResult(intent,REQEST_CODE);
    }
public void two_calc (){
        Intent inten_two_calc = new Intent(MainActivity.this,Calctwo_Activity.class);
        startActivity(inten_two_calc);

}
    public int getAppTheme() {
        SharedPreferences sharedPreferences = getSharedPreferences(PREF_NAME, MODE_PRIVATE);
        return sharedPreferences.getInt(PREF_NAME_KEY, R.style.Theme_HelloGeekBrains);

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
            case R.id._5: calc.editText.append(calc.b5.getText());break;
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
                calc.numberOne = Integer.parseInt(calc.editText.getText().toString());
                calc.operation = 1;
                calc.editText.setText(null);
                break;

            case R.id.button_umn:
                calc.numberOne = Integer.parseInt(calc.editText.getText().toString());
                calc.operation = 0;
                calc.editText.setText("");
                break;
            case R.id.button_plus:
                calc.numberOne = Integer.parseInt(calc.editText.getText().toString());
                calc.operation = 2;
                    calc.editText.setText("");
                    break;
            case R.id.clear:

                calc.editText.setText(null);
                break;
            case R.id.button_del:
                calc.operation = 3;
                calc.editText.setText(null);
                break;
            case R.id.button_ravn:
                calc.numberTwo = Integer.parseInt(calc.editText.getText().toString());
                calc(calc.numberOne,calc.numberTwo);

                break;
            case R.id.choice_button:
                startActivity();


                break;
            case R.id.switch_themeNight:
                    two_calc();
                if (calc.switch_themeNight != null) {

                    calc.switch_themeNight.setChecked(false);
                }
break;
        }


    }

    public int calc ( int number, int numberTwo){
switch (calc.operation){
    case 0:
        number = number * numberTwo;
        calc.editText.setText(String.format(String.valueOf(number), numberTwo));
        break;
    case 1:
        number = number - numberTwo;
        calc.editText.setText(String.format(String.valueOf(number), numberTwo));
        break;
    case 2:
        number = number + numberTwo;
        calc.editText.setText(String.format(String.valueOf(number), numberTwo));
        break;
    case 3:
        number = number / numberTwo;
        calc.editText.setText(String.format(String.valueOf(number), numberTwo));
        break;
    case 4:
        break;
}
        return 0;

    }
//что-то не так с кодом РАЗОБРАТЬСЯ

    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
Intent choice = new Intent (MainActivity.this, chose_theme.class);
//startActivityForResult(choice,requestCode);
        super.startActivityForResult(intent, requestCode);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
if (requestCode==REQEST_CODE&&resultCode==RESULT_OK){
    if (data.getExtras()!=null ){
data.getIntExtra(key_two,R.style.Theme_Vaz_2106);

    }
    recreate();

}

    }
}



