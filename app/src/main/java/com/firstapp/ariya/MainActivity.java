package com.firstapp.ariya;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view){
        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);

        String usernameVal = username.getText().toString();
        String passwordVal = password.getText().toString();

        if(usernameVal.equals("admin") && passwordVal.equals("admin")){
            Intent intent = new Intent(this, MsgActivity.class);
            intent.putExtra("NAME", usernameVal);
            startActivity(intent);
        }
    }
}