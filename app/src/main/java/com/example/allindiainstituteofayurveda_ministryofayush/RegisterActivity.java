package com.example.allindiainstituteofayurveda_ministryofayush;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {
    Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        reg=(Button)findViewById(R.id.rger);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent draw=new Intent(RegisterActivity.this,Main2Activity.class);
                startActivity(draw);
            }
        });
    }
}
