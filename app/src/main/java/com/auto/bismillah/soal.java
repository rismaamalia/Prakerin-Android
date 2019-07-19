package com.auto.bismillah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class soal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);

        Button pintar =(Button) findViewById(R.id.pintar);
        pintar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), pintar.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button cerdas =(Button) findViewById(R.id.cerdas);
        cerdas.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), cerdas.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button jenius =(Button) findViewById(R.id.jenius);
        jenius.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), jenius.class);
                startActivityForResult(myIntent, 0);
            }
        });

        
    }
}
