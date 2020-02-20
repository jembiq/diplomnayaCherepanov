package com.example.diplomnushkacherepanov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class AuthActivity extends AppCompatActivity {

    private static final String PIN = "pin";
    private SharedPreferences sharedPref;

    ImageView dot1;
    ImageView dot2;
    ImageView dot3;
    ImageView dot4;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    Button clearBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        init();
    }

    private void init() {
        String pinCode;

        dot1 = findViewById(R.id.pin_dot1_x);
        dot2 = findViewById(R.id.pin_dot2_x);
        dot3 = findViewById(R.id.pin_dot3_x);
        dot4 = findViewById(R.id.pin_dot4_x);

        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
        clearBtn = findViewById(R.id.clear_btn);

        sharedPref = getSharedPreferences("pinSaver", MODE_PRIVATE);

        pinCode = enterPinCode();

    }

    private String enterPinCode() {
        final String[] pin = {""};
        final int pinLength = pin[0].length();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "0";

                    pinDotON(pinLength);
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "1";

                    pinDotON(pinLength);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "2";

                    pinDotON(pinLength);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "3";

                    pinDotON(pinLength);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "4";

                    pinDotON(pinLength);
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "5";

                    pinDotON(pinLength);
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "6";

                    pinDotON(pinLength);
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "7";

                    pinDotON(pinLength);
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "8";

                    pinDotON(pinLength);
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "9";

                    pinDotON(pinLength);
                }
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pin[0].length() < 3) {
                    pin[0] = "";
                }
            }
        });

        if (pin[0].length() == 3) {
            Toast.makeText(this
                    , "correct pin!"
                    , Toast.LENGTH_SHORT)
                    .show();
            return pin[0];
        }

        return null;
    }

    private void pinDotON(int pinLength) {
        switch (pinLength) {
            case 0 :
                dot1.setVisibility(View.VISIBLE);
                break;

            case 1 :
                dot2.setVisibility(View.VISIBLE);
                break;

            case 2 :
                dot3.setVisibility(View.VISIBLE);
                break;

            case 3 :
                dot4.setVisibility(View.VISIBLE);
                break;
        }
    }
}
