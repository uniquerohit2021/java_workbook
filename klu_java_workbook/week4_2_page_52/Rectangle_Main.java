package week4_2_page_52;

import java.util.Scanner;

public class Rectangle_Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Rectangle r = new Rectangle();
        System.out.println("Enter only breath Value:");
        Rectangle r1 = new Rectangle(sc.nextInt());
        System.out.println("Enter length and Breath Value:");
        Rectangle r2 = new Rectangle(sc.nextInt(), sc.nextInt());

        System.out.println("When Length and Breath are zero: ");
        r.areaOfRectangle();
        System.out.println("When breath os zero: ");
        r1.areaOfRectangle();
        System.out.println("When Length and Breath both are non zero: ");
        r2.areaOfRectangle();
    }
}