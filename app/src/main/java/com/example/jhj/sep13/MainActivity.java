package com.example.jhj.sep13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void onPause(){}


    public void NextScnecne(View vi){ //넥스트씬 화면을 구성하고 있는 프로퍼티
        Intent i = new Intent(this , Main2Activity.class);
        startActivity(i);
    }

    public void copy(View view){


    }



}
