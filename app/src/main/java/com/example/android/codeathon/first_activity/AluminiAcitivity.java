package com.example.android.codeathon.first_activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;

import com.example.android.codeathon.R;

public class AluminiAcitivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumini_acitivity);

        Toolbar toolbar = findViewById(R.id.toolbar_alumni);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webView = findViewById(R.id.web_view_alumni);
    }

    public void open_alumni_website(View view) {

        webView.setVisibility(View.VISIBLE);
        webView.loadUrl("http://www.gkv.ac.in/?page_id=6799");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);

    }
}
