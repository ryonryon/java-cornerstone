public class StringExample {
    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = "hello world";
        //compiler optimized that these two have same value so they point same adress.
        String s3 = new String("hello world");
        
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}