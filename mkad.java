import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int t = sc.nextInt();

        int position = (v * t) % 109;

        if (position < 0) {
            position += 109;
        }

        System.out.println(position);
    }
}