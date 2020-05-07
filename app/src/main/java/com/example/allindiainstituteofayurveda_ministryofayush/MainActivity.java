package com.example.allindiainstituteofayurveda_ministryofayush;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText usr;
    EditText pwd;
    TextView fpwd;
    TextView freg;
    Button blgn;
    Spinner sp1;
    private static final String[] paths = {"Patients", "Hospital", "Admin"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usr = (EditText) findViewById(R.id.eusername);
        pwd = (EditText) findViewById(R.id.epwd);
        fpwd = (TextView) findViewById(R.id.forgotpwd);
        freg = (TextView) findViewById(R.id.breg);
        blgn = (Button) findViewById(R.id.blogin);
        sp1 = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Distinction_array, R.layout.support_simple_spinner_dropdown_item);
        sp1.setAdapter(adapter);
        blgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String item = sp1.getSelectedItem().toString();
                if (usr.getText().toString().equals("patient") && pwd.getText().toString().equals("patient") && item.equals("Patient")) {
                    Intent i1 = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(i1);
                }else if(usr.getText().toString().equals("hospital") && pwd.getText().toString().equals("hospital") && item.equals("Hospital")) {
                    Intent i2 = new Intent(MainActivity.this, Main3Activity.class);
                    startActivity(i2);
                }else if(usr.getText().toString().equals("root") && pwd.getText().toString().equals("toor") && item.equals("Admin")){
                    Intent i3=new Intent(MainActivity.this,Main4Activity.class);
                    startActivity(i3);
                } else {
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
                }
            }
        });
        freg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(i3);
            }
        });
    }
}