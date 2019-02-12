import java.util.Scanner;

public class IOExamples2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        System.out.println("Enter another number");
        int b = in.nextInt();

        System.out.println("Ther sum is " + (a + b));

    }
}