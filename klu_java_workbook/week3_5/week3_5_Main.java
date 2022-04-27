package week3_5;

import java.util.Scanner;

public class week3_5_Main {
    public static void main(String[] args) {
        week_3_5 ar = new week_3_5();
        Scanner sc =new Scanner(System.in);
        int[] a = new int[5];
        for (int i=0; i<5; i++)
        {
            a[i] = Integer.parseInt(args[5]);
        }
        ar.print(a);
    }
}
