package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.EditText;

public class MainActivity4 extends AppCompatActivity {
    EditText alarm_message;
    EditText alarm_hour;
    EditText alarm_minute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public  void Openactiviy(View view)
    {
        alarm_hour = findViewById(R.id.alarm_hour);
        alarm_message = findViewById(R.id.alarm_message);
        alarm_minute = findViewById(R.id.alarm_minute);
        String Alarm_message = alarm_message.getText().toString();
        String Alarm_hour1 = alarm_hour.getText().toString();
        int Alarm_hour = Integer.parseInt(Alarm_hour1);
        String Alarm_minute1 = alarm_minute.getText().toString();
        int Alarm_minute = Integer.parseInt(Alarm_minute1);
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_HOUR, Alarm_hour)
                .putExtra(AlarmClock.EXTRA_MINUTES, Alarm_minute);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}