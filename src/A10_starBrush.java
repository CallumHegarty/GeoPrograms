import java.awt.*;
public class A10_starBrush extends World{
    public void go() {

        plane.pausetime = 0;
        plane.startingAngle(0);
        plane.trailWidth = 3;
        plane.isTrail = true;

        int minrgb = 50;
        int maxrgb = 255;

        for(int x=0;x<500000;x=x+1) {

            int randomr = (int)Math.floor(Math.random()*(maxrgb-minrgb+1)+minrgb);
            int randomg = (int)Math.floor(Math.random()*(maxrgb-minrgb+1)+minrgb);
            int randomb = (int)Math.floor(Math.random()*(maxrgb-minrgb+1)+minrgb);

            Point p = MouseInfo.getPointerInfo().getLocation();
            int mousex = p.x - 435;
            int mousey = p.y - 100;

            plane.teleport(mousex, mousey);
            plane.setColor(randomr,randomg,randomb);

            for(int y=0;y<5;y=y+1) {
                plane.turn(144);
                plane.move(30);
            }
        }
    }
}
