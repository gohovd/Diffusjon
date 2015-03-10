
import processing.core.PApplet;

public class Processing extends PApplet {


    float x = 100;
    float y = 100;
    float movement = 1;

    float xSpeed;
    float ySpeed;
    MovingCircle[] myCircleArray = new MovingCircle[100];


    public static void main(String args[]) {
        PApplet.main(new String[]{"--present", "Processing"});
    }

    public void setup() {
        size(400, 400);
        noStroke();
        x = width/2;
        y = height/2;
        for(int i=0; i<myCircleArray.length; i++) {
            myCircleArray[i] = new MovingCircle(200,200,10);
        }
    }


    public void draw() {
        background(color(244,255,255));
        for(int i=0; i<myCircleArray.length; i++) {
            myCircleArray[i] = new MovingCircle(200, 200, 10);

            myCircleArray[i].move();
            myCircleArray[i].checkCollisions();
            myCircleArray[i].display();
        }
    }

    class MovingCircle {

        float circleSize;

        MovingCircle(float xpos, float ypos, float csize) {
            x = xpos;
            y = ypos;
            circleSize = csize;

            xSpeed = random(-10, 10);
            ySpeed = random(-10, 10);

        }

        void move() {
            float r = random(0, 4);

            if (r >= 0 && r < 1) {
                y = y + movement;
            }

            if (r >= 1 && r < 2) {
                x = x + movement;
            }

            if (r >= 2 && r < 3) {
                y = y - movement;
            }

            if (r >= 3 && r < 4) {
                x = x - movement;
            }
        }

        void checkCollisions() {

            float r = circleSize/2;

            if ( (x<r) || (x>width-r)){
                xSpeed = -xSpeed;
            }

            if( (y<r) || (y>height-r)) {
                ySpeed = -ySpeed;
            }

        }

        void display() {
            fill(color(255,0,0));

            ellipse(x, y, 2, 2);


        }


    }


}

