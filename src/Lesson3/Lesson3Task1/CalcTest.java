package lesson3.lesson3task1;

public class CalcTest {
      public static void main(String[] args) {
            Calculator calculator = new Calculator();
            double wynik;
            wynik=calculator.add(2,5);
            System.out.println("Suma liczb wynsi " + wynik);
            wynik=calculator.add(2.3,1.2,1.3);
            System.out.println("Suma liczb wynsi " + wynik);
            calculator.substract(7,5);
            System.out.println("Różnica wynosi " + calculator.substract(7,5) );
            calculator.substract(2.3,4.5);
            System.out.println("Różnica wynosi " + calculator.substract(2.3,4.5));
      }
}
