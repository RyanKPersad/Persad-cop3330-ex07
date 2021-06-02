package org.example;
import java.util.Scanner;
/**
 *
 */
public class App {
    public static final double m2 = 0.09290304;

    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        String length = myObj.nextLine();
        //Convert to int
        int newLength = Integer.parseInt(length);

        System.out.print("What is the width of the room in feet? ");
        String width = myObj.nextLine();
        //Convert to int
        int newWidth = Integer.parseInt(width);
        int f2 = newLength * newWidth;
        double conversion = m2 * f2;
        String print1 = String.format("You entered dimensions of %s feet by %s feet.",length,width);
        String print2 = String.format("The area is\n" + "%d square feet\n" + "%,.3f square meters\n",
                f2,conversion);
        System.out.println(print1);
        System.out.println(print2);


    }
}