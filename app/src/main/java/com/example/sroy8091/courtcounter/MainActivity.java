package com.example.sroy8091.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void point3increament(View view) {
        scoreA = scoreA + 3;
        TextView points = (TextView) findViewById(R.id.point_view);
        points.setText(String.valueOf(scoreA));
    }

    public void pointincreament(View view) {
        scoreA = scoreA + 1;
        TextView points = (TextView) findViewById(R.id.point_view);
        points.setText(String.valueOf(scoreA));
    }

    public void point2increament(View view) {
        scoreA = scoreA + 2;
        TextView points = (TextView) findViewById(R.id.point_view);
        points.setText(String.valueOf(scoreA));
    }

    public void point3increamentB(View view) {
        scoreB = scoreB + 3;
        TextView points = (TextView) findViewById(R.id.point_viewB);
        points.setText(String.valueOf(scoreB));
    }

    public void pointincreamentB(View view) {
        scoreB = scoreB + 1;
        TextView points = (TextView) findViewById(R.id.point_viewB);
        points.setText(String.valueOf(scoreB));
    }

    public void point2increamentB(View view) {
        scoreB = scoreB + 2;
        TextView points = (TextView) findViewById(R.id.point_viewB);
        points.setText(String.valueOf(scoreB));
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        TextView points = (TextView) findViewById(R.id.point_viewB);
        points.setText(String.valueOf(scoreB));
        TextView pointsB = (TextView) findViewById(R.id.point_view);
        pointsB.setText(String.valueOf(scoreA));
    }
}
