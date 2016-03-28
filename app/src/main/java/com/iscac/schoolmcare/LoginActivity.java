package com.iscac.schoolmcare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.iv_done).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String username = ((TextView) findViewById(R.id.username)).getText().toString();
                String password = ((TextView) findViewById(R.id.password)).getText().toString();

                Toast.makeText(LoginActivity.this, getString(R.string.toast_message, username, password), Toast.LENGTH_LONG).show();



            }
        });

    }


}
