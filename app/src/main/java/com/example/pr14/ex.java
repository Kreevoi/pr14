package com.example.pr14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ex extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.ivhome) startActivity(new Intent(this, menu.class));
        if (v.getId()==R.id.ivstatic4) startActivity(new Intent(this, staticcc.class));
    }
}