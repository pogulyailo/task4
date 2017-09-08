public class task4 {
    public static void main(String[] args) {

        int s1 = 194;
        int s2 = (int) (s1 / 100) % 10;
        int s3 = (int) (s1 / 10) % 10;
        int s4 = (int) (s1 % 10);
        int s = (int)(s2 + s3 + s4);
        int n = (int) (s);


        System.out.println(n);
    }
}