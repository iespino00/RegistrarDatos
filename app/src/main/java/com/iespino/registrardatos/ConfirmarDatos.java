package com.iespino.registrardatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity
{
    private TextView tvnombre;
    private TextView tvfnacimiento;
    private TextView tvtelefono;
    private TextView tvemail;
    private TextView tvdescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        Bundle parametros = getIntent().getExtras();

        String nombre = parametros.getString(getResources().getString(R.string.parametroNombre));
        String fecha = parametros.getString(getResources().getString(R.string.parametroFecha));
        String telefono = parametros.getString(getResources().getString(R.string.parametroTelefono));
        String email = parametros.getString(getResources().getString(R.string.parametroEmail));
        String descripcion = parametros.getString(getResources().getString(R.string.parametroDescripcion));


        tvnombre = (TextView) findViewById(R.id.tvnombre);
        tvfnacimiento = (TextView) findViewById(R.id.tvfnacimiento);
        tvtelefono = (TextView) findViewById(R.id.tvtelefono);
        tvemail = (TextView) findViewById(R.id.tvemail);
        tvdescripcion = (TextView) findViewById(R.id.tvdescripcion);

        tvnombre.setText(nombre);
        tvfnacimiento.setText(fecha);
        tvtelefono.setText(telefono);
        tvemail.setText(email);
        tvdescripcion.setText(descripcion);

        editar();

    }

    public void editar()
    {
        Button Beditar = (Button) findViewById(R.id.btneditar);

        Beditar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });
    }


}
