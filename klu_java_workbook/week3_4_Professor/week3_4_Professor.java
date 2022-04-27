package week3_4_Professor;

import java.util.Scanner;

public class week3_4_Professor {
    int[] a = new int[5];
    void findProfessor()
    {
        int sum =0;
        for (int i=0; i<5; i++)
        {
            sum=sum+a[i];
        }
        System.out.println("number of Assistance Professor: "+ sum);
    }

    public static void main(String[] args) {
        week3_4_Professor p = new week3_4_Professor();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of associate Professor:");
        for (int i=0; i<5; i++)
        {
            p.a[i] = sc.nextInt();
        }
        p.findProfessor();
    }

}
