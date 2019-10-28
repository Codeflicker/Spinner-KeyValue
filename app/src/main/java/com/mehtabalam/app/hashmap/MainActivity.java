package com.mehtabalam.app.hashmap;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.HashMap;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinnerId);

        final CustomSpinner customHashMap = new CustomSpinner(this, HashMapModel.hashMap, spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                customHashMap.onItemSelected(adapterView, view, i, l);
                Toast.makeText(MainActivity.this, customHashMap.getSpinnerSelection(), Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
}


class HashMapModel {

     static final HashMap<String, String> hashMap = new HashMap<String, String>() {{
        put("A", "Android");
        put("B", "Base64");
        put("C", "Catalog");
        put("D", "Design");
        put("E", "Enum");
        put("F", "Formatter");
    }};
}
