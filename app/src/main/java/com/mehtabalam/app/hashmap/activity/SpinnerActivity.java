package com.mehtabalam.app.hashmap.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.mehtabalam.app.hashmap.CustomSpinner;
import com.mehtabalam.app.hashmap.R;
import com.mehtabalam.app.hashmap.modal.spinnerHashmap;

import androidx.appcompat.app.AppCompatActivity;

public class SpinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinnerId);

        final CustomSpinner customHashMap = new CustomSpinner(this, spinnerHashmap.hashMap, spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                customHashMap.onItemSelected(adapterView, view, i, l);
                Toast.makeText(SpinnerActivity.this, customHashMap.getSpinnerSelection(), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}
