package com.example.donateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private TextView attempts;
    private Button login;
    private Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.editUsername);
        password =(EditText) findViewById(R.id.editPassword);
        attempts = (TextView) findViewById(R.id.text_attempt);
        login = (Button) findViewById(R.id.login_button);
        cancel = (Button) findViewById(R.id.cancel_button);
    }

    private void validate(String username, String password){
        if(username =="mini" && password =="1234");
    }
}