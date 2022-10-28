public class A13_letterC extends World{
    public void go() {
        plane.pausetime = 1;
        plane.turn(90);
        plane.move(400);
        plane.turn(180);
        plane.isTrail = true;

        c(1);

        //if(size>1){}
    }

    public void c(int size) {
        for(int y=0;y<size*20;y=y+1) {
            plane.turn(180/(size*20));
            plane.move(180/(size*20));
        }

    }
}
