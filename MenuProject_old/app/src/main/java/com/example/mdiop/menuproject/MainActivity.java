package com.example.mdiop.menuproject;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.setting) {
           Toast t = Toast.makeText(this, "Setting selected", Toast.LENGTH_SHORT);
           t.show();
            return true ;
           }
        else if (id == R.id.help){
            Toast t = Toast.makeText(this, "Help selected", Toast.LENGTH_SHORT);
            t.show();
            return true ;
        }
        return super.onOptionsItemSelected(item);
    }
}
