package com.example.oulutraineeship;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Activity2 extends AppCompatActivity {


    TextView devid;
    TextView date;
    TextView time;
    TextView status;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        devid = (TextView) findViewById(R.id.deviceid);
        date = (TextView) findViewById(R.id.date);
        time = (TextView) findViewById(R.id.time);
        status = (TextView) findViewById(R.id.status);


        readData();



    }



    @SuppressLint("SetTextI18n")
    private void readData() {
        List<dataSamples> dataSamples = new ArrayList<>();
        // Log.d("deviceID","d:" + tokens[0]);
        InputStream is = getResources().openRawResource(R.raw.sensordata);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, StandardCharsets.UTF_8)
        );

        String line = "";

        try {
            while ((line = reader.readLine()) != null) {


            }

            //int ps = Integer.parseInt(tokens[3].toString());
            String[] tokens = line.split(",");
            dataSamples sample = new dataSamples();
            sample.setDeviceId(tokens[0]);
            sample.setDate(tokens[1]);
            sample.setTime(tokens[2]);
            sample.setParking_Status(tokens[3]);
            dataSamples.add(sample);


            //Log.d("deviceID","d:" + tokens[0]);

            //Log.d("MyActivity", "Just created" + sample.getDeviceId());

        } catch (IOException e) {
            Log.wtf("MyActivity", "Error reading data file on line" + line, e);
            e.printStackTrace();
        }

        int lastindex = dataSamples.size() - 1;
        devid.setText(dataSamples.get(lastindex).getDeviceId());
        date.setText(dataSamples.get(lastindex).getDate());
        time.setText(dataSamples.get(lastindex).getTime());
        status.setText(dataSamples.get(lastindex).getParking_Status());

    }





}