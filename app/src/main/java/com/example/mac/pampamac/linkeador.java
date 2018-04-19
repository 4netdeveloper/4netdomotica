package com.example.mac.pampamac;

/**
 * Created by HUESO on 26/8/2017.
 */

import android.app.Activity;
import android.os.StrictMode;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class linkeador extends Activity { //clase para conectar apk con la raspy
    private static String org = "http://192.168.42.1:8080/"; //ip y puerto de conexion

    public static String url(String ac) {

        return org + ac;
    }

    public static boolean ira(String url ) throws IOException {

        int SDK_INT = android.os.Build.VERSION.SDK_INT;
        if (SDK_INT > 8) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll().build();
            StrictMode.setThreadPolicy(policy);
            //your codes here

            HttpURLConnection urlConnection = null ;

            Log.d("linkeador", "ejecuto: url:" + url);

            try {
                // conexion con la raspberry
                URL urla = new URL(org + url);
               // esta linea hace el error de conexion al raspberry:::::
                urlConnection = (HttpURLConnection) urla.openConnection();
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                // InputStream in = new BufferedInputStream(urlConnection.getInputStream());
                // readStream(in);
                BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                StringBuilder result = new StringBuilder();
                // */
                return true;
            } catch (Exception e){

                urlConnection.disconnect();
                return false;

                /* atencion . lanzar( intent );
                /*finally {
                urlConnection.disconnect();*/
            }
        }
        return true;

    }

    private static String readStream(InputStream is) {
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            int i = is.read();
            while (i != -1) {
                bo.write(i);
                i = is.read();
            }
            return bo.toString();
        } catch (IOException e) {
            return "";
        }
    }
/* public void Hacer(String dispositivo, String comando) {

    String url = "http://192.168.52.5:8080/" + dispositivo + "?c=" + comando + "&has=" + "16516543";
    intent i = new Intent(linkeador.this, WebActivity.class);
     //Intent i = new Intent(linkeador.this, Main3Activity.class);
    i.setData(Uri);
    WebView.findAddress(url ) ;
    startActivity(i);
    // i.setData(Uri.parse(url));

}
*/

}


