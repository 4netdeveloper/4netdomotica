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

    public Button luz1;
    public Button luz2;
    public Button luz3;
    public Button luz4;
    public Button salida;
    public Button btnpr;
    public Button btnlu;
    public Button btnmn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        btnmn = (Button) findViewById(R.id.menu);
        btnmn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent (v.getContext(), Main2Activity.class);
                startActivityForResult(intent2, 0);

            }
        });

        luz1  = (Button) findViewById(R.id.luz1);

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

        luz2  = (Button) findViewById(R.id.luz2);

        luz2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    if ( linkeador.ira( "gp?c=2" ) ) {
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

        luz3  = (Button) findViewById(R.id.luz3);

        luz3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    if ( linkeador.ira( "gp?c=3" ) ) {
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

        luz4  = (Button) findViewById(R.id.luz4);

        luz4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    if ( linkeador.ira( "gp?c=4" ) ) {
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

        salida = (Button)findViewById(R.id.salir);
        salida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            }
        });

    }

}