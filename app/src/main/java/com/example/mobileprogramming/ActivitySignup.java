package com.example.mobileprogramming;

import android.os.Bundle;
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
        String email= getIntent().getStringExtra("Email");
        Toast.makeText(this, "Email: "+email, Toast.LENGTH_SHORT).show();


    }
}