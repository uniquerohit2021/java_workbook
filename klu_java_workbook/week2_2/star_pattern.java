package week2_2;

public class star_pattern {
    int n;
    void pattern(){
        for (int i=0;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for (int k=n-i; k>0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
