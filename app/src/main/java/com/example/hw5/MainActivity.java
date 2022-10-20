package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView showAndHidePassword;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showAndHidePassword = findViewById(R.id.tv_show_and_hide_password);
        showAndHidePassword.bringToFront();
        etPassword = findViewById(R.id.et_password);
        showAndHidePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (showAndHidePassword.getText().toString().equals("Show")) {
                    etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    showAndHidePassword.setText("Hide");
                } else {
                    etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    showAndHidePassword.setText("Show");
                }
            }
        });

    }
}