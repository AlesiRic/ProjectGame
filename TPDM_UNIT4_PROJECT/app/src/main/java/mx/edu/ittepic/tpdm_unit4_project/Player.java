package mx.edu.ittepic.tpdm_unit4_project;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by ClownToy on 09/05/2018.
 */

public class Player {
    Bitmap ship;

    int x,y,shootColor;


    public Player(int a, int b, Sesion s){
        //Clase sesion, tiene que vincularse con el servidor, el if con !=null es por mientras
        if(s!=null) {
            ship = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.shipr);
            shootColor=1;
        }
        else{
            ship = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.shipb);
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

    public boolean collision(Shoot h){

        if(x>=h.x && x+ship.getWidth()<=h.x+h.shootLaser.getWidth() && y>=h.y && y<=h.y+h.shootLaser.getWidth()){
            return true;
        }
        return false;
    }




}
