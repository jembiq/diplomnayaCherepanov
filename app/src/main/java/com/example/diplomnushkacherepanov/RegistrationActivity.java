package com.example.diplomnushkacherepanov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    EditText pinInputField;
    Button confirmBtn;
    private SharedPreferences sharedPref;
    private String pin;
    private static final String PIN = "pin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);

        init();
    }

    private void init() {
        pinInputField = findViewById(R.id.pin_field);
        confirmBtn = findViewById(R.id.confirm_btn);
        sharedPref = getSharedPreferences("pinSaver", MODE_PRIVATE);

        final Intent authIntent = new Intent(RegistrationActivity.this, AuthActivity.class);
        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (pinInputField.getText().toString().length() == 4) {

                    pin = pinInputField.getText().toString();

                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString(PIN, pin);
                    editor.apply();

                    authIntent.putExtra("pin", sharedPref.getString(PIN, ""));
                    startActivity(authIntent);

                } else {

                    Toast.makeText(RegistrationActivity.this
                            , "pin must contain 4 numbers"
                            , Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}
