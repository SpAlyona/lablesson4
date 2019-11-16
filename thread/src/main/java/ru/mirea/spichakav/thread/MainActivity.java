package ru.mirea.spichakav.thread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.*;
import android.view.*;
import android.widget.*;

import java.text.CollationElementIterator;


public class MainActivity extends AppCompatActivity {
    Thread mainThread = Thread.currentThread();
    TextView infoTextView = (TextView) findViewById(R.id.textV);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        infoTextView.setText("Текущий поток: " + mainThread.getName());
// Меняем имя и выводим в текстовом поле
        mainThread.setName("MireaThread");
        infoTextView.append("\nНовое имя потока: " + mainThread.getName());
    }
    public void onClick(View view) {
        MyThread myThread = new MyThread();
        myThread.start();
        MyRunnable runnable = new MyRunnable("mirea ");
        new Thread(runnable).start();
    }


}