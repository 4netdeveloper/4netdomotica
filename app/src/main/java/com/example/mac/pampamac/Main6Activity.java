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
}
}