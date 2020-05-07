package com.example.allindiainstituteofayurveda_ministryofayush;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FixAppointmentActivity extends AppCompatActivity {
    CalendarView calender;
    TextView date_view;
    Button fix;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fix_appointment);
        calender = (CalendarView) findViewById(R.id.calendar);
        date_view = (TextView) findViewById(R.id.tv1);
        fix=(Button)findViewById(R.id.fixdate);

        calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
                            @Override
                            public void onSelectedDayChange(
                                    CalendarView view,
                                    int year,
                                    int month,
                                    int dayOfMonth)
                            {
                                String Date = dayOfMonth + "-" + (month + 1) + "-" + year;
                                date_view.setText(Date);
                            }
                        });
        fix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(FixAppointmentActivity.this,gpay.class);
                startActivity(i1);
            }
        });
    }
}