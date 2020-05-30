package com.example.fogplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import java.util.Arrays;

import me.srodrigo.androidhintspinner.HintAdapter;
import me.srodrigo.androidhintspinner.HintSpinner;

public class VehicleDetail extends AppCompatActivity {

    Spinner spinvehicletype;
    String[] vehicletype={"Two Wheeler","Four Wheleer"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_detail);
        spinvehicletype=findViewById(R.id.spinvehicletype);
        HintSpinner<String> hintSpinner = new HintSpinner<>(
                spinvehicletype,
                // Default layout - You don't need to pass in any layout id, just your hint text and
                // your list data
                new HintAdapter<String>(this,"Vehicle Type", Arrays.asList(vehicletype)),
                new HintSpinner.Callback<String>() {
                    @Override
                    public void onItemSelected(int position, String itemAtPosition) {
                        // Here you handle the on item selected event (this skips the hint selected event)
                    }
                });
        hintSpinner.init();
    }

    public void login(View view) {
        Intent intent=new Intent(VehicleDetail.this,Login.class);
        startActivity(intent);
    }
}
