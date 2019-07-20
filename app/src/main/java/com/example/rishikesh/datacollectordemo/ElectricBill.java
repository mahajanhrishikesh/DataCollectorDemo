package com.example.rishikesh.datacollectordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ElectricBill extends AppCompatActivity {

    EditText editTextFromGrid, editTextOnsite;
    Button buttonSubmitForm;
    TextView t1,t2; //testing
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electric_bill);

        editTextFromGrid = (EditText) findViewById(R.id.editTextFromGridID);
        editTextOnsite = (EditText) findViewById(R.id.editTextOnsiteID);

        t1 = findViewById(R.id.FGID);
        t2 = findViewById(R.id.OID);

        buttonSubmitForm = (Button) findViewById(R.id.buttonSubmitFormEBId);

        buttonSubmitForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String FG = editTextFromGrid.getText().toString();
                t1.setText(FG);
                String O = editTextOnsite.getText().toString();
                t2.setText(O);
            }
        });
    }
}
