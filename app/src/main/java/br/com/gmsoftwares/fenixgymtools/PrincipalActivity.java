package br.com.gmsoftwares.fenixgymtools;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class PrincipalActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void abrirBiceps(View view)
    {
        Intent it = new Intent(this, CatBicepsActivity.class);
        startActivity(it);
    }

    public void abrirCostas(View view)
    {
        Intent it = new Intent(this, CatCostasActivity.class);
        startActivity(it);
    }

    public void abrirOmbro(View view)
    {
        Intent it = new Intent(this, CatOmbroActivity.class);
        startActivity(it);
    }

    public void abrirPeito(View view)
    {
        Intent it = new Intent(this, CatPeitoActivity.class);
        startActivity(it);
    }

    public void abrirPernas(View view)
    {
        Intent it = new Intent(this, CatPernasActivity.class);
        startActivity(it);
    }

    public void abrirTriceps(View view)
    {
        Intent it = new Intent(this, CatTricepsActivity.class);
        startActivity(it);
    }
}


