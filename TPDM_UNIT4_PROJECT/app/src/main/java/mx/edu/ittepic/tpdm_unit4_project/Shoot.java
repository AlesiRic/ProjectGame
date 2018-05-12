package mx.edu.ittepic.tpdm_unit4_project;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by ClownToy on 09/05/2018.
 */

public class Shoot {
    Bitmap shootLaser;

    //des,reazón de desplazamiento del disparo
    //x,y: coordenadas de la posicion del tiro
    int des,x,y;

    int[][] coor=new int[4][2];

    boolean hit;
    public Shoot(Player p){
        if(p.shootColor==1) {
            shootLaser = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.shooty);
        }
        if(p.shootColor==2) {
            shootLaser = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.shootp);
        }
        x=p.getX()+36;
        y=p.getY();
        des=8;

//coordenadas para la colisión
        coor[0][0]=x;
        coor[0][1]=y;
        coor[1][0]=x+shootLaser.getWidth();
        coor[1][1]=y;
        coor[2][0]=x+shootLaser.getWidth();
        coor[2][1]=y+shootLaser.getHeight();
        coor[3][0]=x;
        coor[3][1]=y+shootLaser.getHeight();




    }

    public Shoot(Player2 p){
        if(p.shootColor==1) {
            shootLaser = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.shootp);
        }
        if(p.shootColor==2) {
            shootLaser = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.shooty);
        }
        x=p.getX()+36;
        y=p.getY();
        des=-8;
    }
    public void movement(){
        y=y+des;
    }





}
