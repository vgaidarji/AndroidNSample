package com.vgaidarji.androidn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Interfaces().run();
        new ForEach().initObjects();
        new RepeatableAnnotations().printDeclaredSchedules();
        new Lambdas().doWork();

        findViewById(R.id.buttonPIP).setOnClickListener(view -> {
            // only for TV
            MainActivity.this.enterPictureInPicture();
        });
    }
}
