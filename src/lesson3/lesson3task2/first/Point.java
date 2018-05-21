package lesson3.lesson3task2.first;

import java.io.Serializable;

public class Point implements Serializable {

    private int x;
    private int y;

    Point(int wspX, int wspY) {
        x = wspX;
        y = wspY;
    }

    public Point() {
    }

    public void setX(int X) {
        this.x = X;
    }

    public void setY(int Y) {
        this.y = Y;
    }

    public int getY() {
        return this.y;
    }

    public int getX() {
        return this.x;
    }
}
