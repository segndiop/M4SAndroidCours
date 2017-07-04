package com.example.mdiop.firebasedbanimaux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView firebase_tv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firebase_tv = (TextView) findViewById(R.id.firebaseText);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myref = database.getReference("message");

        myref.child(String.valueOf("Animal"));
        myref.child(String.valueOf("Photo"));
        myref.setValue("Hello, Word!");

    }
}
