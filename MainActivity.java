package com.example.projekt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    static final String Username = "admin";
    static final String Password = "123";
    static final String WrongData = "Incorrect Username or Password - Please try again";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);
                EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);

                if(usernameEditText.getText().toString().equals(Username) && passwordEditText.getText().toString().equals(Password))
                {
                    Intent startIntent = new Intent(getApplicationContext(), ChooseActivity.class);
                    startIntent.putExtra("com.example.projekt.succesfull", "LOGGED IN!");
                    startActivity(startIntent);
                }
                else
                {
                    TextView wrongdataTextView = (TextView) findViewById(R.id.wrongdataTextView);
                    wrongdataTextView.setText(WrongData);
                }
            }
        });
    }
}
