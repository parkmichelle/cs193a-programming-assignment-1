// Michelle Park <mpark97@stanford.edu>
// RockPaperScissors - This app plays a simple game of rock, paper, scissors.

package com.example.michellepark.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int points = 0;
    private int move; // 1: rock, 2: paper, 3: scissors

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void pickRandomMove() {
        Random r = new Random();
        move = r.nextInt(3);
    }

    public void rockButtonClick(View view) {
        pickRandomMove();
        TextView instructionsView = (TextView) findViewById(R.id.instructions_view);
        TextView pointsView = (TextView) findViewById(R.id.points_view);
        switch (move) {
            case 1:
                instructionsView.setText("I chose rock! It's a tie.");
                break;
            case 2:
                instructionsView.setText("I chose paper! You lose.");
                points--;
                pointsView.setText("Points: " + String.valueOf(points));
                break;
            case 3:
                instructionsView.setText("I chose scissors! You win.");
                points++;
                pointsView.setText("Points: " + String.valueOf(points));
                break;
        }
    }

    public void paperButtonClick(View view) {
        pickRandomMove();
        TextView instructionsView = (TextView) findViewById(R.id.instructions_view);
        TextView pointsView = (TextView) findViewById(R.id.points_view);
        switch (move) {
            case 1:
                instructionsView.setText("I chose rock! You win.");
                points++;
                pointsView.setText("Points: " + String.valueOf(points));
                break;
            case 2:
                instructionsView.setText("I chose paper! It's a tie.");
                break;
            case 3:
                instructionsView.setText("I chose scissors! You lose.");
                points--;
                pointsView.setText("Points: " + String.valueOf(points));
                break;
        }
    }

    public void scissorsButtonClick(View view) {
        pickRandomMove();
        TextView instructionsView = (TextView) findViewById(R.id.instructions_view);
        TextView pointsView = (TextView) findViewById(R.id.points_view);
        switch (move) {
            case 1:
                instructionsView.setText("I chose rock! You lose.");
                points--;
                pointsView.setText("Points: " + String.valueOf(points));
                break;
            case 2:
                instructionsView.setText("I chose paper! You win.");
                points++;
                pointsView.setText("Points: " + String.valueOf(points));
                break;
            case 3:
                instructionsView.setText("I chose scissors! It's a tie.");
                break;
        }
    }

}
