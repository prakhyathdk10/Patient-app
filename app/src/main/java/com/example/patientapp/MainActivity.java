package com.example.patientapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.pass);
        b1=(AppCompatButton)findViewById(R.id.log);
        b2=(AppCompatButton)findViewById(R.id.g);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String getUsername=ed1.getText().toString();
               String getPassword=ed2.getText().toString();
               Toast.makeText(getApplicationContext(),getUsername + getPassword,Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), SignUp.class);
                startActivity(i);
            }
        });

    }
}