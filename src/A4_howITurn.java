public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.startingAngle(45);
        plane.isTrail = true;

        // I take things slowly
        plane.pausetime = 0;

        // I am a large person
        plane.trailWidth = 20;

        // I am pretty peaceful
        plane.setColor(255, 255, 255);
        plane.move(150);
        plane.turn(120);

        // I am calm and relaxed
        plane.setColor(112, 112, 112);
        plane.move(150);
        plane.turn(120);

        // Sometimes I have a lot of energy
        plane.setColor(255,0,145);
        plane.move(150);
        plane.turn(120);

        plane.isTrail = false;
        plane.move(95);
        plane.turn(90);
        plane.move(45);
        plane.turn(315);


    }


}
