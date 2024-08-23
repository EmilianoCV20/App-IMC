package mx.edu.itl.u3imcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        //Hacer la transicion al MainActivity despues de 2 seg.
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Crear el Intent para llamar a MainActivity
                Intent intent = new Intent( SplashActivity.this, MainActivity.class );
                startActivity( intent );
                finish();
            }
        }, 2000 );

    }
}