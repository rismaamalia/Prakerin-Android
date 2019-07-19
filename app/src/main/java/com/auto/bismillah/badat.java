package com.auto.bismillah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class badat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badat);

        Button persegi =(Button) findViewById(R.id.persegi);
        persegi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), persegi.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button persegipanjang =(Button) findViewById(R.id.persegipanjang);
        persegipanjang.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), persegipanjang.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button segitiga =(Button) findViewById(R.id.segitiga);
        segitiga.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), segitiga.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button jajargenjang =(Button) findViewById(R.id.jajargenjang);
        jajargenjang.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), jajargenjang.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button trapesium =(Button) findViewById(R.id.trapesium);
        trapesium.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), trapesium.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button layanglayang =(Button) findViewById(R.id.layanglayang);
        layanglayang.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), layanglayang.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button belahketupat =(Button) findViewById(R.id.belahketupat);
        belahketupat.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), belahketupat.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button lingkaran =(Button) findViewById(R.id.lingkaran);
        lingkaran.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), lingkaran.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
