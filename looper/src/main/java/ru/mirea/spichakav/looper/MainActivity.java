package ru.mirea.spichakav.looper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.*;
import android.os.*;
import android.os.Message;
import android.util.*;
import android.view.*;
import android.widget.*;
//import android.support.*;
public class MainActivity extends AppCompatActivity {
    MyLooper myLooper;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText  = (EditText) findViewById(R.id.editText);
        textView  = (TextView) findViewById(R.id.textView);
        myLooper = new MyLooper();
        myLooper.start();
    }
    public void onClick(View view) {
        Message msg = new Message();
        Bundle bundle = new Bundle();
        bundle.putString("KEY", "mirea");
        msg.setData(bundle);
        if (myLooper != null) {
            myLooper.handler.sendMessage(msg);
        }

    }
    public void ClickButton(View v)
    {
//        //Объявим числовые переменные
//        double a,b,c;
//
//        //Считаем с editText и editText2 текстовые значения
//        String S1 = editText.getText().toString();
//        String S2 = editText2.getText().toString();
//
//        //Преобразуем текстовые переменные в числовые значения
//        a = Double.parseDouble(S1);
//        b = Double.parseDouble(S2);
//
//        //Проведем с числовыми переменными нужные действия
//        c = a+b;
//
//        //Преобразуем ответ в число
//        String S = Double.toString(c);
//
//        //Выведем текст в textView
//        textView.setText(S);


        double a = Double.parseDouble(editText.getText().toString());
        double b = 40;
        double c = a+b;
        textView.setText(Double.toString(c));
    }
}
