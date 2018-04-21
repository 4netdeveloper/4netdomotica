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
    public Button arriba;
    public Button btndw;
    public Button btnlf;
    public Button btnrg;
    public Button btnok;
    public Button btnme;
    public Button btninp;
    //public Button btn8;
    //public Button btn9;
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
                    if ( linkeador.ira( "py?a=u" ) ) {
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
                    linkeador.ira("pr?c=on");
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
                    linkeador.ira("py?b=in");
                } catch (IOException e) {
                    Intent intent = new Intent( Main5Activity.this , atencion.class);
                    startActivity(intent);
                }
            }
        });
        btn8  = (Button) findViewById(R.id.button9);

        btn8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("tv?c=8");
                } catch (IOException e) {
                    Intent intent = new Intent( Main5Activity.this , atencion.class);
                    startActivity(intent);
                }
            }
        });

        btn9  = (Button) findViewById(R.id.button10);

        btn9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("tv?c=9");
                } catch (IOException e) {
                    Intent intent = new Intent( Main5Activity.this , atencion.class);
                    startActivity(intent);
                }
            }
        });

        btn0  = (Button) findViewById(R.id.button11);

        btn0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("tv?c=0");
                } catch (IOException e) {
                    Intent intent = new Intent( Main5Activity.this , atencion.class);
                    startActivity(intent);
                }
            }
        });

        on = (Button) findViewById(R.id.button12);

        on.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("tv?c=power");
                } catch (IOException e) {
                    Intent intent = new Intent( Main5Activity.this , atencion.class);
                    startActivity(intent);
                }
            }
        });

        chu = (Button) findViewById(R.id.button17);

        chu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("tv?c=channelup");
                } catch (IOException e) {
                    Intent intent = new Intent( Main5Activity.this , atencion.class);
                    startActivity(intent);
                }
            }
        });

        chd = (Button) findViewById(R.id.button20);

        chd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("tv?c=channeldown");
                } catch (IOException e) {
                    Intent intent = new Intent( Main5Activity.this , atencion.class);
                    startActivity(intent);
                }
            }
        });

        vmas = (Button) findViewById(R.id.button19);

        vmas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("tv?c=uparrow");
                } catch (IOException e) {
                    Intent intent = new Intent( Main5Activity.this , atencion.class);
                    startActivity(intent);
                }
            }
        });

        vmenos = (Button) findViewById(R.id.button3);

        vmenos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("tv?c=downarrow");
                } catch (IOException e) {
                    Intent intent = new Intent( Main5Activity.this , atencion.class);
                    startActivity(intent);
                }
            }
        });



        mute = (Button) findViewById(R.id.button13);

        mute.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("tv?c=mute");
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
    }


}
