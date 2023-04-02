package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    EditText myEditText;
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect variable button with actual button

        myButton = findViewById(R.id.button);
        myEditText = findViewById(R.id.editTextTextPersonName);
        myTextView = findViewById(R.id.textView);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //todo button action
                String inputValue = myEditText.getText().toString();
                myTextView.setText("welcome \n" + inputValue);

                Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_LONG).show();

            }
        });




    }
}