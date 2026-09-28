import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int hundreds = n / 100;
        int tens = (n / 10) % 10;
        int units = n % 10;

        System.out.println(hundreds + tens + units);
    }
}