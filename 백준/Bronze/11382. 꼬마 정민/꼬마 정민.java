import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        long answer1 = Long.parseLong(input[0]);
        long answer2 = Long.parseLong(input[1]);
        long answer3 = Long.parseLong(input[2]);

        System.out.println(answer1 + answer2 + answer3);
    }
}
