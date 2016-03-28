package com.iscac.schoolmcare;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            // se for para 2 argumentos é %1$d
        ((TextView)findViewById(R.id.textView)).setText(getString(R.string.sample_message, 10, 20));

    }





}
