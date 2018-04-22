package com.example.mac.pampamac;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button vertelevision;
    Button usarproyector;
    Button usarluces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        vertelevision = (Button) findViewById(R.id.vertv);
        vertelevision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent (Main2Activity.this, Main3Activity.class);
                startActivity(intent);

            }
        });

        usarproyector = (Button) findViewById(R.id.proyectar);
        usarproyector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main5Activity.class);
                startActivity(intent);

            }
        });

        usarluces = (Button) findViewById(R.id.luces);
        usarluces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Main6Activity.class);
                startActivity(intent);
            }
        });

    }





}
