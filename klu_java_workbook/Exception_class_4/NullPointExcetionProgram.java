package Exception_class_4;

public class NullPointExcetionProgram {
    public static void main(String[] args) {
        try {
            String str = "CSIT";
            int data= Integer.parseInt(str);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Rest of the Code");
    }
}
