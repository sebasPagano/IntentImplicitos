package com.example.alumno.intentexplicitosdesign;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListener listener = new MyListener(this);
        FloatingActionButton btnFloating = (FloatingActionButton) findViewById(R.id.floating);
        btnFloating.setOnClickListener((View.OnClickListener) listener);

    }
}
