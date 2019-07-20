package com.example.rishikesh.datacollectordemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //Three Cards are present in the view so Three cardview objects required
    private CardView uniStaffCardView, studentCardView, tranStaffCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("DataCollectorDemo");

        //Defining the Cards
        uniStaffCardView = (CardView) findViewById(R.id.uniStaffCardViewId);
        studentCardView = (CardView) findViewById(R.id.studentCardViewId);
        tranStaffCardView = (CardView) findViewById(R.id.tranStaffCardViewId);

        //Adding Click listeners to the cards
        uniStaffCardView.setOnClickListener(this);
        studentCardView.setOnClickListener(this);
        tranStaffCardView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i ;

        //Routing cards according to clicks
        switch (v.getId())
        {
            case R.id.studentCardViewId : i = new Intent(this,TwoWheelerInfo.class); startActivity(i); break;

            case R.id.uniStaffCardViewId : i = new Intent(this, ElectricBill.class); startActivity(i); break;

            case R.id.tranStaffCardViewId : i = new Intent(this, ThreeWheelerInfo.class); startActivity(i); break;

            default: break;
        }
    }
}
