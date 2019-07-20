package com.example.rishikesh.datacollectordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class TwoWheelerInfo extends AppCompatActivity{

    TextView t1,t2,t3,t4,t5;    //Testing
    EditText editTextVehicleModel, editTextMileage, editTextDailyTravel;
    Button buttonSubmitForm;
    RadioGroup radioGroupVType, radioGroupFType;
    RadioButton radioButtonVType, radioButtonFType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_wheeler_info);

        //EditTexts
        editTextVehicleModel = (EditText) findViewById(R.id.editTextVehicleModelId);
        editTextMileage = (EditText) findViewById(R.id.editTextMileageId);
        editTextDailyTravel = (EditText) findViewById(R.id.editTextDailyTravelId);

        //radiogroups V=> Vehicle Model  F=>Fuel Type
        radioGroupVType = (RadioGroup) findViewById(R.id.radioGroupVTypeId);
        radioGroupFType = (RadioGroup) findViewById(R.id.radioGroupFTypeId);

        //TextViews for testing
        t1 = findViewById(R.id.VMID);
        t2 = findViewById(R.id.MID);
        t3 = findViewById(R.id.DTID);
        t4 = findViewById(R.id.VID);
        t5 = findViewById(R.id.FID);

        buttonSubmitForm = (Button) findViewById(R.id.buttonSubmitFormId);

        buttonSubmitForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioIdVType = radioGroupVType.getCheckedRadioButtonId();
                radioButtonVType = findViewById(radioIdVType);
                t4.setText(radioButtonVType.getText());
                int radioIdFType = radioGroupFType.getCheckedRadioButtonId();
                radioButtonFType = findViewById(radioIdFType);
                t5.setText(radioButtonFType.getText());
                String VehicleModel = editTextVehicleModel.getText().toString();
                t1.setText(VehicleModel);
                String Mileage = editTextMileage.getText().toString();
                t2.setText(Mileage);
                String DailyTravel = editTextDailyTravel.getText().toString();
                t3.setText(DailyTravel);
            }
        });

    }

    public void checkVType(View v){
        int radioId = radioGroupVType.getCheckedRadioButtonId();

        radioButtonVType = findViewById(radioId);


    }

    public void checkFType(View v){
        int radioId = radioGroupVType.getCheckedRadioButtonId();

        radioButtonVType = findViewById(radioId);
    }
}
