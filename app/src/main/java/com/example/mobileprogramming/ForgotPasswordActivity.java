package com.example.mobileprogramming;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import android.widget.TextView;
import android.content.Intent;

import com.example.mobileprogramming.LoginActivity;
import com.example.mobileprogramming.R;

public class ForgotPasswordActivity extends AppCompatActivity {

    private EditText edtEmailForgot;
    private AppCompatButton btnResetPassword;
    private TextView txtBackToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        edtEmailForgot = findViewById(R.id.edtEmailForgot);
        btnResetPassword = findViewById(R.id.btnResetPassword);
        txtBackToLogin = findViewById(R.id.txtBackToLogin);

        // Reset Password button
        btnResetPassword.setOnClickListener(v -> {
            String email = edtEmailForgot.getText().toString().trim();

            if (email.isEmpty()) {
                Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Password reset link sent to " + email, Toast.LENGTH_LONG).show();
            }
        });

        // Back to Login
        txtBackToLogin.setOnClickListener(v -> {
            Intent intent = new Intent(ForgotPasswordActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
