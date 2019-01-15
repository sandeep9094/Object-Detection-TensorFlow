package org.tensorflow.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_mode);
    }

    public void classifierClick(View view){
        Intent classifierIntent = new Intent(getApplicationContext(),ClassifierActivity.class);
        startActivity(classifierIntent);

    }
    public void detectorClick(View view){
        Intent detectorIntent = new Intent(getApplicationContext(),DetectorActivity.class);
        startActivity(detectorIntent);
    }
    public void stylizeClick(View view){
        Intent stylizeIntent = new Intent(getApplicationContext(),StylizeActivity.class);
        startActivity(stylizeIntent);
    }
    public void speechClick(View view){
        Intent speechIntent = new Intent(getApplicationContext(),SpeechActivity.class);
        startActivity(speechIntent);
    }
}
