package mx.edu.itl.u3imcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AcercaDeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acercade);
    }

    public void btnAtrasClick ( View v ) {
        Intent intent = new Intent( this, MainActivity.class);
        startActivity( intent );
        finish();
    }
}