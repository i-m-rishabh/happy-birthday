package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText editName;
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               secondClass();
            }
        });
    }
    public void secondClass(){
        editName= findViewById(R.id.editTextTextPersonName);
        String name = editName.getText().toString();
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("username",name);
        startActivity(intent);
    }
}