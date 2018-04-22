/**
 * Created by Asokah on 21/4/2018.
 */

package com.example.mac.pampamac;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


import java.io.IOException;


public class Main5Activity extends AppCompatActivity {

    Button volver;
    public Button btnup;
    public Button btndw;
    public Button btnlf;
    public Button btnrg;
    public Button btnok;
    public Button btnme;
    public Button btninp;
    public Button btntv;
    public Button btnlu;
    //public Button btn0;
    //public Button chu;
    //public Button chd;
    public Button btnon;
    //public Button vmas;
    //public Button vmenos;
    //public Button vmax;
    //public Button mute;
    public Button pc;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        volver = (Button) findViewById(R.id.volver3);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main5Activity.this, Main2Activity.class);
                startActivity(intent);

            }
        });

        btnup  = (Button) findViewById(R.id.button); //flecha arriba

        btnup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    if ( linkeador.ira( "pr?c=up" ) ) {
                        // todo ok.

                    }else{
                        // falla no conecto.
                        Intent intent = new Intent( Main5Activity.this , atencion.class);
                        startActivity(intent);
                    };
                } catch (IOException e) {
                    // fallo otra cosa.
                }
            }
        });

        btndw  = (Button) findViewById(R.id.button2); //flecha abajo

        btndw.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                // /*
                try {
                    linkeador.ira("pr?c=down");
                } catch (IOException e) {
                    // var test = atencion ;
                    Intent intent = new Intent( Main5Activity.this , atencion.class);
                    startActivity(intent);
                    // Intent intent = new Intent( Main5Activity.this , atencion.class);                     startActivity(intent);
                }
                // */
            }
        });

        btnlf  = (Button) findViewById(R.id.button4); //flecha izquierda
        // configura(btn2, "tv?c=2");

        //configura((Button) findViewById(R.id.button3) , "tv?c=3");
        // /*
        btnlf.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("pr?c=left");
                } catch (IOException e) {
                    Intent intent = new Intent( Main5Activity.this , atencion.class);
                    startActivity(intent);
                }
            }
        });

        btnrg  = (Button) findViewById(R.id.button5); //flecha derecha

        btnrg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("pr?c=rigth");
                } catch (IOException e) {
                    Intent intent = new Intent( Main5Activity.this , atencion.class);                     startActivity(intent);
                }
            }
        });

        btnok  = (Button) findViewById(R.id.button6); //boton ok

        btnok.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("pr?c=ok");
                } catch (IOException e) {
                    Intent intent = new Intent( Main5Activity.this , atencion.class);
                    startActivity(intent);
                }
            }
        });


        btnon  = (Button) findViewById(R.id.button7); // boton encendido

        btnon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("pr?c=power");
                } catch (IOException e) {
                    Intent intent = new Intent( Main5Activity.this , atencion.class);
                    startActivity(intent);
                }
            }
        });


        btnme  = (Button) findViewById(R.id.button8); // boton menu

        btnme.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("pr?c=menu");
                } catch (IOException e) {
                    Intent intent = new Intent( Main5Activity.this , atencion.class);
                    startActivity(intent);
                }
            }
        });

        btninp  = (Button) findViewById(R.id.button9); // boton input

        btninp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("pr?c=s");
                } catch (IOException e) {
                    Intent intent = new Intent( Main5Activity.this , atencion.class);
                    startActivity(intent);
                }
            }
        });

        pc = (Button) findViewById(R.id.button16);

        pc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


            }
        });

        btntv= (Button) findViewById(R.id.button8);
        btntv.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main5Activity.this, Main3Activity.class);
                startActivity(intent);
            }
        });

        btnlu= (Button) findViewById(R.id.button23);
        btnlu.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main5Activity.this, Main6Activity.class);
                startActivity(intent);
            }
        });


    }
    }


}
