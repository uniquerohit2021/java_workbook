package week3_3;

public class week3_Q3_Circuit {
    static void fintTotalResistance(int n, int series[])
    {
        int sum =0;
        for (int i=0;i<n;i++)
        {
            sum = sum + series[i];
        }
        System.out.println("Total Resistance in series combination " + sum);
    }

    static void findTotalParallerResistance(int n, int paraller[])
    {
        double sum = 0;
        for (int i=0; i<n; i++)
        {
            sum = sum + (1/paraller[i]);
        }
        System.out.println("Total Resistance in Paraller" + sum);
    }
}
