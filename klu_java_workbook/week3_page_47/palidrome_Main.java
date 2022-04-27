package week3_page_47;

import java.util.Scanner;

public class palidrome_Main {
    public static void main(String[] args) {
        palidrome p = new palidrome();
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Array size:");
        n=sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the element:");
        for (int i=0; i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        if (p.isPalidrome(a, n));
        {
            System.out.println("Array is a palidrome");
        }
        
    }
}
