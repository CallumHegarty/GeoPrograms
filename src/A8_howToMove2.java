public class A8_howToMove2 extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");
        plane.pausetime = 1;
        plane.trailWidth = 20;
        plane.setColor(0,150,0);
        plane.isTrail = true;

        plane.startingAngle(45);
        plane.move(300);
        plane.startingAngle(315);
        plane.move(100);

    }
}