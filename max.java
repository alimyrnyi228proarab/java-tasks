import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int d = a - b;
        int sign = (d + 1000) / 1000;

        System.out.println(a * sign + b * (1 - sign));
    }
}