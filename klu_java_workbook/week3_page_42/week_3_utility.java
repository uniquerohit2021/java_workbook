package week3_page_42;

public class week_3_utility {
    public static int n;
    public static void sort(int a[])
    {
        for (int i=0;i<n;i++)
        {
            for (int j=0; j<n; j++)
            {
                if(a[j]<a[i])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("after sor");
        for (int i=0; i<n; i++)
        {
            System.out.println(a[i] + " ");
        }
    }

    public static void sort(double b[])
    {
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; i++)
            {
                if (b[i]<b[j])
                {
                    double temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        System.out.println("After sort");
        for (int i=0; i<n; i++)
        {
            System.out.println(b[i] + " ");
        }
    }

    public static void findSmallest(int a[])
    {
        int min =10000;
        for (int i=0; i<n; i++)
        {
            if(a[i] <min)
                min = a[i];
            System.out.println("min: " + min);
        }
    }

    public static void findSmallest(double b[])
    {
        double min =10000;
        for (int i=0; i<n;i++)
        {
            if (b[i]<min)
                min =b[i];
            System.out.println("min:" + min);
        }
    }

    public static void findLargest(double b[])
    {
        double max = -1;
        for (int i=0; i<n; i++)
        {
            if (b[i]>max)
                max=b[i];
            System.out.println("max:"+max);
        }
    }

    public static void findLargest(int a[])
    {
        int max = -1;
        for (int i=0; i<n; i++)
        {
            if (a[i]>max)
                max=a[i];
            System.out.println("max:" + max);
        }
    }



}
