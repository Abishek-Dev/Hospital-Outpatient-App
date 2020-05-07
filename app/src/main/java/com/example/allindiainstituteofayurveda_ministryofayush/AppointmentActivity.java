package com.example.allindiainstituteofayurveda_ministryofayush;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AppointmentActivity extends AppCompatActivity {
    EditText e1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment);
        e1=(EditText)findViewById(R.id.et1);
        b1=(Button)findViewById(R.id.b7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(AppointmentActivity.this,AppointmentActivity1.class);
                startActivity(i1);
            }
        });
    }
}
