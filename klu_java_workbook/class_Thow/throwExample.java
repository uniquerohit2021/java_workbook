package class_Thow;

public class throwExample {
    public static void validateVote(int age)
    {
        if (age<18)
        {
            throw new ArithmeticException("Not eligible for vote");
        }
        else
        {
            System.out.println("Eligible for vote");
        }
    }
}
