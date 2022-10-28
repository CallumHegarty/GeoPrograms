public class A11_Scene extends World {

    public void go () {
        plane.pausetime = 0;
        plane.startingAngle(0);
        plane.trailWidth = 5;
        plane.isTrail = true;
        square(300);
        triangle();
    }

    public void triangle() {
        for(int x=0;x<3;x=x+1) {
            plane.move(100);
            plane.turn(120);
        }
    }

    public void square(int sideLength) {
        for(int x=0;x<4;x=x+1) {
            plane.move(sideLength);
            plane.turn(90);
        }
    }

    public void bigSquare(int sideLength) {
        for(int x=0;x<4;x=x+1) {
            plane.move(sideLength);
            plane.turn(90);
        }
    }

    public void house() {
        plane.setColor(0,0,200);
        square(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(270);
        plane.setColor(200,0,0);
        triangle();
        plane.setColor(0,0,200);
        plane.move(100);
    }

}
