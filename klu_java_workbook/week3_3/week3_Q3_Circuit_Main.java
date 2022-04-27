package week3_3;

import java.util.Scanner;

public class week3_Q3_Circuit_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Resister: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the value of resistance: ");
        for (int i=0; i<n; i++)
        {
            a[i]= sc.nextInt();
        }
        week3_Q3_Circuit.fintTotalResistance(n,a);
        week3_Q3_Circuit.findTotalParallerResistance(n, a);
    }
}
