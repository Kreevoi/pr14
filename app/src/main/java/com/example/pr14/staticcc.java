package com.example.pr14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class staticcc extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.staticcc);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.ivhome2) startActivity(new Intent(this, menu.class));
        if (v.getId()==R.id.ivtime2) startActivity(new Intent(this, ex.class));
    }
}