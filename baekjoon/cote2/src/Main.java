import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        double answer = Double.parseDouble(input[0])/Double.parseDouble(input[1]);
        System.out.println(answer);

    }
}