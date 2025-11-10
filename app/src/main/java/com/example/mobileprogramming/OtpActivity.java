package com.example.mobileprogramming;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatButton;
import android.widget.TextView;

public class OtpActivity extends AppCompatActivity {

    private EditText otp1, otp2, otp3, otp4;
    private AppCompatButton btnVerifyOtp;
    private TextView txtResendOtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        otp1 = findViewById(R.id.otp1);
        otp2 = findViewById(R.id.otp2);
        otp3 = findViewById(R.id.otp3);
        otp4 = findViewById(R.id.otp4);
        btnVerifyOtp = findViewById(R.id.btnVerifyOtp);
        txtResendOtp = findViewById(R.id.txtResendOtp);

        btnVerifyOtp.setOnClickListener(v -> {
            String code = otp1.getText().toString().trim() +
                    otp2.getText().toString().trim() +
                    otp3.getText().toString().trim() +
                    otp4.getText().toString().trim();

            if (code.length() == 4) {
                if (code.equals("1234")) {  // sample OTP
                    Toast.makeText(this, "OTP Verified Successfully", Toast.LENGTH_SHORT).show();
                    // You can move to next activity here
                } else {
                    Toast.makeText(this, "Invalid OTP", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "Please enter all 4 digits", Toast.LENGTH_SHORT).show();
            }
        });

        txtResendOtp.setOnClickListener(v -> {
            Toast.makeText(this, "OTP resent successfully!", Toast.LENGTH_SHORT).show();
        });
    }
}
