package com.bwialabs.epichallange.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.bwialabs.epichallange.R;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by DEV-PC on 11/03/2017.
 */

public class LoginActitvity extends Activity {

    private Button btnLogin;

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
    }

    private void login() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                Timer t = new Timer();
                t.schedule(new TimerTask() {
                    @Override
                    public void run() {
                       System.out.println("********************************");
                    }
                }, 3000);

            }
        }).start();

    }
}
