package com.example.oulutraineeship;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt = (Button) findViewById(R.id.loginbutton);

        bt.setOnClickListener(view -> switchactivities());
    }

    private void switchactivities(){
        Intent act2 = new Intent(this, Activity2.class);
        startActivity(act2);
    }
}