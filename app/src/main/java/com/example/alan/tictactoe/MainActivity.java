package com.example.alan.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    static Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    String button1, button2, button3, button4, button5, button6, button7, button8, button9;
    static String[] cells = new String[9];

    boolean isTurn; //true - X's turn, false - O's turn
    boolean isOver;
    boolean isWinner; // true - X wins, false - o wins
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

        cells[0] = b1.getText().toString();
        cells[1] = b2.getText().toString();
        cells[2] = b3.getText().toString();
        cells[3] = b4.getText().toString();
        cells[4] = b5.getText().toString();
        cells[5] = b6.getText().toString();
        cells[6] = b7.getText().toString();
        cells[7] = b8.getText().toString();
        cells[8] = b9.getText().toString();

        isTurn = true;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("")) {
                    if (isTurn) {
                        isTurn = false;
                        b1.setText("X");
                    } else if (!isTurn) {

                    }
                }
                turnCount++;
                computerPlayer();
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

                    }
                }
                turnCount++;
                computerPlayer();
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

                    }
                }
                turnCount++;
                computerPlayer();
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

                    }
                }
                turnCount++;
                computerPlayer();
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

                    }
                }
                turnCount++;
                computerPlayer();
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

                    }
                }
                turnCount++;
                computerPlayer();
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

                    }
                }
                turnCount++;
                computerPlayer();
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
                        turnCount++;
                    } else if (!isTurn) {
                        computerPlayer();
                    }
                }
                endGame();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("")) {
                    if (isTurn) {
                        isTurn = false;
                        turnCount++;
                        b9.setText("X");
                    } else if (!isTurn) {
                        computerPlayer();
                    }
                }
                endGame();
            }
        });
    }

    //метод для алгоритма минимакс
    private void computerPlayer() {
        int moveLocation = move();

        isTurn = true;
        turnCount++;

        if (moveLocation == 1) {
            b1.setText("O");

        } else if (moveLocation == 2) {
            b2.setText("O");

        } else if (moveLocation == 3) {
            b3.setText("O");

        } else if (moveLocation == 4) {
            b4.setText("O");

        } else if (moveLocation == 5) {
            b5.setText("O");

        } else if (moveLocation == 6) {
            b6.setText("O");

        } else if (moveLocation == 7) {
            b7.setText("O");

        } else if (moveLocation == 8) {
            b8.setText("O");

        } else if (moveLocation == 9) {
            b9.setText("O");
        }
    }


    int move() {
        int[] result = minimax(2, "X"); // depth, max turn
        return result[1];   // row, col
    }

    private int[] minimax(int depth, String player) {
        // Generate possible next moves in a List of int[2] of {row, col}.
        List<Integer> nextMoves = generateMoves();

        // mySeed is maximizing; while oppSeed is minimizing
        int bestScore = (player.equals("O")) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        int currentScore;
        int bestMove = -1;

        if (nextMoves.isEmpty() || depth == 0) {
            // Gameover or depth reached, evaluate score
            bestScore = evaluate();
        } else {
            for (int move : nextMoves) {
                // Try this move for the current "player"
                cells[move] = player;
                if (player.equals("O")) {  // mySeed (computer) is maximizing player
                    currentScore = minimax(depth - 1, "X")[0];
                    if (currentScore > bestScore) {
                        bestScore = currentScore;
                        bestMove = move;
                    }
                } else {  // oppSeed is minimizing player
                    currentScore = minimax(depth - 1, "O")[0];
                    if (currentScore < bestScore) {
                        bestScore = currentScore;
                        bestMove = move;
                    }
                }
                // Undo move
                cells[move] = "";
            }
        }
        return new int[] {bestScore, bestMove};
    }

    /** The heuristic evaluation function for the current board
     @Return +100, +10, +1 for EACH 3-, 2-, 1-in-a-line for computer.
     -100, -10, -1 for EACH 3-, 2-, 1-in-a-line for opponent.
     0 otherwise   */
    private int evaluate() {
        int score = 0;
        // Evaluate score for each of the 8 lines (3 rows, 3 columns, 2 diagonals)
        score += evaluateLine(0, 1, 2);  // row 0
        score += evaluateLine(3, 4, 5);  // row 1
        score += evaluateLine(6, 7, 8);  // row 2
        score += evaluateLine(0, 3, 6);  // col 0
        score += evaluateLine(1, 4, 7);  // col 1
        score += evaluateLine(2, 5, 8);  // col 2
        score += evaluateLine(0, 4, 8);  // diagonal
        score += evaluateLine(2, 4, 6);  // alternate diagonal
        return score;
    }

    private int evaluateLine(int b0, int b1, int b2) {
        int score = 0;

        // First cell
        if (cells[b0].equals("X")) {
            score = 1;
        } else if (cells[b0].equals("O")) {
            score = -1;
        }

        // Second cell
        if (cells[b1].equals("X")) {
            if (score == 1) {   // cell1 is mySeed
                score = 10;
            } else if (score == -1) {  // cell1 is oppSeed
                return 0;
            } else {  // cell1 is empty
                score = 1;
            }
        } else if (cells[b1].equals("O")) {
            if (score == -1) { // cell1 is oppSeed
                score = -10;
            } else if (score == 1) { // cell1 is mySeed
                return 0;
            } else {  // cell1 is empty
                score = -1;
            }
        }

        // Third cell
        if (cells[b2].equals("X")) {
            if (score > 0) {  // cell1 and/or cell2 is mySeed
                score *= 10;
            } else if (score < 0) {  // cell1 and/or cell2 is oppSeed
                return 0;
            } else {  // cell1 and cell2 are empty
                score = 1;
            }
        } else if (cells[b2].equals("O")) {
            if (score < 0) {  // cell1 and/or cell2 is oppSeed
                score *= 10;
            } else if (score > 1) {  // cell1 and/or cell2 is mySeed
                return 0;
            } else {  // cell1 and cell2 are empty
                score = -1;
            }
        }
        return score;
    }

    private List<Integer> generateMoves() {
        List<Integer> nextMoves = new ArrayList<Integer>(); // allocate List

        cells[0] = b1.getText().toString();
        cells[1] = b2.getText().toString();
        cells[2] = b3.getText().toString();
        cells[3] = b4.getText().toString();
        cells[4] = b5.getText().toString();
        cells[5] = b6.getText().toString();
        cells[6] = b7.getText().toString();
        cells[7] = b8.getText().toString();
        cells[8] = b9.getText().toString();

        // If gameover, i.e., no next move
        if (isOver) {
            return nextMoves;   // return empty list
        }

        // Search for empty cells and add to the List
        for (int i = 0; i < cells.length; ++i) {
            if (cells[i].equals("")) {
                nextMoves.add(i);
            }
        }
        return nextMoves;
    }

    private void endGame() {
        isOver = false;

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
            isWinner = true;
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
            isWinner = false;
        }

        //disable all the buttons if the game is over
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
