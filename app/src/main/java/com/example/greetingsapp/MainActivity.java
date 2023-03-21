package com.example.greetingsapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        okButton = findViewById(R.id.okButton);

        okButton.setOnClickListener(
                v -> Toast.makeText(
                        MainActivity.this,
                        String.format("Hello, %s!", editText.getText().toString()),
                        Toast.LENGTH_LONG
                ).show()
        );
    }
}