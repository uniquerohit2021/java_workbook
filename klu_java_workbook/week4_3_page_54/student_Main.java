package week4_3_page_54;

import java.util.Scanner;

public class student_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name, id And marks of 3 subject");
        student st = new student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        st.getTotal();
        st.getAvg();

        System.out.println(st);

    }
}
