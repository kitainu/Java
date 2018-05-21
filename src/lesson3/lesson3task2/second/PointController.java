package lesson3.lesson3task2.second;


import lesson3.lesson3task2.first.Point;

public class PointController {

    public PointController() {
    }

    public void addX(Point point) {
        int x = point.getX();
        point.setX(x + 1);
    }

    public void minusX(Point point) {
        int x = point.getX();
        point.setX(x - 1);
    }

    public void addY(Point point) {
        point.setY(point.getY() + 1);
    }

    public void minusY(Point point) {
        point.setY(point.getY() - 1);
    }
}

