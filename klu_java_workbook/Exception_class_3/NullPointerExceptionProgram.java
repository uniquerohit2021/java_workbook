package Exception_class_3;

public class NullPointerExceptionProgram {
    public static void main(String[] args) {
        try {
            int[] a = new int[6];
            a[9] = 100;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Rest of code will");
    }
}
