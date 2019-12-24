package com.tts.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    SpaceView game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.arrow_up).setOnClickListener(this);
        findViewById(R.id.arrow_down).setOnClickListener(this);
        findViewById(R.id.arrow_left).setOnClickListener(this);
        findViewById(R.id.arrow_right).setOnClickListener(this);
        game = findViewById(R.id.game);



    }
    public void MoveUp(){
        game.setPoxsY(game.getPoxsY() - 50);
    }
    public  void MoveDown(){
        game.setPoxsY(game.getPoxsY() + 50);
    }
    public  void MoveLeft(){
        game.setPoxsX(game.getPoxsX() - 50);
    }
    public  void MoveRight(){
        game.setPoxsX(game.getPoxsX() + 50);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.arrow_up:
                Log.d("mainactivity", "onClick: up");
                MoveUp();
                game.invalidate();
                break;
            case R.id.arrow_down:
                Log.d("mainactivity", "onClick:down ");
                MoveDown();
                game.invalidate();
                break;
            case R.id.arrow_left:
                Log.d("mainactivity", "onClick: left");
                MoveLeft();
                game.invalidate();
                break;
            case R.id.arrow_right:
                Log.d("mainactivity", "onClick: right");
                MoveRight();
                game.invalidate();
                break;
        }


    }
}
