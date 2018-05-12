package mx.edu.ittepic.tpdm_unit4_project;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;

/**
 * Created by ClownToy on 09/05/2018.
 */

public class Player2 {
    Bitmap ship;
    int x,y,shootColor;
    Matrix rot;
    public Player2(int a,int b,Sesion s){
        rot=new Matrix();
        rot.postRotate(180);
        if(s!=null) {
            ship=Bitmap.createBitmap(BitmapFactory.decodeResource(Resources.getSystem(),R.drawable.shipb),0,0,ship.getWidth(),ship.getHeight(),rot,true);
            shootColor=1;
        }
        else{
            ship=Bitmap.createBitmap(BitmapFactory.decodeResource(Resources.getSystem(),R.drawable.shipr),0,0,ship.getWidth(),ship.getHeight(),rot,true);
            shootColor=2;
        }
        x=a;
        y=b;


    }
        public void moveLeft(boolean press){
            if(press) {
                x-=12;

            }
        }

    public void moveRight(boolean press){
        if(press) {
            x+=12;

        }
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

}
