package week3_2;

import java.util.Scanner;

public class week3_2_Main {
    public static void main(String[] args) {
        week3_2 w = new week3_2();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of 2D Array");
        w.n = sc.nextInt();
        w.m = sc.nextInt();

        System.out.println("Enter Array element");
        int[][] a = new int[w.n][w.n];
        for (int i=0; i<w.n; i++)
        {
            for (int j=0; j<w.n; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        week3_2.findSum(w.n, w.m, a);
        week3_2.println(w.n,w.m,a);
        week3_2.diagonalSum(w.n,w.m,a);
        week3_2.principalDiagonal(w.n,w.m,a);
    }
}
