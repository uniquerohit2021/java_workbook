package week3;

public class week3_1_main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Long refId = Long.parseLong(args[n]);
        Long[] condidates = new Long[n];
        int j = 2;
        for (int i=0;i<n; i++, j++)
        {
            condidates[i] = Long.parseLong(args[i]);
        }
        System.out.println(week3_1.search(condidates, n, refId));
    }
}
