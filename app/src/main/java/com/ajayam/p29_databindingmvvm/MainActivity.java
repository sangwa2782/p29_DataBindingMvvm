package com.ajayam.p29_databindingmvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.ajayam.p29_databindingmvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding mainxml = DataBindingUtil.setContentView(this,R.layout.activity_main);

        Product p = new Product("Data related form model class");
        mainxml.setProduct(p);



    }
}