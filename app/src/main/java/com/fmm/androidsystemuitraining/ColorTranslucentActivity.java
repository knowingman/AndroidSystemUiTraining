package com.fmm.androidsystemuitraining;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.androidadvance.topsnackbar.TSnackbar;

public class ColorTranslucentActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_translucent);

        findViewById(R.id.btn_show_toast).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TSnackbar.make(findViewById(R.id.top_bar), "Hello from TSnackBar.", TSnackbar.LENGTH_LONG).show();
    }
}
