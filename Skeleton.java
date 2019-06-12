package ISU;

import java.awt.*;

class Skeleton extends Mob{
    private int health;
    private static Image mobImage;
    private int location;

    protected int getHealth() {
        return health;}

    protected Image getImage() {
        return mobImage;}

    protected int decreaseLocation(){
       return location - 1;
    }

    protected Skeleton() {
        health = 100;
        mobImage = Toolkit.getDefaultToolkit().getImage("Skeleton.png"); // same zombie image for each zombie
        location = 1000;
    }
}

