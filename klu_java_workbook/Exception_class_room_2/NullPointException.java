package Exception_class_room_2;

public class NullPointException {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }
}
