package Lesson2Tasks.Lesson2Task1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        {
            int x = rand.nextInt(10);
            System.out.println(x);
            int y = rand.nextInt(10);
            System.out.println(y);
            System.out.println("Is x greater then y?");
            System.out.println(y < x);
            System.out.println("If x is multiplied by 2 is grater then y");
            System.out.println(x * 2 > y);
            System.out.println("Is y less than the sum of x + 3 and at the same time grater than x - 2");
            System.out.println((y < (x + 3)) & (y > (x - 2)));
            System.out.print("Is the product of x and y numbers even? ");
            System.out.print(x % y);
        }
    }
}
