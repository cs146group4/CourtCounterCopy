package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneTeamA(View view)
    {
        scoreTeamA +=1;
        displayForTeamA();
    }

    public void addTwoTeamA(View view)
    {
        scoreTeamA +=2;
        displayForTeamA();
    }

    public void addThreeTeamA(View view)
    {
        scoreTeamA +=3;
        displayForTeamA();
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void addOneTeamB(View view)
    {
        scoreTeamB +=1;
        displayForTeamB();
    }

    public void addTwoTeamB(View view)
    {
        scoreTeamB +=2;
        displayForTeamB();
    }

    public void addThreeTeamB(View view)
    {
        scoreTeamB +=3;
        displayForTeamB();
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    public void reset(View view)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA();
        displayForTeamB();
    }
}
