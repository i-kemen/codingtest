import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int answer1 = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
        int answer2 = Integer.parseInt(input[0]) - Integer.parseInt(input[1]);
        int answer3 = Integer.parseInt(input[0]) * Integer.parseInt(input[1]);
        int answer4 = Integer.parseInt(input[0]) / Integer.parseInt(input[1]);
        int answer5 = Integer.parseInt(input[0]) % Integer.parseInt(input[1]);
        System.out.println(answer1 + "\n" + answer2 + "\n" + answer3 + "\n" + answer4 + "\n" + answer5);

    }
}