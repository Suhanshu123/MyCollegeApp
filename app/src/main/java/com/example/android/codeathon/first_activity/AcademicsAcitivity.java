package com.example.android.codeathon.first_activity;

import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.android.codeathon.R;
import com.example.android.codeathon.academic_detail_classes.STSCCELL;
import com.example.android.codeathon.academic_detail_classes.courses_academics;
import com.example.android.codeathon.academic_detail_classes.result_academics;

public class AcademicsAcitivity extends AppCompatActivity {
    String download_url_of_rules;
    String download_url_of_holiday;
    String download_url_of_syllabus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics_acitivity);

        Toolbar toolbar = findViewById(R.id.toolbar_academics);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        download_url_of_rules = "http://gkv.ac.in/fwd/examrules2012.pdf";

        download_url_of_holiday = "https://www.vertex42.com/calendars/pdfs/2018-yearly-holiday-calendar.pdf";

        download_url_of_syllabus = "http://www.gkv.ac.in/fwd/CSE-CBCS-2015-16.pdf";
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);

    }

    public void download_examination_rules(View view) {
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(download_url_of_rules));
        request.setTitle("EXAMINATION RULES");
        request.setDescription("GKV Examination Rules");
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED | DownloadManager.Request.VISIBILITY_VISIBLE);
//        String nameOfFile = URLUtil.guessFileName(download_url_of_rules, null, MimeTypeMap
//                .getFileExtensionFromUrl(download_url_of_rules));
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "Examination Rules");

        DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
        downloadManager.enqueue(request);

        Toast.makeText(this,"Downloading Starts",Toast.LENGTH_SHORT).show();

    }


    public void download_syllabus(View view) {
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(download_url_of_syllabus));
        request.setTitle("GKV SYLLABUS");
        request.setDescription("Syllabus of Gkv");
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED | DownloadManager.Request.VISIBILITY_VISIBLE);
//        String nameOfFile = URLUtil.guessFileName(download_url_of_syllabus, null, MimeTypeMap
//                .getFileExtensionFromUrl(download_url_of_syllabus));
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "Syllabus Pdf");

        DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
        downloadManager.enqueue(request);

        Toast.makeText(this,"Downloading Starts",Toast.LENGTH_SHORT).show();
    }

    public void download_holiday(View view) {
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(download_url_of_holiday));
        request.setTitle("HOLIDAY CALENDER");
        request.setDescription("Holiday Calender of Gkv");
        request.allowScanningByMediaScanner();
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED | DownloadManager.Request.VISIBILITY_VISIBLE);
//        String nameOfFile = URLUtil.guessFileName(download_url_of_holiday, null, MimeTypeMap
//                .getFileExtensionFromUrl(download_url_of_holiday));
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "Holiday Calender");

        DownloadManager downloadManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
        downloadManager.enqueue(request);

        Toast.makeText(this,"Downloading Starts",Toast.LENGTH_SHORT).show();
    }

    public void open_scstcell(View view) {
        startActivity(new Intent(this, STSCCELL.class));
    }

    public void open_result_section(View view) {
        startActivity(new Intent(this, result_academics.class));
    }

    public void open_courses(View view) {
        startActivity(new Intent(this,courses_academics.class));
    }
}
