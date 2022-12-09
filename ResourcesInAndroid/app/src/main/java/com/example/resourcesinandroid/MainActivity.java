package com.example.resourcesinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    Resources resources;
    boolean isPasswordProtected;
    int [] odd_numbers;
    int one;
    String app_name;
    String [] student_names;
    TypedArray colors;
    TypedArray images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resources = getResources();
        app_name = resources.getString(R.string.app_name);
        Log.e("tag","Value of string resource is "+app_name);
        one = resources.getInteger(R.integer.one);
        Log.e("tag","Value of int resource is "+one);
        odd_numbers = resources.getIntArray(R.array.odd_numbers);
        for (int i = 0; i < odd_numbers.length ; i++) {
            Log.e("tag","Odd numbers :"+ odd_numbers[i]);
        }
        Log.e("tag","Value of int resource is "+one);

        student_names = resources.getStringArray(R.array.student_names);
        isPasswordProtected = resources.getBoolean(R.bool.isPasswordProtected);
        colors = resources.obtainTypedArray(R.array.colors);
        images = resources.obtainTypedArray(R.array.images);

        //Configuration configuration = resources.getConfiguration();
        //configuration.locale.getDisplayCountry();
    }
}