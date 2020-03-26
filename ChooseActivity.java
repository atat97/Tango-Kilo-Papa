package com.example.projekt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        if(getIntent().hasExtra("com.example.projekt.succesfull")){
            TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
            String text = getIntent().getExtras().getString("com.example.projekt.succesfull");
            resultTextView.setText(text);
        }
        else if(getIntent().hasExtra("com.example.projekt.failed")){
            TextView resultTextView = (TextView) findViewById(R.id.resultTextView);
            String text = getIntent().getExtras().getString("com.example.projekt.failed");
            resultTextView.setText(text);
        }

        Button previousButton = (Button) findViewById(R.id.previousButton);
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent previousIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(previousIntent);
            }
        });
    }
}
