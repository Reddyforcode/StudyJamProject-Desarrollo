package com.example.reddy.desarrollointents;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    Button button;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spin);
        ArrayAdapter <CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        button = (Button) findViewById(R.id.bt);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionButton();

            }
        });

    }
    public void actionButton()
    {
        if(spinner.getSelectedItemPosition()!=0) {
            intent = new Intent(this, Principal.class);
            String a = spinner.getSelectedItem().toString();
            intent.putExtra("valorEdad", a);
            startActivity(intent);
            finish();
        }else{
            Toast toast = Toast.makeText(this, "Elija una opción", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener
    {

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {


            Spinner spinner = (Spinner) findViewById(R.id.spin);

            if(position > 0) {   spinner.setOnItemSelectedListener(this);}
            else{}
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }
}