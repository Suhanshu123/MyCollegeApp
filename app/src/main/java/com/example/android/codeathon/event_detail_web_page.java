package com.example.android.codeathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.android.codeathon.R;

public class event_detail_web_page extends AppCompatActivity {

   private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail_web_page);
        webView=findViewById(R.id.web_view_event_detail);

        webView.loadUrl("http://www.jnanagni.in/index.html");

    }
}
