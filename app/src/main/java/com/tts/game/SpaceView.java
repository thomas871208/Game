package com.tts.game;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import javax.security.auth.PrivateCredentialPermission;

import androidx.annotation.Nullable;

public class SpaceView extends View {
    private float poxsX , poxsY = 400;



    public SpaceView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        canvas.drawLine(400,0,0,600, paint);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.neko);
        canvas.drawBitmap(bitmap,poxsX,poxsY,paint);
        Log.d("game", "onDraw: "+poxsX +"+"+poxsY);
    }

    public float getPoxsX() {

        return poxsX;
    }

    public float getPoxsY() {
        return poxsY;
    }

    public void setPoxsX(float poxsX) {
        if (poxsX >= 0 && poxsX <= getHeight()-450){
            this.poxsX = poxsX;
        }
    }

    public void setPoxsY(float poxsY) {
        if(poxsY >= 0 && poxsY<= getWidth()+30){
            this.poxsY = poxsY;
        }
    }
}
