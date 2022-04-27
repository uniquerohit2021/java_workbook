package week3_2;

public class week3_2 {
    int n, m;
    static void findSum(int n, int m, int a[][])
    {
        int sum = 0;
        for (int i=0; i<n; i++ )
        {
            for(int j=0; j<m; j++)
            {
                sum = sum +a[i][j];
            }
        }
        System.out.println("Sum: " + sum);
    }

    static void println(int n, int m,int a[][])
    {
        System.out.println("Element in matrix form");
        for (int i =0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void principalDiagonal(int n, int m, int a[][])
    {
        System.out.println("Principle diagonal elements are: ");
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                if (i==j)
                {
                    System.out.println(a[i][j]);
                }
            }
        }
    }

    static void diagonalSum(int n, int m, int a[][])
    {
        int sum=0;
        System.out.println("Sum of diagonal Element:");
        for (int i=0; i<n; i++)
        {
            for (int j=0;j<m; j++)
            {
                if (i==j)
                sum = sum +a[i][j];
            }
        }
        System.out.println(sum);
    }
}
