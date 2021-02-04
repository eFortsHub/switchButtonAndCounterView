package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.test.databinding.ActivityMainBinding;

import lib.kingja.switchbutton.SwitchMultiButton;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding b;
    String selectedGender = "Male";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());


        b.switchbtn.setText("Male", "Female");

        b.switchbtn.setSelectedTab(1);

        b.switchbtn.setOnSwitchListener((position, tabText) -> {
            selectedGender = tabText;
            Toast.makeText(this, selectedGender, Toast.LENGTH_SHORT).show();

        });




    }
}