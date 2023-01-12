package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText username, email, password;
    private Button btnSubmit;
    private TextView txtLoginInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.edtUsername);
        email = findViewById(R.id.edtEmail);
        password = findViewById(R.id.edtPassword);
        btnSubmit = findViewById(R.id.button);
        txtLoginInfo = findViewById(R.id.txtLoginInfo);

    }
}