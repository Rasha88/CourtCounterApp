package com.example.android.courtcounterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0 ,scoreTeamB = 0;
    int threeForTeamACount = 0 ,threeForTeamBCount = 0 ;
    int twoForTeamACount = 0 , twoForTeamBCount = 0;
    int freeThrowForTeamACount = 0 , freeThrowForTeamBCount = 0;

    Button threeForTeamA_btn ,threeForTeamB_btn ,twoForTeamA_btn ,twoForTeamB_btn ,freeThrowForTeamA_btn ,freeThrowForTeamB_btn;
    TextView scoreAView ,scoreBView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        threeForTeamA_btn = (Button) findViewById(R.id.threeForTeamA_btn);
        threeForTeamB_btn = (Button) findViewById(R.id.threeForTeamB_btn);
        twoForTeamA_btn = (Button) findViewById(R.id.twoForTeamA_btn);
        twoForTeamB_btn = (Button) findViewById(R.id.twoForTeamB_btn);
        freeThrowForTeamA_btn = (Button) findViewById(R.id.freeThrowForTeamA_btn);
        freeThrowForTeamB_btn = (Button) findViewById(R.id.freeThrowForTeamB_btn);

        scoreAView = (TextView) findViewById(R.id.team_a_score);
        scoreBView = (TextView) findViewById(R.id.team_b_score);
    }

    /**
     * Increase the score for Team A by 3
     */
    public void addThreeForTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

        threeForTeamACount++;
        threeForTeamA_btn.setText("Three ( " + String.valueOf(threeForTeamACount) + " )");
    }

    /**
     * Increase the score for Team B by 3
     */
    public void addThreeForTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);

        threeForTeamBCount++;
        threeForTeamB_btn.setText("Three ( " + String.valueOf(threeForTeamBCount) + " )");
    }

    /**
     * Increase the score for Team A by 2
     */
    public void addTwoForTeamA(View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);

        twoForTeamACount++;
        twoForTeamA_btn.setText("Two ( " + String.valueOf(twoForTeamACount) + " )");
    }

    /**
     * Increase the score for Team B by 2
     */
    public void addTwoForTeamB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);

        twoForTeamBCount++;
        twoForTeamB_btn.setText("Two ( " + String.valueOf(twoForTeamBCount) + " )");
    }

    /**
     * Increase the score for Team A by 1
     */
    public void addOneForTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

        freeThrowForTeamACount++;
        freeThrowForTeamA_btn.setText("Free Throw ( " + String.valueOf(freeThrowForTeamACount) + " )");
    }

    /**
     * Increase the score for Team B by 1
     */
    public void addOneForTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

        freeThrowForTeamBCount++;
        freeThrowForTeamB_btn.setText("Free Throw ( " + String.valueOf(freeThrowForTeamBCount) + " )");
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        scoreAView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        scoreBView.setText(String.valueOf(score));
    }

    public  void resetScore(View view){

        scoreAView.setText(String.valueOf("0"));
        scoreBView.setText(String.valueOf("0"));

        threeForTeamA_btn.setText("Three ( 0 )");
        threeForTeamB_btn.setText("Three ( 0 )");
        twoForTeamA_btn.setText("Two ( 0 )");
        twoForTeamB_btn.setText("Two ( 0 )");
        freeThrowForTeamA_btn.setText("Free Throw ( 0 )");
        freeThrowForTeamB_btn.setText("Free Throw ( 0 )");

        scoreTeamA = 0 ; scoreTeamB = 0;
        threeForTeamACount = 0 ; threeForTeamBCount = 0 ;
        twoForTeamACount = 0 ; twoForTeamBCount = 0;
        freeThrowForTeamACount = 0 ; freeThrowForTeamBCount = 0;

    }
}
