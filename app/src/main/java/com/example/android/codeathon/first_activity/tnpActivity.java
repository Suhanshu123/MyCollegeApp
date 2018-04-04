package com.example.android.codeathon.first_activity;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.Toast;

import com.example.android.codeathon.R;

public class tnpActivity extends AppCompatActivity {
    String download_url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tnp);
        Toolbar toolbar=findViewById(R.id.toolbar_about);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        download_url="http://www.gkv.ac.in/fwd/B.Tech-Brochure-20170906.pdf";

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

    public void download_pdf(View view) {

        DownloadManager.Request request=new DownloadManager.Request(Uri.parse(download_url));
        request.setTitle("PLACEMENT BROCHURE");
        request.setDescription("GKV Placement Records");
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED|DownloadManager.Request.VISIBILITY_VISIBLE);
        String nameOfFile= URLUtil.guessFileName(download_url,null, MimeTypeMap
                .getFileExtensionFromUrl(download_url));
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,"PLACEMENT BROCHURE");

        DownloadManager downloadManager= (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
        downloadManager.enqueue(request);

        Toast.makeText(this,"Downloading Starts",Toast.LENGTH_SHORT).show();
    }
}
