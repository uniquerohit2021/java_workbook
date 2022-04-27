package week3_page_47;

public class palidrome {
    static int findReverse(int n)
    {
        int rev=0, rem=0;
        while (n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }

    public boolean isPalidrome(int a[], int n)
    {
        boolean f =true;
        for (int i=0;i<n;i++)
        {
            if(findReverse(a[i])!=a[i])
            {
                f =false;
                break;
            }
        }
        return f;
    }
}
