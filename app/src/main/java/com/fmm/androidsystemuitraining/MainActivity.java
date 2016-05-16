package com.fmm.androidsystemuitraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.ColorTranslucentTheme).setOnClickListener(this);
        findViewById(R.id.ImageTranslucentTheme).setOnClickListener(this);
        Object o = new Object();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ColorTranslucentTheme:
                startActivity(new Intent(this,ColorTranslucentActivity.class));
                break;
            case R.id.ImageTranslucentTheme:
                startActivity(new Intent(this,ImageTranslucentActivity.class));
                break;
        }
    }
}
