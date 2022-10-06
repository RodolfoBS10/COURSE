package aplication;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.println("Triangle X area: " + areaX);
        System.out.println("Triangle X area: " + areaY);

        if (areaX > areaY){
            System.out.println("Large area: X");
        }
        else {
            System.out.println("Large area: Y");
        }



        scanner.close();
    }
}
