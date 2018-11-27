package com.example.vaibhav.testapplication.testKannada.activity;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.vaibhav.testapplication.R;

import java.util.Locale;

public class TestKannada extends AppCompatActivity {
    public static final String TAG ="TestKannada";
    private Button kannada ;
    private TextView news ;
    Configuration config;
    Typeface kannadaFont;

    String currentLanguage="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_kannada);
        kannada = (Button) findViewById(R.id.kannada);
        news = (TextView) findViewById(R.id.news);

        kannadaFont = Typeface.createFromAsset(getAssets(), "font/BARAHA_Kannad.TTF");


        kannada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentLanguage = "kn";
                Locale locale = new Locale(currentLanguage);
                Locale.setDefault(locale);

                /**
                 * Print the current language
                 */
                System.out.println("My current language: " + Locale.getDefault());


                config = new Configuration();
                config.locale = locale;
                getBaseContext().getResources().updateConfiguration(config,
                        getBaseContext().getResources().getDisplayMetrics());

                news.setText(R.string.note);
                news.setTypeface(kannadaFont);
            }
        });

    }
}
