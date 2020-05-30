package com.example.fogplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgetPasssword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_passsword);
    }

    public void verify(View view) {
        Intent intent=new Intent(ForgetPasssword.this, Otpscreen.class);
        startActivity(intent);

    }
}
