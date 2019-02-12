import java.util.Scanner;

public class IOExamples {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Witch language (en jp  es cn)");

        while (true) {
            
            String line = myScanner.nextLine();

            if (line.equals("en")) {
                System.out.println("hello");
            } else if (line.equals("jp")) {
                System.out.println("konnichiha");
            } else if (line.equals("es")) {
                System.out.println("hola");
            } else if (line.equals("cn")) {
                System.out.println("nyhao");
            } else {
                System.out.println("not found");
                break;
            }
        }
    }
}