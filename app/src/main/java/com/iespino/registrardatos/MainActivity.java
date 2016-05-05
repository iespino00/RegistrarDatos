package com.iespino.registrardatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity
{
    EditText editNombre;
    DatePicker dpdate;
    EditText edittelefono;
    EditText editemail;
    EditText editdescripcion;

    Integer dia;
    Integer mes;
    Integer year;
    String fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        siguiente();
    }



    public void siguiente()
    {
        Button btnsig = (Button) findViewById(R.id.btnsiguiente);

        btnsig.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                editNombre = (EditText) findViewById(R.id.editNombre);
                dpdate =(DatePicker) findViewById(R.id.dpdate);
                edittelefono = (EditText) findViewById(R.id.edittelefono);
                editemail = (EditText) findViewById(R.id.editemail);
                editdescripcion = (EditText) findViewById(R.id.editdescripcion);

                dia= dpdate.getDayOfMonth();
                mes= dpdate.getMonth();
                year=dpdate.getYear();

                mes=1+mes;

               String day = Integer.toString(dia);
               String month = Integer.toString(mes);
               String anno = Integer.toString(year);

               fecha = (day+"/"+month+"/"+year);



                Intent intent = new Intent(MainActivity.this,ConfirmarDatos.class);

                intent.putExtra(getResources().getString(R.string.parametroNombre),editNombre.getText().toString());
                intent.putExtra(getResources().getString(R.string.parametroFecha),fecha);
                intent.putExtra(getResources().getString(R.string.parametroTelefono),edittelefono.getText().toString());
                intent.putExtra(getResources().getString(R.string.parametroEmail),editemail.getText().toString());
                intent.putExtra(getResources().getString(R.string.parametroDescripcion), editdescripcion.getText().toString());

                startActivity(intent);



            }
        });
    }


}
