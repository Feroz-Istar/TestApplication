package com.example.vaibhav.testapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Activity1 extends AppCompatActivity {
    private Button button;
    private RelativeLayout main_container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        button = (Button)findViewById(R.id.button);
        main_container = (RelativeLayout)findViewById(R.id.main_container);
        if(getIntent()!=null){
            Bundle bundle = getIntent().getExtras();
            if(bundle.getString("color")!=null)
                main_container.setBackgroundColor(Color.parseColor(getIntent().getStringExtra("color")));
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity1.this,Activity2.class);
                intent.putExtra("color","#00C851");
                startActivity(intent);
            }
        });

    }
}
