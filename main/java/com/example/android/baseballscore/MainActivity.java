package com.example.android.baseballscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.baseballscore.R;

public class MainActivity extends AppCompatActivity {
    // Tracks the score for Team A
    int scoreTeamA = 0;
    // Tracks the score for Team B
    int scoreTeamB = 0;
    // Tracks inning
    int inning = 0;
    // Tracks the number of outs
    int outs = 0;
    // Tracks the number of balls
    int balls = 0;
    // Tracks the number of strikes
    int strikes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }


    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase inning by 1 point.
     */
    public void increaseInning(View v) {
        inning = inning + 1;
        displayForInning(inning);

    }

    /**
     * Decrease inning by 1 point.
     */
    public void decreaseInning(View v) {
        if (inning > 0) {
            inning = inning - 1;
            displayForInning(inning);
        } else {
            inning = 0;
            displayForInning(inning);
        }
    }

    /**
     * Increase outs by 1 point.
     */
    public void addOneForOuts(View v) {
        if (outs < 3) {
            outs = outs + 1;
            displayForOuts(outs);
        } else {
            outs = 0;
            strikes = 0;
            balls = 0;
            displayForStrikes(strikes);
            displayForBalls(balls);
            displayForOuts(outs);
        }
    }

    /**
     * Increase balls by 1 point.
     */
    public void addOneForBalls(View v) {
        if (balls < 4) {
            balls = balls + 1;
            displayForBalls(balls);
        } else {
            balls = 0;
            displayForBalls(balls);
        }
    }

    /**
     * Increase strikes by 1 point.
     */
    public void addOneForStrikes(View v) {
        if (strikes < 3) {
            strikes = strikes + 1;
            displayForStrikes(strikes);
        } else {
            strikes = 0;
            displayForStrikes(strikes);
        }
    }


    /**
     * Reset scores.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        outs = 0;
        balls = 0;
        strikes = 0;
        inning = 0;
        displayForOuts(outs);
        displayForBalls(balls);
        displayForStrikes(strikes);
        displayForInning(inning);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset balls, strikes.
     */
    public void nextBatter(View v) {
        strikes = 0;
        balls = 0;
        displayForStrikes(strikes);
        displayForBalls(balls);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays innings.
     */
    public void displayForInning(int score) {
        TextView scoreView = (TextView) findViewById(R.id.inning);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of outs.
     */
    public void displayForOuts(int score) {
        TextView scoreView = (TextView) findViewById(R.id.outs);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of balls.
     */
    public void displayForBalls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.balls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the number of strikes.
     */
    public void displayForStrikes(int score) {
        TextView scoreView = (TextView) findViewById(R.id.strikes);
        scoreView.setText(String.valueOf(score));
    }
}
