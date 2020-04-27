package com.example.charts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showBarChart(View view){
        startActivity(new Intent(getApplicationContext(), BarChartActivity.class));
    }

    public void showPieChart(View view){
        startActivity(new Intent(getApplicationContext(), PieChartActivity.class));
    }

    public void showRadarChart(View view){
        startActivity(new Intent(getApplicationContext(), RadarChartActivity.class));
    }
}
