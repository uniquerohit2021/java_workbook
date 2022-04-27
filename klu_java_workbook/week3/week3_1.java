package week3;

public class week3_1 {
    static boolean search(Long condidates[], int n, long refId)
    {
        boolean f =false;
        for(int i =0; i<n; i++)
        {
            if (condidates[i]==refId)
                f= true;
        }
        return f;
    }
}
