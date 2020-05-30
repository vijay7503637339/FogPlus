package com.example.fogplus;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class MainActivity extends AppIntro {


    @Override
    public void init(@Nullable Bundle savedInstanceState) {


        addSlide(new AppIntroFragment1());
        addSlide(new AppIntroFragment2());
        addSlide(new AppIntroFragment3());

        setBarColor(Color.parseColor("#4d3b3b"));
        setSeparatorColor(Color.parseColor("#4d3b3b"));

    }

    @Override
    public void onSkipPressed() {
        startActivity(new Intent(getApplicationContext(), Login.class));

        finish();
    }

    @Override
    public void onNextPressed() {

    }

    @Override
    public void onDonePressed() {
        startActivity(new Intent(getApplicationContext(), Login.class));

        finish();
    }

    @Override
    public void onSlideChanged() {

    }

    public void drawer(View view) {
    }
}
