package com.opus_bd.spinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.cvHelloWorld)
    public void cvHelloWorld() {
        startActivity(new Intent(this, Helloworld.class));
    }

    @OnClick(R.id.cvSpinner)
    public void cvSpinner() {
        startActivity(new Intent(this, SpinnerActivity.class));
    }

}
