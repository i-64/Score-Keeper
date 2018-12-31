package com.example.mrunalahire.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int scoreA,scoreB;
    public TextView scoreTeamA,scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTeamA=(TextView) findViewById(R.id.score_team_a);
        scoreTeamB=(TextView) findViewById(R.id.score_team_b);
    }

    //team a functionality

    public void plusThreeTeamA(View view){
        scoreA+=3;
        updateScoreA();
    }

    public void plusTwoTeamA(View view){
        scoreA+=2;
        updateScoreA();
    }

    public void plusOneTeamA(View view){
        scoreA+=1;
        updateScoreA();
    }

    private void updateScoreA(){
        scoreTeamA.setText(Integer.toString(scoreA));
    }

    //team b functionality

    public void plusThreeTeamB(View view){
        scoreB+=3;
        updateScoreB();
    }

    public void plusTwoTeamB(View view){
        scoreB+=2;
        updateScoreB();
    }

    public void plusOneTeamB(View view){
        scoreB+=1;
        updateScoreB();
    }

    private void updateScoreB(){
        scoreTeamB.setText(Integer.toString(scoreB));
    }

    //reset scores

    public void resetScores(View view){
        scoreA=0;
        scoreB=0;
        updateScoreB();
        updateScoreA();
    }

}
