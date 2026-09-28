import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int total = (a * 100 + b) * n;

        int rubles = total / 100;
        int kopecks = total % 100;

        System.out.println(rubles + " " + kopecks);
    }
}