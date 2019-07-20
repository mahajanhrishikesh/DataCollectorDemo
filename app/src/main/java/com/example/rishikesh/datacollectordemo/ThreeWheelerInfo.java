package com.example.rishikesh.datacollectordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ThreeWheelerInfo extends AppCompatActivity {

    EditText editTextVehicleModel, editTextMileage, editTextDistanceTravel;
    RadioGroup radioGroupFType;
    RadioButton radioButtonFType;
    Button buttonSubmitForm;
    TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_wheeler_info);

        //Use TW=>ThreeWheeler in layout
        editTextDistanceTravel = (EditText) findViewById(R.id.editTextDistanceTravelTWID);
        editTextMileage = (EditText) findViewById(R.id.editTextMileageTWId);
        editTextVehicleModel = (EditText) findViewById(R.id.editTextVehicleModelTWId);

        
        radioGroupFType = (RadioGroup) findViewById(R.id.radioGroupFTypeTWId);

        //testing
        t1 = findViewById(R.id.VMTWID);
        t2 = findViewById(R.id.MTWID);
        t3 = findViewById(R.id.DTTWID);
        t4 = findViewById(R.id.FTTWID);

        buttonSubmitForm = (Button) findViewById(R.id.buttonSubmitFormTWId);

        buttonSubmitForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioID = radioGroupFType.getCheckedRadioButtonId();
                radioButtonFType = findViewById(radioID);
                t4.setText(radioButtonFType.getText());
                String vehicleModel = editTextVehicleModel.getText().toString();
                t1.setText(vehicleModel);
                String mileage = editTextMileage.getText().toString();
                t2.setText(mileage);
                String distanceTravelled = editTextDistanceTravel.getText().toString();
                t3.setText(distanceTravelled);
            }
        });
    }
}
