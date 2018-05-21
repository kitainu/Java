package lesson3.lesson3task2.first;


import lesson3.lesson3task2.second.PointController;

public class PointApplication {
    public static final int ADD_X = 1;
    public static final int ADD_Y = 2;
    public static final int MINUS_X = 3;
    public static final int MINUS_Y = 4;

    public static void main(String[] args) {

        PointController pc = new PointController();
        Point p = new Point(1, 1);

        System.out.println("Wskaż współrzędne punktu (" + p.getX() + "," + p.getY() + ")");

        pc.addX(p);
        pc.addY(p);

        System.out.println("Wskaż współrzędne punktu (" + p.getX() + "," + p.getY() + ")");

        pc.minusX(p);
        pc.minusY(p);

        System.out.println("Wskaż współrzędne punktu (" + p.getX() + "," + p.getY() + ")");

    }

    public static void control(Point punkt, int akcja) {
        PointController pc = new PointController();

        switch (akcja) {
            case ADD_X:
                pc.addX(punkt);
                System.out.println("Wskaż współrzędne punktu (" + punkt.getX() + "," + punkt.getY() + ")");
                break;
            case ADD_Y:
                pc.addY(punkt);
                System.out.println("Wskaż współrzędne punktu (" + punkt.getX() + "," + punkt.getY() + ")");
                break;
            case MINUS_X:
                pc.minusX(punkt);
                System.out.println("Wskaż współrzędne punktu (" + punkt.getX() + "," + punkt.getY() + ")");
                break;
            case MINUS_Y:
                pc.minusY(punkt);
                System.out.println("Wskaż współrzędne punktu (" + punkt.getX() + "," + punkt.getY() + ")");
                break;
            default:
                System.out.println("Nie wybrano zdefiniowanej akcji: " + akcja);
        }
    }
}
