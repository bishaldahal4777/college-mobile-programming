package com.example.mobileprogramming;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtEmail, editPassword;

    private CheckBox chkRememberMe;

    private AppCompatButton btnLogin;

    private TextView txtForgotPassword, txtsignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    private void findViews() {
        edtEmail = findViewById(R.id.edtEmail);
        editPassword = findViewById(R.id.editPassword);
        chkRememberMe = findViewById(R.id.chkRememberMe);
        btnLogin = findViewById(R.id.btnLogin);
        txtForgotPassword = findViewById(R.id.txtForgotPassword);
        txtsignup = findViewById(R.id.txtSignup);
        txtsignup.setOnClickListener(this);
        btnLogin.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnLogin) {
            Intent intent = new Intent(LoginActivity.this, ActivitySignup.class);
            intent.pu

            String email = edtEmail.getText().toString().trim();
            String password = editPassword.getText().toString().trim();

            if (email.isEmpty()) {
                Toast.makeText(LoginActivity.this, "Email cannot be empty", Toast.LENGTH_SHORT).show();
            } else if (password.isEmpty()) {
                Toast.makeText(LoginActivity.this, "Password cannot be empty", Toast.LENGTH_SHORT).show();

            } else if (email.equals("bishal@gmail.com") && password.equals("bishal123")) {
                Toast.makeText(LoginActivity.this, "login Successful", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(LoginActivity.this, "login Credential cannot match", Toast.LENGTH_SHORT).show();
            }

        } else if (view.getId() == R.id.txtSignup) {

        }
    }
}