package week2_1;

public class palidrome {
    static int findReverse(int n)
    {
        int rev, rem=0;
        while (n>0)
        {
            rem = n%10;

            n=n/10;

        }
        return rem;
    }
    static boolean isPalidrome(int rev, int n)
    {
        if(rev==n)

            return true;
          else return false;

    }


}
