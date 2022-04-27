package week4_page_55_Car_Engine;

import java.util.Scanner;

public class Engine_Main {
    public static void main(String[] args) {
        Engine e = new Engine();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Engine id: ");
        e.setEngineId(sc.nextInt());
        System.out.println("Enter the Engine Malage Hourse: ");
        e.setEngineHours(sc.nextInt());
        System.out.println("Enter the Engine type: ");
        e.setEngineType(sc.next());
        System.out.println("Enter the Engine Weight: ");
        e.setEngineWeight(sc.nextFloat());

        e.getEngineId();
        e.getEngineHours();
        e.getEngineType();
        e.getEngineWeight();

        System.out.println(e);
    }
}
