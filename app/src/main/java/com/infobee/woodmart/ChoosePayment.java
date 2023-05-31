package com.infobee.woodmart;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChoosePayment extends AppCompatActivity {

    TextView tvForgotPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_payment_method);

//        tvForgotPassword = findViewById(R.id.tvForgotPassword);
//
//        tvForgotPassword.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(this, ChangePassword.class);
//                    startActivity(intent);
//            }
//        });
    }
}