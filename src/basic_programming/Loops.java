public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (;;) {
            /** infinite loop */
            System.out.println("hello");
            break;
        }

        int j = 0;
        while (j < 10) {
            if (j % 2 ==0) {
                System.out.println(j);
            }
            j++;
        }
    }
}