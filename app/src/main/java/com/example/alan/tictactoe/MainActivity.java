package com.example.alan.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    boolean isTurn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        isTurn = true;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("")) {
                    if (isTurn) {
                        isTurn = false;
                        b1.setText("X");
                    } else if (!isTurn) {
                        isTurn = true;
                        b1.setText("O");
                    }
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("")) {
                    if (isTurn) {
                        isTurn = false;
                        b2.setText("X");
                    } else if (!isTurn) {
                        isTurn = true;
                        b2.setText("O");
                    }
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals("")) {
                    if (isTurn) {
                        isTurn = false;
                        b3.setText("X");
                    } else if (!isTurn) {
                        isTurn = true;
                        b3.setText("O");
                    }
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("")) {
                                    if (isTurn) {
                                        isTurn = false;
                                        b4.setText("X");
                                    } else if (!isTurn) {
                                        isTurn = true;
                                        b4.setText("O");
                                    }
                                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("")) {
                                    if (isTurn) {
                                        isTurn = false;
                                        b5.setText("X");
                                    } else if (!isTurn) {
                                        isTurn = true;
                                        b5.setText("O");
                                    }
                                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("")) {
                                    if (isTurn) {
                                        isTurn = false;
                                        b6.setText("X");
                                    } else if (!isTurn) {
                                        isTurn = true;
                                        b6.setText("O");
                                    }
                                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals("")) {
                                    if (isTurn) {
                                        isTurn = false;
                                        b7.setText("X");
                                    } else if (!isTurn) {
                                        isTurn = true;
                                        b7.setText("O");
                                    }
                                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("")) {
                                    if (isTurn) {
                                        isTurn = false;
                                        b8.setText("X");
                                    } else if (!isTurn) {
                                        isTurn = true;
                                        b8.setText("O");
                                    }
                                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("")) {
                                    if (isTurn) {
                                        isTurn = false;
                                        b9.setText("X");
                                    } else if (!isTurn) {
                                        isTurn = true;
                                        b9.setText("O");
                                    }
                                }
            }
        });
    }
}
