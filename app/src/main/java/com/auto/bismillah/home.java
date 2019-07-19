package com.auto.bismillah;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class home extends AppCompatActivity {
    boolean doubleTapParam;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Button badat =(Button) findViewById(R.id.badat);
        badat.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), badat.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button latsol =(Button) findViewById(R.id.latsol);
        latsol.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), soal.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button tentang =(Button) findViewById(R.id.tentang);
        tentang.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), tentang.class);
                startActivityForResult(myIntent, 0);
            }
        });


    }

    //ini adalah method bawaan dari Android Studio
    //fungsi : memberi aksi ketika tombol back pada hp diklik
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
         builder.setMessage("Apakah Kamu Benar-Benar ingin Keluar?")
         .setCancelable(false)
        .setPositiveButton("Ya", new
                DialogInterface.OnClickListener() {
             public void onClick(DialogInterface dialog,
                     int id) {

                 moveTaskToBack(true);
                }
             })
         .setNegativeButton("Tidak",new
                DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog,
                     int arg1) {
               dialog.cancel();
            }
                }).show();
    }

}


