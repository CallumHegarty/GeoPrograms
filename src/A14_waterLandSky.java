public class A14_waterLandSky extends World{
    public void go() {
        plane.pausetime = 0;

        for (int x = 0; x < 2; x = x + 1) {
            plane.startingAngle(90);
            plane.teleport(plane.random(0, 800), 300);
            tree(plane.random(20, 80));
            plane.teleport(plane.random(0, 800), 300);
            house(plane.random(50, 100));
            plane.teleport(plane.random(0, 800), 300);
            circle(plane.random(10,75));
        }
    }

    public void tree(int treeSize){
        plane.trailWidth = 20;
        plane.isTrail = true;
        plane.startingAngle(270);
        plane.setColor(plane.random(0,256),plane.random(0,256),plane.random(0,256));
        plane.move(treeSize);

        plane.turn(90);

        plane.isTrail = false;
        plane.move(treeSize/1.5);
        plane.turn(180);
        plane.isTrail = true;

        plane.setColor(plane.random(0,256),plane.random(0,256),plane.random(0,256));
        triangle(treeSize);
    }
    public void house(int houseSize) {
        plane.setColor(plane.random(0,256),plane.random(0,256),plane.random(0,256));
        plane.trailWidth = 15;
        plane.startingAngle(0);

        square(houseSize);

        plane.move(houseSize);

        square(houseSize/2*3/2);

        plane.move(houseSize/2*3/2);
        plane.turn(90);
        plane.move(houseSize/2*3/2);
        plane.setColor(plane.random(0,256),plane.random(0,256),plane.random(0,256));
        plane.trailWidth = 15;
        plane.turn(63.435);
        plane.move(houseSize/1.34);
        plane.move(houseSize/1.789);
        plane.turn(53.13);
        plane.move(houseSize/1.789);

        plane.isTrail = false;
        plane.turn(63.435);
        plane.move(houseSize);
        plane.turn(90);
        plane.move(houseSize/4);
        plane.turn(90);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.setColor(plane.random(0,256),plane.random(0,256),plane.random(0,256));

        plane.move(houseSize/2.4);
        plane.turn(270);
        plane.move(houseSize/4);
        plane.turn(270);
        plane.move(houseSize/2.4);
        plane.turn(270);
        plane.move(houseSize/4);
        plane.turn(270);
    }
    public void triangle(int triangleSize) {
        for(int x=0;x<3;x=x+1) {
            plane.move(triangleSize*4/3);
            plane.turn(120);
        }
    }
    public void square(int sideLength) {
        for(int x=0;x<4;x=x+1) {
            plane.move(sideLength);
            plane.turn(90);
        }
    }
    public void circle(int circleSize) {
        plane.isTrail = false;
        plane.move(circleSize);
        plane.setColor(plane.random(0,256),plane.random(0,256),plane.random(0,256));
        plane.isTrail = true;
        plane.circle(circleSize);
    }
}