package com.example.allindiainstituteofayurveda_ministryofayush;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class doc_profile_activity extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_profile_activity);
        b1=(Button)findViewById(R.id.b99);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(doc_profile_activity.this,FixAppointmentActivity.class);
                startActivity(i1);
            }
        });
    }
}