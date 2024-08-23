package mx.edu.itl.u3imcapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.main_activity );
    }
    public void btnIMCClick ( View v ){
        EditText peso = findViewById( R.id.txtPeso );
        EditText altura = findViewById( R.id.txtAltura );

        String Peso = peso.getText().toString();
        String Altura = altura.getText().toString();

        double peso1 = Double.parseDouble(Peso);
        double altura1 = Double.parseDouble(Altura);
        double IMC = peso1 / ( altura1 * altura1 );

        String salud = "";
        if ( IMC < 15 )
            salud = "Delgadez Muy Severa";
        if ( IMC >= 15 && IMC <= 15.9 )
            salud = "Delgadez Severa";
        if ( IMC >= 16 && IMC <= 18.4 )
            salud = "Delgadez";
        if ( IMC >= 18.5 && IMC <= 24.9 )
            salud = "Peso Saludable";
        if ( IMC >= 25 && IMC <= 29.9 )
            salud = "Sobrepeso";
        if ( IMC >= 30 && IMC <= 34.9 )
            salud = "Obesidad Moderada";
        if ( IMC >= 35 && IMC <= 39.9 )
            salud = "Obesidad Severa";
        if ( IMC >= 40 )
            salud = "Obesisdad muy Severa (Obesidad Mórbida)";


        AlertDialog.Builder builder = new AlertDialog.Builder( this );
        builder.setTitle( "IMCApp" )
                .setIcon( R.drawable.itl )
                .setMessage( "IMC= " + IMC + ", su condicion de salud es: "+ salud )
                .setPositiveButton ( "Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick( DialogInterface dialog, int which ) {
                    }
                })
                .create().show();
    }

    public void btnAcercaDeClick ( View v ) {
        Intent intent = new Intent( this, AcercaDeActivity.class);
        startActivity( intent );
        finish();
    }
}