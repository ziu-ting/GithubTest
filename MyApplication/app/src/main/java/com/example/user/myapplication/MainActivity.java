package com.example.user.myapplication;

import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button01 = (Button)findViewById(R.id.button01);
        button01.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ChildActivity_1.class);
                startActivity(intent);
                MainActivity.this.finish();

            }
        });
    }
}
