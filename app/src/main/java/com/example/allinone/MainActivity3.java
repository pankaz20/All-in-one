package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    EditText mail_id;
    EditText mail_subject;
    EditText mail_body;
    Button send_mail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public  void Openactivity(View view)
    {
        mail_id = findViewById(R.id.mail_id);
        mail_subject = findViewById(R.id.mail_subject);
        mail_body = findViewById(R.id.mail_body);
        String Mail_id = mail_id.getText().toString();
        String Mail_subject = mail_subject.getText().toString();
        String Mail_body = mail_body.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, Mail_id);
        intent.putExtra(Intent.EXTRA_SUBJECT, Mail_subject);
        intent.putExtra(Intent.EXTRA_TEXT, Mail_body);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}