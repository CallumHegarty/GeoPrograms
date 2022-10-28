public class A12_Painting extends World {
    public void go () {
        plane.isTrail = false;
        plane.pausetime = 0;
        plane.trailWidth = 5;

        plane.turn(180);
        plane.move(50);
        plane.turn(90);
        plane.move(50);
        plane.turn(180);
        plane.isTrail = true;

        frame();

        plane.isTrail = false;
        plane.turn(315);
        plane.move(322);
        plane.turn(90);
        plane.move(3);

        ground();

        plane.trailWidth = 10;
        plane.turn(180);
        plane.move(200);
        plane.turn(180);

        house();

        plane.turn(90);
        plane.isTrail = false;
        plane.move(30);
        plane.move(200);
        plane.turn(270);
        plane.isTrail = true;

        tree();

        plane.turn(45);
        plane.isTrail = false;
        plane.move(200);
        plane.turn(315);
        plane.move(40);
    }

    public void frame() {
        plane.setColor(172,93,9);

        for (int x = 0; x < 2; x = x + 1) {
            plane.move(700);
            plane.turn(270);
            plane.move(350);
            plane.turn(270);
        }

        plane.isTrail = false;
        plane.turn(90);
        plane.move(50);
        plane.turn(225);
        plane.isTrail = true;

        for (int x = 0; x < 2; x = x + 1) {

            for (int y = 0; y < 10; y = y + 1) {
                plane.move(50);
                plane.turn(90);
                plane.move(50);
                plane.turn(270);
            }

            plane.move(50);
            plane.turn(270);

            for (int z = 0; z < 5; z = z + 1) {
                plane.move(50);
                plane.turn(90);
                plane.move(50);
                plane.turn(270);
            }

            plane.move(80);
            plane.turn(270);
        }

    }
    public void ground() {
        plane.trailWidth = 80;
        plane.isTrail = true;
        plane.setColor(38,171,14);
        plane.move(616);
    }
    public void square(int sideLength) {
        for(int x=0;x<4;x=x+1) {
            plane.move(sideLength);
            plane.turn(90);
        }
    }
    public void triangle() {
        for(int x=0;x<3;x=x+1) {
            plane.move(100);
            plane.turn(120);
        }
    }
    public void house() {
        plane.setColor(244,223,4);

        square(120);

        plane.move(120);

        square(80);

        plane.move(80);
        plane.turn(90);
        plane.move(80);
        plane.setColor(206,8,8);
        plane.trailWidth = 15;
        plane.turn(63.435);
        plane.move(89.44);
        plane.move(67.082);
        plane.turn(53.13);
        plane.move(67.082);

        plane.isTrail = false;
        plane.turn(63.435);
        plane.move(120);
        plane.turn(90);
        plane.move(30);
        plane.turn(90);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.setColor(172,101,0);

        plane.move(50);
        plane.turn(270);
        plane.move(30);
        plane.turn(270);
        plane.move(50);
        plane.turn(270);
        plane.move(30);
        plane.turn(270);
    }
    public void tree(){
        plane.trailWidth = 20;
        plane.setColor(128,79,10);
        plane.move(75);

        plane.isTrail = false;
        plane.turn(90);
        plane.move(50);
        plane.turn(180);
        plane.isTrail = true;
        plane.setColor(10,128,15);

        triangle();
    }
}
