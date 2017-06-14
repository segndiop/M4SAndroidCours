package com.example.mdiop.asynctaskproject;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by mdiop on 13/06/2017.
 */

class ReadOnlineImage extends AsyncTask<Void, Integer, Bitmap> {
    ProgressBar mProgressBar;

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        super.onPreExecute();
        //Toast.makeText(g, "Début du traitement asynchrone", Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(),"Item 1 Selected",Toast.LENGTH_LONG).show();

    }

    public ReadOnlineImage() {
        super();
    }

    @Override
    protected void onProgressUpdate(Integer... values) {

        super.onProgressUpdate(values);
    }

    @Override
    protected Bitmap doInBackground(Void... params) {
        URL url = null;
        Bitmap bp = null;
        try {
            url = new URL("https://github.com/segndiop/M4SAndroidCours/blob/master/Screenshots/DiopMadiawPortraitXML.PNG");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            if (con.getResponseCode() != 200) {
                throw new Exception("Failed to connect");
            }
            InputStream in = con.getInputStream();
            in.close();
            bp = BitmapFactory.decodeStream(in);

        } catch (Exception e) {
            e.printStackTrace();
            Log.e("Image", "Failed to load", e);
            Log.e("error", e.getMessage());
        }
        return bp;
    }
}
