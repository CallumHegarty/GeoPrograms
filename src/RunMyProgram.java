import java.awt.Robot;

/**
 * Created by chales on 3/3/2018.
 */
public class RunMyProgram {
    public static void main(String[] args) {
        World run;

        run = (new C1_finalAssignment());
        run.planeIcon = "plane.png";
        run.pictureFileName="CartoonSea.jpg";
        run.HEIGHT=705;
        run.WIDTH=995;
        run.Refresh();

        //new Thread(run).start();
    }
}
