package com.example.home.sensorlist;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SensorManager sm;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textView2);
        sm=(SensorManager)getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> listSensor=sm.getSensorList(Sensor.TYPE_ALL);
        List<String> listSensorType=new ArrayList<String>();
        for(int i=0;i<listSensor.size();i++)
        {
            listSensorType.add(listSensor.get(i).getName());

        }
        for(int i=0;i<listSensorType.size();i++)
        {
            tv.setText(tv.getText().toString()+"\n"+listSensorType.get(i));

        }

    }


}
