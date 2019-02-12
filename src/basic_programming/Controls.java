public class Controls {
    public static void main(String[] args){
        // Conditional statements
        // 1. if-else
        int x = 10;
        if (x > 5){
            System.out.println("x is greater than 5.");
        } else if (x > 3 && x <= 5){
            System.out.println("x is more than 3 and less than 5.");
        } else {
            System.out.println("x is less than 3");
        }
        // 2. switch
        int y = 30;
        switch(y){
            case 10:
                System.out.println("y is 10");
                break; // fallthrough without break.
            case 30:
                System.out.println("y is 30");
                break;
            default:
                System.out.println("y is other.");
                break;
        }
    }
}