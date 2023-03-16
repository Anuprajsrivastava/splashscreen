package com.example.project1demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class loginpage extends AppCompatActivity {
    EditText name,passnum;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);

        name=findViewById(R.id.name);
        passnum=findViewById(R.id.passnum);
        btn=findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(loginpage.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}