package Lesson2Tasks.Lesson2Task3;

public class Calculate {
    public static void main(String[] args) {
        double x = 3;
        double y = 5;
        double a = 7;
        double b = 2;

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(x, y));
        System.out.println(calculator.divide(x, y));
        System.out.println(calculator.multiply(x, y));
        System.out.println(calculator.substract(x, y));

    }

}



