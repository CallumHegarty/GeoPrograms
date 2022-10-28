public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail=true;
        plane.pausetime = 0;
        plane.trailWidth = 10;
        plane.teleport(0,0);
        grid(25);

        plane.teleport(480,400);
        plane.turn(180);
    }

    public void grid(int squareSize) {
        for (int x = 0; x < 16; x = x + 1) {
            twoRows(squareSize);
        }
    }

    public void twoRows(int squareSize) {
        int color = plane.random(200,255);
        for (int x = 0; x < 50; x = x + 1) {
            plane.setColor(100,color,100);
            System.out.println(x);
            plane.square(squareSize);
            plane.isTrail = false;
            plane.turn(90);
            plane.move(squareSize);
            plane.turn(270);
            color = color-2;
        }
        plane.isTrail = false;
        plane.move(squareSize);
        plane.turn(270);
        plane.move(squareSize);
        plane.turn(90);

        for (int x = 0; x < 50; x = x + 1) {
            plane.setColor(100,color,100);
            System.out.println(x);
            plane.square(squareSize);
            plane.isTrail = false;
            plane.turn(270);
            plane.move(squareSize);
            plane.turn(90);
            color = color-2;
        }
        plane.turn(90);
        plane.move(squareSize);
        plane.turn(270);
        plane.move(squareSize);
    }
}
