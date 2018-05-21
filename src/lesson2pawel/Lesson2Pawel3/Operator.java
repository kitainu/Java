package lesson2Pawel.lesson2Pawel3;

public class Operator {
    public static void main(String[] args) {
        System.out.println(makes10(1, 9));
        System.out.println(makes10(9, 9));
        System.out.println(makes10(9, 10));
    }
        public static Boolean makes10 ( int a, int b){
            return ((a == 10) || (b == 10) || (a + b == 10));
        }
    }

