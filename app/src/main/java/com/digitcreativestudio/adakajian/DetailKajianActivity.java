package com.digitcreativestudio.adakajian;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DetailKajianActivity extends AppCompatActivity {
    TextView textViewJudulKajian, textViewUstadKajian;

    String judul_kajian, ustad_kajian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kajian);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle extras = getIntent().getExtras();

        judul_kajian = extras.getString("judul_kajian");
        ustad_kajian = extras.getString("ustad_kajian");

        textViewJudulKajian = (TextView)findViewById(R.id.detail_judul);
        textViewUstadKajian = (TextView)findViewById(R.id.detail_ustadz);

        textViewJudulKajian.setText(judul_kajian);
        textViewUstadKajian.setText(ustad_kajian);


       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }
}
