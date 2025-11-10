package com.example.mobileprogramming;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivitySignup extends AppCompatActivity {
    private EditText edtFullName, edtEmail, edtPassword, edtConfirmPassword;
    private Spinner spinnerGender;
    private AppCompatButton btnSignup;
    private TextView txtLogin;

    private String selectedGender = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Initialize views
        edtFullName = findViewById(R.id.edtFullName);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        edtConfirmPassword = findViewById(R.id.edtConfirmPassword);
        spinnerGender = findViewById(R.id.spinnerGender);
        btnSignup = findViewById(R.id.btnSignup);
        txtLogin = findViewById(R.id.txtLogin);

        // Spinner listener
        spinnerGender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedGender = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedGender = "";
            }
        });

        // Sign Up button logic
        btnSignup.setOnClickListener(v -> {
            String fullName = edtFullName.getText().toString().trim();
            String email = edtEmail.getText().toString().trim();
            String password = edtPassword.getText().toString().trim();
            String confirmPassword = edtConfirmPassword.getText().toString().trim();

            if (fullName.isEmpty()) {
                Toast.makeText(this, "Full name cannot be empty", Toast.LENGTH_SHORT).show();
            } else if (email.isEmpty()) {
                Toast.makeText(this, "Email cannot be empty", Toast.LENGTH_SHORT).show();
            } else if (password.isEmpty()) {
                Toast.makeText(this, "Password cannot be empty", Toast.LENGTH_SHORT).show();
            } else if (!password.equals(confirmPassword)) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
            } else if (selectedGender.isEmpty()) {
                Toast.makeText(this, "Please select gender", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Account created successfully!", Toast.LENGTH_SHORT).show();

                // Go to LoginActivity after success
                Intent intent = new Intent(ActivitySignup.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // “Login” text click → go back to LoginActivity
        txtLogin.setOnClickListener(v -> {
            Intent intent = new Intent(ActivitySignup.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
