package com.example.hw5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private TextView showAndHidePassword, forgotPassword;
    private EditText etPassword;
    private MaterialButton signUp;
    private ConstraintLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showAndHidePassword = findViewById(R.id.tv_show_and_hide_password);
        showAndHidePassword.bringToFront();
        etPassword = findViewById(R.id.et_password);
        signUp = findViewById(R.id.btn_sign_up);
        showAndHidePassword.setOnClickListener(v -> {
            if (showAndHidePassword.getText().toString().equals("Show")) {
                etPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                showAndHidePassword.setText("Hide");
            } else {
                etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                showAndHidePassword.setText("Show");
            }
        });
        text();
    }

    private void text() {
        cl = findViewById(R.id.cl);
        EditText name = findViewById(R.id.et_name);
        etPassword = findViewById(R.id.et_password);
        forgotPassword = findViewById(R.id.tv_new2);
        signUp.setOnClickListener(v -> {
            if (name.getText().toString().equals("Clown") && etPassword.getText().toString().equals("password")) {
                Toast.makeText(this, "Вход выполнен", Toast.LENGTH_SHORT).show();
                cl.setVisibility(View.INVISIBLE);
                forgotPassword.setVisibility(View.INVISIBLE);
            } else {
                Toast.makeText(this, "Неправильный логин или пароль", Toast.LENGTH_SHORT).show();
            }
        });
    }
}