package week3_5;

public class week_3_5 {
    void print(int a[])
    {
        System.out.println("Enter the element of Array: ");
        for (int i=0; i< a.length; i++)
        {
            System.out.println(a[i]);
        }
    }

    int sum=0;
    void findSum(int a[])
    {
        for (int i =0; i<a.length; i++)
        {
            sum = sum+i;
        }
        System.out.println("Sum: " + sum);
    }

}
