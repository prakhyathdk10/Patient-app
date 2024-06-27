package com.example.patientapp;

import android.annotation.SuppressLint;
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

public class SignUp extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8;
    AppCompatButton b1,b2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        ed1=(EditText)findViewById(R.id.pname);
        ed2=(EditText)findViewById(R.id.age);
        ed3=(EditText)findViewById(R.id.houname);
        ed4=(EditText)findViewById(R.id.pcode);
        ed5=(EditText)findViewById(R.id.mobno);
        ed6=(EditText)findViewById(R.id.name);
        ed7=(EditText)findViewById(R.id.pass);
        ed8=(EditText)findViewById(R.id.cpass);
        b1=(AppCompatButton)findViewById(R.id.reg);
        b2=(AppCompatButton)findViewById(R.id.logbtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getPname=ed1.getText().toString();
                String getAge=ed2.getText().toString();
                String getHouse=ed3.getText().toString();
                String getPin=ed4.getText().toString();
                String getMobno=ed5.getText().toString();
                String getUsername=ed6.getText().toString();
                String getPassword=ed7.getText().toString();
                String getCpassword=ed8.getText().toString();
                Toast.makeText(getApplicationContext(),getPname+" " +getAge+" "+ getHouse+" " +getPin+" "+ getMobno+" "+ getUsername+" "+ getPassword+" "+ getCpassword,Toast.LENGTH_LONG).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(p);
            }
        });


    }
}