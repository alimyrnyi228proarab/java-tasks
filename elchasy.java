import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        n = n % 1440;

        int hours = n / 60;
        int minutes = n % 60;

        System.out.println(hours + " " + minutes);
    }
}