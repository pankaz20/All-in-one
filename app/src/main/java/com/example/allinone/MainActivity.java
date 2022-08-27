package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button call;
    Button massage;
    Button mail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void Openactivity(View view)
    {
        call = findViewById(R.id.call);
        Intent intent = new Intent(this, Call.class);
              startActivity(intent);
    }
    public  void Openactivity2(View view)
    {
        massage = findViewById(R.id.Massage);
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public  void Openactivity3(View view)
    {
        mail = findViewById(R.id.mail);
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
    public void Openactivity4(View view)
    {
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
    public void Openactivity5(View view)
    {
        Intent intent = new Intent(this,MainActivity5.class);
        startActivity(intent);
    }
}