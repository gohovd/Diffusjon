
import processing.core.PApplet;

public class Processing extends PApplet {


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
        smooth();
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
        float x;
        float y;


        float circleSize;

        MovingCircle(float xpos, float ypos, float csize) {
            x = xpos;
            y = ypos;
            circleSize = csize;


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

        float getX() {
            return x;
        }
        float getY() {
            return y;
        }
        void setX(float x){
            this.x = x;
        }
        void setY(float y){
            this.y = y;
        }

    }

    /*public void placeCircles(MovingCircle instance){
        float currentX = instance.getX();
        float currentY = instance.getY();
        float random;
        float previousX;
        float previousY;

        if(currentX == previousX || currentX == 200){
            random = random(-1, 1);
            if(random < 0){ currentX -= 1; } else currentX += 1;
            instance.setX(currentX);
            previousX = currentX;
        }
        if(currentY == previousY || currentY == 200){
            random = random(-1, 1);
            if(random < 0){ currentY -= 1; } else currentY += 1;
            instance.setY(currentY);
            previousY = currentY;
        }

    }*/


}

