public class C1_finalAssignment extends World{
    public int red;
    public int blue;
    public int green;

    public void go(){
        plane.showBackGround();
        plane.pausetime = 0;
        colorChange();
        plane.isTrail = true;
        for(int x=0;x<10;x=x+1) {
            plane.teleport(plane.random(100,900),plane.random(200,300));
            fish(plane.random(20,80));
            plane.startingAngle(90);
        }
    }
    public void fish(int fishSize){
        red = plane.howMuchRed();
        green = plane.howMuchGreen();
        blue = plane.howMuchBlue();
        if (red+green+blue>505){
            plane.setColor(plane.random(0, 100), plane.random(0, 100), plane.random(0, 100));
        }
        if (red+green+blue<505){
            plane.setColor(plane.random(100, 255), plane.random(100, 255), plane.random(100, 255));
        }

        plane.trailWidth = plane.random(4,8);
        triangle(fishSize);
        plane.move(fishSize);
        plane.turn(180);
        triangle(fishSize);
        plane.turn(300);
        plane.move(fishSize);
        plane.turn(300);
        triangle(fishSize/2);

    }
    public void triangle(int triSize) {

        for(int x=0;x<3;x=x+1) {
            plane.move(triSize);
            plane.turn(120);
        }
    }
    public void colorChange(){
        for(int row=125; row<705; row=row+1){
            for(int col=0; col<995; col=col+1){
                plane.teleport(col, row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (200<blue&&blue<245){
                    plane.setPixelColor(red,green,col/4);
                }
            }
        }
    }
}
