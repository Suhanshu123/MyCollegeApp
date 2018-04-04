package com.example.android.codeathon;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.android.codeathon.first_activity.MainActivity;

public class SplashScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ImageView imageView=findViewById(R.id.image_splash);

        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim);
        imageView.startAnimation(animation);

     Thread timer =new Thread(){
         @Override
         public void run() {
             try {
                 sleep(6000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             startActivity(new Intent(getApplicationContext(), MainActivity.class));
             finish();
             super.run();
         }
     };

     timer.start();

    }
}
