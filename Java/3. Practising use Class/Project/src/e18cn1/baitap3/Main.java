package e18cn1.baitap3;

import java.util.Scanner;

/**
 * @author Dat Nguyen
 */
public class Main {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        double width = sc.nextDouble();
        double height = sc.nextDouble();
        sc.nextLine();
        String color = sc.nextLine();

        Rectangle hcn = new Rectangle(width, height, color);
        System.out.println("\nWidth = " + hcn.getWidth());
        System.out.println("Height = " + hcn.getHeight());
        System.out.println("Color = " + hcn.getColor());
        System.out.println("Area = " + hcn.findArea());
        System.out.println("Perimeter = " + hcn.findPerimeter());
    }
}

/*
run:
10.5
20.5
Green

Width = 10.5
Height = 20.5
Color = Green
Area = 215.25
Perimeter = 62.0
 */
