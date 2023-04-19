import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);

        if( A%4 == 0){
            if(A%100 == 0){
                if(A%400 == 0){
                    System.out.println("1");  // 400으로 나누어 떨어지면 윤년
                }
                else{
                    System.out.println("0");  // 100으로 나누어 떨어진다면 윤년이 아님
                }
            }
            else{
                System.out.println("1");  // 4로 나누어 떨어지면 윤년
            }
        }
        else {
            System.out.println("0");  // 4로 나누어 떨어지지 않으면 윤년이 아님
        }
    }
}
