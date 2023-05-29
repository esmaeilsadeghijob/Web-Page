package com.firstapp.ariya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MsgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msg);

        Intent intent = getIntent();
        String username = intent.getStringExtra("NAME");

        TextView view = findViewById(R.id.textView);
        view.setText("WelCome  " + username);
    }
}