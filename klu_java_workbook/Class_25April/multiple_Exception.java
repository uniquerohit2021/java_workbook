package Class_25April;

public class multiple_Exception {
    public static void main(String[] args) {
        try
        {
            int a[] = new int[5];
            a[10]=  30;
            a[5] = 45/0;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (ArithmeticException e1)
        {
            System.out.println(e1);
        }
    }
}
