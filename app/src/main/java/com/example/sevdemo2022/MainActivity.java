package com.example.sevdemo2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user;
    EditText password;
    Button button;
    Button button2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        user = (EditText)findViewById(R.id.EditLogin);
        password = (EditText)findViewById(R.id.EditName);
        button = (Button)findViewById(R.id.button);

        button2 = (Button)findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });


    }


}