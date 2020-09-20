package com.example.mvpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    private Button btn;
    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"new user name",Toast.LENGTH_SHORT).show();
        mPresenter = new MainPresenter(this);
        btn = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.buttonClick();
            }
        });

    }

    @Override
    public void newActivity() {
        Intent intent = new Intent(this, activity2.class);
        startActivity(intent);
    }
}