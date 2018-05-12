package mx.edu.ittepic.tpdm_unit4_project;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by ClownToy on 09/05/2018.
 */

public class GameView extends View {
    Bitmap background;
    int pointerRed,pointerBlue;
    Thread playerC,playerO;



    public GameView(Context context) {
        super(context);
        background= BitmapFactory.decodeResource(Resources.getSystem(),R.drawable.skyp);
        playerC=new Thread(){
            @Override
            public void run() {

            }
        };
        playerO=new Thread(){
            @Override
            public void run(){

            }
        };

    }
    @Override
    public void onDraw(Canvas c){
        Paint p=new Paint();
        p.setTextSize(30);
        c.drawBitmap(background,0,0,p);
        p.setARGB(255,255,0,0);
        c.drawText(pointerRed+"",40,(getHeight()/2)+20,p);
        p.setARGB(255,0,0,255);
        c.drawText(pointerBlue+"",getWidth()-40,(getHeight()/2)+20,p);
        p.setARGB(255,255,255,255);
        c.drawText("-",getWidth()-10,getHeight()-10,p);


    }

    public boolean onTouchScreen(MotionEvent e){

        switch(e.getAction()){
            case MotionEvent.ACTION_DOWN:

                break;
            case MotionEvent.ACTION_MOVE:

                break;
            case MotionEvent.ACTION_UP:

                break;
            default:break;
        }
        return false;
    }
}
