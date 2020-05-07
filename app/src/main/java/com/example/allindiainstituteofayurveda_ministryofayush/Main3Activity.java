package com.example.allindiainstituteofayurveda_ministryofayush;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final DrawerLayout drawerLayout = findViewById(R.id.drawer_layout1);
        findViewById(R.id.air).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        NavigationView navigationView=findViewById(R.id.naviv1);
        navigationView.setItemIconTintList(null);
        b1=(Button)findViewById(R.id.btn11);
        b2=(Button)findViewById(R.id.btn12);
        b3=(Button)findViewById(R.id.btn13);
        b4=(Button)findViewById(R.id.btn14);
        b5=(Button)findViewById(R.id.btn15);
        b6=(Button)findViewById(R.id.btn16);


    }
}