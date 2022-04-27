package week2_2;

import java.util.Scanner;

public class star_pattern_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        star_pattern star = new star_pattern();
        System.out.println("Enter n value");
        star.n= sc.nextInt();
        star.pattern();
    }
}
