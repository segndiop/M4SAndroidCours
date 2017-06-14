package com.example.mdiop.menutest;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    public void addListenerOnButton() {
        Button bsms = (Button) findViewById(R.id.sms);
        Button bphone = (Button) findViewById(R.id.phone);
        Button bweb = (Button) findViewById(R.id.web);
        Button bmap = (Button) findViewById(R.id.map);
        Button bshare = (Button) findViewById(R.id.share);
        Button bnact = (Button) findViewById(R.id.nact);

        bsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("smsto:" + Uri.encode("00221774596976")));
                intent.putExtra("sms_body", "Bonjour Madiaw DIOP");
                startActivity(intent);
            }

        });
        bphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:00221774596976"));
                startActivity(intent);
            }

        });

        bweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http:www.facebook.com"));
                startActivity(intent);
            }

        });

        bmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String geoUri = String.format("geo:14.894587,-16.8559216,17");
                Uri geo = Uri.parse(geoUri);
                Intent geoMap = new Intent(Intent.ACTION_VIEW, geo);
                startActivity(geoMap);
            }

        });

        bshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_SUBJECT,"CS639");
                intent.putExtra(Intent.EXTRA_TEXT,"Join Cs639");
                startActivity(Intent.createChooser(intent,"Share The love"));
            }

        });

        bnact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),NewActivity.class));
            }

        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(getApplicationContext(), "Settings Selected", Toast.LENGTH_LONG).show();
                return true;

            case R.id.item2:
                Toast.makeText(getApplicationContext(), "Help Selected", Toast.LENGTH_LONG).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
