package com.mrbaker823.gtgame;

import android.app.Activity;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;

import com.mrbaker823.gtgame.Board;
import com.mrbaker823.gtgame.R;

public class WarGame extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_war_game);
        
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        
        System.out.printf("%d x %d",width,height);
        
        System.out.println(Board.BOARDSIZE);
        System.out.println("1");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_war_game, menu);
        return true;
    }

    
}