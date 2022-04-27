package week3_page_42;

import java.util.Scanner;

public class week_3_unitity_Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        week_3_utility u =new week_3_utility();

        int[] a = new int[week_3_utility.n];
        double[] b = new double[week_3_utility.n];
        for (int i=0; i<week_3_utility.n; i++)
        {
            a[i] = Integer.parseInt(args[i++]);
        }
        for (int i=0; i<week_3_utility.n; i++)
        {
            a[i] = Integer.parseInt(args[i++]);
        }
        week_3_utility.findLargest(a);
        week_3_utility.findSmallest(a);
        week_3_utility.sort(a);

        week_3_utility.sort(b);
        week_3_utility.findLargest(b);
        week_3_utility.findSmallest(b);
    }
}
