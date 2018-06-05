package com.example.administrator.day02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.lang.annotation.Annotation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Class personClass = Person.class;
        Entity entity = (Entity) personClass.getAnnotation(Entity.class);
        Log.e("Entity","通过反射取到的值为："+entity.value());
    }
}
