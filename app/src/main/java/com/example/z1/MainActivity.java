package com.example.z1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextName = findViewById(R.id.editTextName);
        buttonSubmit = findViewById(R.id.buttonSubmit);


        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSubmitClick(v);
            }
        });
    }


    public void onSubmitClick(View view) {
        String name = editTextName.getText().toString();
        if (!name.isEmpty()) {

            Toast.makeText(this, "Witaj, " + name + "!", Toast.LENGTH_SHORT).show();
        } else {

            Toast.makeText(this, "Proszę wprowadzić imię.", Toast.LENGTH_SHORT).show();
        }
    }
}