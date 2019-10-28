package com.mehtabalam.app.hashmap;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.Map;

public class CustomSpinner implements AdapterView.OnItemSelectedListener {

    private Context mCtx;
    private Spinner spinner;
    private Map<String, String> hashmap;
    private String selectedKey;

    public CustomSpinner(Context mCtx, Map<String, String> hashmap, Spinner spinner) {
        this.hashmap = hashmap;
        this.mCtx = mCtx;
        this.spinner = spinner;
        loadSpinner();
    }

    private void loadSpinner() {
        ArrayAdapter arrayAdapter = new ArrayAdapter<>(mCtx, android.R.layout.simple_spinner_item, new ArrayList<>(hashmap.keySet()));
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        this.selectedKey = this.hashmap.get(adapterView.getAdapter().getItem(i).toString());

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public String getSpinnerSelection() {
        return this.selectedKey;
    }
}
