package com.example.mac.pampamac;

/**
 * Created by Asokah on 21/4/2018.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


import java.io.IOException;


public class Main6Activity extends AppCompatActivity {

    Button volver;
    public Button luz1;
    public Button luz2;
    public Button luz3;
    public Button luz4;

    public Button btnpr;
    public Button btnlu;
    public Button btnmn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        volver = (Button) findViewById(R.id.volver3);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main6Activity.this, Main2Activity.class);
                startActivity(intent);

            }
        });

        luz1  = (Button) findViewById(R.id.luz1); //flecha arriba

        luz1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    if ( linkeador.ira( "gp?c=1" ) ) {
                        // todo ok.
                    }else{
                        // falla no conecto.
                        Intent intent = new Intent( Main6Activity.this , atencion.class);
                        startActivity(intent);
                    };
                } catch (IOException e) {
                    // fallo otra cosa.
                }
            }
        });

        btnpr = (Button) findViewById(R.id.proyector);
        btnpr.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main6Activity.this, Main5Activity.class);
                startActivity(intent);
            }
        });

        btnlu= (Button) findViewById(R.id.televisor);
        btnlu.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main6Activity.this, Main3Activity.class);
                startActivity(intent);
            }
        });

        btnmn= (Button) findViewById(R.id.menu);

        btnmn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main6Activity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

    }

}