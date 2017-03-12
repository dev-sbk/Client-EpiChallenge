package com.bwialabs.epichallange.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.bwialabs.epichallange.R;

import java.util.Timer;
import java.util.TimerTask;


public class LoginActitvity extends Activity {

    private Button btnLogin;
    private EditText log;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
        log=(EditText) findViewById(R.id.log);
        pass=(EditText) findViewById(R.id.pass);

    }

    private void login() {
        System.out.println("cccccccccccc");

        if(log.getText().toString().equals("admin") && pass.getText().toString().equals("admin")  )
        {

            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);

            // close this activity
            finish();

        }



    }
}
