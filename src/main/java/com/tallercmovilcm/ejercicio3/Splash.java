package com.tallercmovilcm.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread timer = new Thread()
        {
          public void run()
          {
              try
              {
                  sleep(2000);
              }

              catch (Exception e)
              {
                  e.printStackTrace();
              }

              finally
              {
                  Intent intent = new Intent(Splash.this, MainActivity.class);
                  startActivity(intent);
                  finish();
              }
          }
        };

        timer.start();
    }
}