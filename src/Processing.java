
import processing.core.PApplet;

public class Processing extends PApplet {


    public static void main(String args[]) {
        PApplet.main(new String[]{"--present", "Processing"});
    }


    float x = 100;
    float y = 100;
    float movement = 1;

    public Processing() {}

    public void setup() {
        size(200, 200);
    }


    public void draw() {
        background(255);
        move();
        display();

    }

    void move() {
        float r =random(1,4);
        if(r >= 0 && r < 1) {
            y = y + movement;
            if(y > height){
                y =  y - 2;   }
        }

        if(r >= 1 && r < 2 ) {
            x = x + movement;
        }

        if(r >= 2 && r < 3) {
            y = y - movement;
        }

        if(r >= 3 && r < 4) {
            x = x - movement;
        }


    }

    void display() {
        fill(0);

        ellipse(x, y, 1, 1);

    }
}

