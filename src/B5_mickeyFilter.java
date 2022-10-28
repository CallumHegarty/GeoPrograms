public class B5_mickeyFilter extends World{
    public int red;
    public int blue;
    public int green;
    public void go() {
        plane.teleport(0, 0);
        plane.showBackGround();
        shoeFilter();
        pantFilter();
        noseFilter();
        eyeFilter();
    }

    public void shoeFilter() {
        for (int row = 520; row < 680; row = row + 1) {
            for (int col = 61; col < 418; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                plane.teleport(col, row);
                 if(100>blue && red>200) {
                     plane.setPixelColor(255,190, 200);
                 }
            }
        }
    }
    public void pantFilter() {
        for (int row = 340; row < 505; row = row + 1) {
            for (int col = 130; col < 300; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                plane.teleport(col, row);
                if(50>blue && 50>green && red>50) {
                    plane.setPixelColor(255, 255,20);
                }
            }
        }
    }
    public void noseFilter() {
        for (int row = 230; row < 270; row = row + 1) {
            for (int col = 250; col < 310; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                plane.teleport(col, row);
                if(100>blue && 100>green && 100>red) {
                    plane.setPixelColor(50,150, 50);
                }
                if(100<blue && 100<green && 200>red) {
                    plane.setPixelColor(150,255, 150);
                }
            }
        }
    }
    public void eyeFilter() {
        for (int row = 150; row < 240; row = row + 1) {
            for (int col = 250; col < 320; col++) {
                plane.teleport(col, row);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                plane.teleport(col, row);
                if(blue>200 && red>200) {
                    plane.setPixelColor(255,0, 0);
                }
            }
        }
    }
}
