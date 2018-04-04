package com.example.android.codeathon.first_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.android.codeathon.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open_tnp(View view) {
        startActivity(new Intent(this,tnpActivity.class));
    }

    public void open_about(View view) {
        startActivity(new Intent(this,AboutActivity.class));
    }

    public void open_academics(View view) {
        startActivity(new Intent(this,AcademicsAcitivity.class));
    }

    public void open_food(View view) {
        startActivity(new Intent(this,FoodActivity.class));
    }

    public void open_fests(View view) {
        startActivity(new Intent(this,FestActivity.class));
    }

    public void open_contacts(View view) {
        startActivity(new Intent(this,ContactActivity.class));
    }

    public void open_visit(View view) {
        startActivity(new Intent(this,VisitActivity.class));
    }

    public void open_clubs(View view) {
        startActivity(new Intent(this,ClubsActivity.class));
    }

    public void open_departments(View view) {
        startActivity(new Intent(this,DepartmentActivity.class));
    }

    public void open_notices(View view) {
        startActivity(new Intent(this,NoticesActivity.class));
    }

    public void open_facilities(View view) {
        startActivity(new Intent(this,FacilityActivity.class));
    }

    public void open_alumini(View view) {
        startActivity(new Intent(this,AluminiAcitivity.class));
    }


}
