package br.com.gmsoftwares.fenixgymtools;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class PrincipalActivity extends AppCompatActivity {

    private Button btnBiceps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnBiceps = (Button) findViewById(R.id.btnBiceps);
        btnBiceps.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                Intent irBiceps = new Intent(PrincipalActivity.this, CatBicepsActivity.class);
                PrincipalActivity.this.startActivity(irBiceps);
                PrincipalActivity.this.finish();
        }
        });
        }

    }


