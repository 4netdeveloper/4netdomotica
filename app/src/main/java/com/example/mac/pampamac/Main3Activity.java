package com.example.mac.pampamac;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


import java.io.IOException;


public class Main3Activity extends AppCompatActivity {

    Button volver;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn0;
    public Button chu;
    public Button chd;
    public Button on;
    public Button vmas;
    public Button vmenos;
    public Button vmax;
    public Button mute;
    public Button pc;
    public Button btnpr;
    public Button btnlu;
    public Button btnmn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        volver = (Button) findViewById(R.id.volver3);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, Main2Activity.class);
                startActivity(intent);

            }
        });

        btn1  = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    if ( linkeador.ira( "tv?c=1" ) ) {
                        // todo ok.

                    }else{
                        // falla no conecto.
                        Intent intent = new Intent( Main3Activity.this , atencion.class);
                        startActivity(intent);
                    };
                } catch (IOException e) {
                    // fallo otra cosa.
                }
            }
        });

        btn2  = (Button) findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // /*
                try {
                    linkeador.ira("tv?c=2");
                } catch (IOException e) {
                    // var test = atencion ;
                    Intent intent = new Intent( Main3Activity.this , atencion.class);
                    startActivity(intent);
                    // Intent intent = new Intent( Main3Activity.this , atencion.class);                     startActivity(intent);
                }
                // */
            }
        });

        btn3  = (Button) findViewById(R.id.button4);
        // configura(btn2, "tv?c=2");

        //configura((Button) findViewById(R.id.button3) , "tv?c=3");
        // /*
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("tv?c=3");
                } catch (IOException e) {
                    Intent intent = new Intent( Main3Activity.this , atencion.class);
                    startActivity(intent);
                }
            }
        });

        btn4  = (Button) findViewById(R.id.button5);

        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("tv?c=4");
                } catch (IOException e) {
                    Intent intent = new Intent( Main3Activity.this , atencion.class);                     startActivity(intent);
                }
            }
        });

        btn5  = (Button) findViewById(R.id.button6);

        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("tv?c=5");
                } catch (IOException e) {
                    Intent intent = new Intent( Main3Activity.this , atencion.class);
                    startActivity(intent);
                }
            }
        });


        btn6  = (Button) findViewById(R.id.button7);

        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("tv?c=6");
                } catch (IOException e) {
                    Intent intent = new Intent( Main3Activity.this , atencion.class);
                    startActivity(intent);
                }
            }
        });


        btn7  = (Button) findViewById(R.id.button8);

        btn7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("tv?c=7");
                } catch (IOException e) {
                    Intent intent = new Intent( Main3Activity.this , atencion.class);
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
                    Intent intent = new Intent( Main3Activity.this , atencion.class);
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
                    Intent intent = new Intent( Main3Activity.this , atencion.class);
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
                    Intent intent = new Intent( Main3Activity.this , atencion.class);
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
                    Intent intent = new Intent( Main3Activity.this , atencion.class);
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
                    Intent intent = new Intent( Main3Activity.this , atencion.class);
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
                    Intent intent = new Intent( Main3Activity.this , atencion.class);
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
                    Intent intent = new Intent( Main3Activity.this , atencion.class);
                    startActivity(intent);
                }
            }
        });

        vmas = (Button) findViewById(R.id.button19);

        vmas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("tv?c=volummenup");
                } catch (IOException e) {
                    Intent intent = new Intent( Main3Activity.this , atencion.class);
                    startActivity(intent);
                }
            }
        });

        vmenos = (Button) findViewById(R.id.button3);

        vmenos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    linkeador.ira("tv?c=volummendown");
                } catch (IOException e) {
                    Intent intent = new Intent( Main3Activity.this , atencion.class);
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
                    Intent intent = new Intent( Main3Activity.this , atencion.class);
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

        btnpr = (Button) findViewById(R.id.proyector);

        btnpr.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, Main5Activity.class);
                startActivity(intent);
            }
        });

        btnlu= (Button) findViewById(R.id.luces);

        btnlu.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, Main6Activity.class);
                startActivity(intent);
            }
        });

        btnmn= (Button) findViewById(R.id.menu);

        btnmn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

    }


}
