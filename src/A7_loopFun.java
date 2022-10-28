public class A7_loopFun extends World {

    public void go() {
        plane.isTrail = true;
        plane.pausetime = 0;
        plane.startingAngle(0);
        plane.trailWidth = 3;

        int minx = 150;
        int maxx = 900;

        int miny = 150;
        int maxy = 700;

        int minrgb = 0;
        int maxrgb = 255;


        for(int x=0;x<200;x=x+1) {

            int randomx = (int)Math.floor(Math.random()*(maxx-minx+1)+minx);
            int randomy = (int)Math.floor(Math.random()*(maxy-miny+1)+miny);

            int randomr = (int)Math.floor(Math.random()*(maxrgb-minrgb+1)+minrgb);
            int randomg = (int)Math.floor(Math.random()*(maxrgb-minrgb+1)+minrgb);
            int randomb = (int)Math.floor(Math.random()*(maxrgb-minrgb+1)+minrgb);

            plane.teleport(randomx, randomy);
            plane.setColor(randomr,randomg,randomb);

                for(int y=0;y<5;y=y+1) {
                plane.turn(144);
                plane.move(100);
                }

        }



    }
}
