package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChildActivity_1 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_1);

        Button buttonA = (Button)findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setClass(ChildActivity_1.this, MainActivity.class);
                startActivity(intent);
                ChildActivity_1.this.finish();
            }
        });
    }
}
