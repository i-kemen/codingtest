import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        int third = first * (second % 10);
        int fourth = first * ((second / 10) % 10);
        int fifth = first * (second / 100);

        int sixth = first * second;

        System.out.println(third + "\n" + fourth + "\n" + fifth + "\n" + sixth);
    }
}
