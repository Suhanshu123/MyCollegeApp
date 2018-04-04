package com.example.android.codeathon.first_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.example.android.codeathon.Department_Classes.AC_DEPARTMENT;
import com.example.android.codeathon.Department_Classes.AM_DEPARTMENT;
import com.example.android.codeathon.Department_Classes.AP_DEPARTMENT;
import com.example.android.codeathon.Department_Classes.CS_DEPARTMENT;
import com.example.android.codeathon.Department_Classes.ECE_ACTIVITY;
import com.example.android.codeathon.Department_Classes.EE_DEPARTMENT;
import com.example.android.codeathon.Department_Classes.ME_DEPARTMENT;
import com.example.android.codeathon.R;

public class DepartmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        Toolbar toolbar = findViewById(R.id.toolbar_department);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

    public void open_computer_department(View view) {
        startActivity(new Intent(this, CS_DEPARTMENT.class));
    }

    public void open_am_department(View view) {
        startActivity(new Intent(this, AM_DEPARTMENT.class));
    }

    public void open_ac_department(View view) {
        startActivity(new Intent(this, AC_DEPARTMENT.class));
    }

    public void open_ap_department(View view) {
        startActivity(new Intent(this, AP_DEPARTMENT.class));
    }

    public void open_me_department(View view) {
        startActivity(new Intent(this, ME_DEPARTMENT.class));
    }

    public void open_ee_department(View view) {
        startActivity(new Intent(this, EE_DEPARTMENT.class));
    }

    public void open_ece_department(View view) {
        startActivity(new Intent(this, ECE_ACTIVITY.class));
    }
}
