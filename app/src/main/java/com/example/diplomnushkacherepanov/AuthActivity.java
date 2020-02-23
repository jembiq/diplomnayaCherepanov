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

        enterPinCode();

    }

    private String enterPinCode() {
        final String[] pin = {""};

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "0";

                    pinDotON(pin[0].length());
                }

                pinChecker(pin[0]);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "1";

                    pinDotON(pin[0].length());
                }

                pinChecker(pin[0]);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "2";

                    pinDotON(pin[0].length());
                }

                pinChecker(pin[0]);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "3";

                    pinDotON(pin[0].length());
                }

                pinChecker(pin[0]);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "4";

                    pinDotON(pin[0].length());
                }

                pinChecker(pin[0]);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "5";

                    pinDotON(pin[0].length());
                }

                pinChecker(pin[0]);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "6";

                    pinDotON(pin[0].length());
                }

                pinChecker(pin[0]);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "7";

                    pinDotON(pin[0].length());
                }

                pinChecker(pin[0]);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "8";

                    pinDotON(pin[0].length());
                }

                pinChecker(pin[0]);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pin[0].length() < 4) {
                    pin[0] += "9";

                    pinDotON(pin[0].length());
                }

                pinChecker(pin[0]);
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot1.setVisibility(View.INVISIBLE);
                dot2.setVisibility(View.INVISIBLE);
                dot3.setVisibility(View.INVISIBLE);
                dot4.setVisibility(View.INVISIBLE);

                pin[0] = "";
            }
        });

        if (pin[0].length() == 3 & pin[0].equals(getIntent().getStringExtra("pin"))) {
            Toast.makeText(this
                    , "correct pin!"
                    , Toast.LENGTH_SHORT)
                    .show();
            return pin[0];
        }

        return null;
    }

    private String pinChecker(String pin) {
        if (pin.length() == 4) {

            if (pin.equals(getIntent().getStringExtra("pin"))) {

                Toast.makeText(this
                        , "correct pin!"
                        , Toast.LENGTH_SHORT)
                        .show();

                pin = "";

            }

        }

        if (pin.length() == 4 & !pin.equals(getIntent().getStringExtra("pin"))) {
            Toast.makeText(this
                    , "incorrect pin!"
                    , Toast.LENGTH_SHORT)
                    .show();

            dot1.setVisibility(View.INVISIBLE);
            dot2.setVisibility(View.INVISIBLE);
            dot3.setVisibility(View.INVISIBLE);
            dot4.setVisibility(View.INVISIBLE);

            pin = "";
        }

        return pin;
    }

    private void pinDotON(int pinLength) {
        switch (pinLength) {
            case 1 :
                dot1.setVisibility(View.VISIBLE);
                break;

            case 2 :
                dot2.setVisibility(View.VISIBLE);
                break;

            case 3 :
                dot3.setVisibility(View.VISIBLE);
                break;

            case 4 :
                dot4.setVisibility(View.VISIBLE);
                break;
        }
    }
}
