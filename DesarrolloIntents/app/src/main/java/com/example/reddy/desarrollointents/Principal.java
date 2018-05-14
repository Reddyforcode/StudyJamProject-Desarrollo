package com.example.reddy.desarrollointents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    TextView textEdad;
    Button materialesNecesarios, test, about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        textEdad = (TextView) findViewById(R.id.textEdad);
        Bundle bundle;
        bundle = getIntent().getExtras();
        String rec = bundle.getString("valorEdad", "");
        textEdad.setText(rec);

        

    }
}