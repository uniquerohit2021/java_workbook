package week4_1;

import java.util.Scanner;

public class account_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id And Initial Balance");
        account a = new account(sc.nextInt(), sc.nextInt());

        while (true)
        {
            int ch;
            System.out.println("1.Deposite, 2.Withdraw, 3.Display, 4. Exit");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1 :
                    System.out.println("Enter Amount for diposite: ");
                    a.diposite(sc.nextInt());
                    break;
                case 2:
                    System.out.println(" Enter amount for withdraw: ");
                    a.withdraw(sc.nextInt());
                    break;
                case 3:
                    System.out.println(" Account Detail:" );
                    a.display();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println(" Enter valid input ");
            }
        }
    }
}
