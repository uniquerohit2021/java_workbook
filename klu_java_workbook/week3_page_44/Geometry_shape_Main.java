package week3_page_44;

import java.util.Scanner;

public class Geometry_shape_Main {
    public static void main(String[] args) {
        Geometry_shape g = new Geometry_shape();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius value for area of circle: ");
        g.r = sc.nextDouble();
        System.out.println("Enter side value for squire area");
        g.a = sc.nextInt();
        System.out.println("Enter breath and height for rectangle area");
        g.b = sc.nextInt();
        g.h = sc.nextInt();

        System.out.println("circle area:");
        g.areaOfCircle(g.r);
        System.out.println("squire area:");
        g.areaOfSquire(g.a);
        System.out.println("Rectagle area:");
        g.areaOfRectangle(g.b, g.h);

    }
}
