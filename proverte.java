import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int a = n % m;
        int b = m % n;

        System.out.println(1 / (a + b + 1));
    }
}