import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        // Arrays: fixed size, same data type
        // It takes smaller than array list
        int[] ages = {19, 20, 23, 25, 27, 28, 30, 32, 36, 48};

        int [] scores = new int[5];
        scores[0] = 100;
        scores[1] = 96;
        scores[2] = 94;
        scores[3] = 85;
        scores[4] = 78;

        double[] records = {1.12, 42.0, 32.91};
        double[] records2 = {1.12, 42.0, 32.91};
        System.out.println(records == records2);
        // false memory address is different (reference type compare memory adress)

        char[] letters = {'A', 'B', 'C'};

        for (char letter: letters) {
            System.out.println(letter);
        }

        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }

        System.out.println(records);
        System.out.println(Arrays.toString(records));
    }
}