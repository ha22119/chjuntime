package com.example.chjuntime;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class GroupDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_detail);
    }

    // 하단바 버튼 함수
    public void todayClick(View view) {
        Intent todayIntent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(todayIntent);
        overridePendingTransition(0, 0);
        finish();
    }

    public void monthlyClick(View view) {
        //Intent monthlyIntent = new Intent(getApplicationContext(),MainActivity.class);
        //startActivity(monthlyIntent);
        Toast.makeText(this, "아직 없는 액티비티", Toast.LENGTH_SHORT).show();
    }

    public void recordClick(View view) {
        Intent recordIntent = new Intent(getApplicationContext(),RecordActivity.class);
        startActivity(recordIntent);
        overridePendingTransition(0, 0);
        finish();
    }

    public void groupClick(View view) {
        Intent groupIntent = new Intent(getApplicationContext(),GroupActivity.class);
        startActivity(groupIntent);
        overridePendingTransition(0, 0);
        finish();
    }

    public void myClick(View view) {
        Intent myIntent = new Intent(getApplicationContext(),MyInfoActivity.class);
        startActivity(myIntent);
        overridePendingTransition(0, 0);
        finish();
    }
    // 하단바 버튼 함수
}
