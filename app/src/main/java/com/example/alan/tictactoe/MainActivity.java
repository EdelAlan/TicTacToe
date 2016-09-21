package com.example.alan.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    boolean isTurn; //true - X's turn, false = O's turn
    int turnCount = 0; // counts number of turns

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
                turnCount++;
                endGame();
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
                turnCount++;
                endGame();
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
                turnCount++;
                endGame();
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
                turnCount++;
                endGame();
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
                turnCount++;
                endGame();
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
                turnCount++;
                endGame();
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
                turnCount++;
                endGame();
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
                turnCount++;
                endGame();
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
                turnCount++;
                endGame();
            }
        });
    }

    private void endGame() {
        String button1, button2, button3, button4, button5, button6, button7, button8, button9;
        boolean isOver = false;

        button1 = b1.getText().toString();
        button2 = b2.getText().toString();
        button3 = b3.getText().toString();
        button4 = b4.getText().toString();
        button5 = b5.getText().toString();
        button6 = b6.getText().toString();
        button7 = b7.getText().toString();
        button8 = b8.getText().toString();
        button9 = b9.getText().toString();

        // all possible outcomes in the game
        if (button1.equals("X") && button2.equals("X") && button3.equals("X")
                || button4.equals("X") && button5.equals("X") && button6.equals("X")
                || button7.equals("X") && button8.equals("X") && button9.equals("X")
                || button1.equals("X") && button4.equals("X") && button7.equals("X")
                || button2.equals("X") && button5.equals("X") && button8.equals("X")
                || button3.equals("X") && button6.equals("X") && button9.equals("X")
                || button1.equals("X") && button5.equals("X") && button9.equals("X")
                || button3.equals("X") && button5.equals("X") && button7.equals("X")) {
            Toast.makeText(MainActivity.this, "X wins", Toast.LENGTH_LONG).show();
            isOver = true;

        } else if (button1.equals("O") && button2.equals("O") && button3.equals("O")
                || button4.equals("O") && button5.equals("O") && button6.equals("O")
                || button7.equals("O") && button8.equals("O") && button9.equals("O")
                || button1.equals("O") && button4.equals("O") && button7.equals("O")
                || button2.equals("O") && button5.equals("O") && button8.equals("O")
                || button3.equals("O") && button6.equals("O") && button9.equals("O")
                || button1.equals("O") && button5.equals("O") && button9.equals("O")
                || button3.equals("O") && button5.equals("O") && button7.equals("O")) {
            Toast.makeText(MainActivity.this, "O wins", Toast.LENGTH_LONG).show();
            isOver = true;
        } else if (turnCount == 9) {
            Toast.makeText(MainActivity.this, "Draw", Toast.LENGTH_LONG).show();
            isOver = true;
        }

        if (isOver) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }

    }
}
