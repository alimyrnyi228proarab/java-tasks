import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();

        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

        int time1 = h1 * 3600 + m1 * 60 + s1;
        int time2 = h2 * 3600 + m2 * 60 + s2;

        System.out.println(time2 - time1);
    }
}