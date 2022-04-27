package Exception_class_room;

public class Exception {
    public static void main(String[] args) {
        int a=35, b= 6, c=6, result;
        try
        {
            result=a/(b-c);
            System.out.println("Result" + result);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("Rest of the code will be Exception");
    }
}
