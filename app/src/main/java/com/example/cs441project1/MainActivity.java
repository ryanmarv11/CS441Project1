package com.example.cs441project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hello_world_text;
    Button hello_world_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello_world_text = (TextView) findViewById(R.id.hello_world_text);
        hello_world_button = (Button) findViewById(R.id.hello_world_button);

    }

    public void onHelloClick(View view) {

        hello_world_text.setTextSize(64);
    }
}