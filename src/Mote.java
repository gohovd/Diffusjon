import processing.core.PApplet;

public class Mote extends PApplet {

    float x; // The location of the mote on the x-axis.
    float y; // The location of the mote on the y-axis.
    float width; // Width of the mote (ellipse).
    float height; // Height of the mote (ellipse).
    float msize; // Size of the mote (area covered).

    public Mote(float x, float y, float width, float height) {
        msize = width*height;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }



}

