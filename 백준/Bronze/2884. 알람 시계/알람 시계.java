import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int H = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        if(M>=45){
            System.out.println(H +" "+ (M-45));
        }
        if(M < 45){
            if(H>0){
                System.out.println((H-1) +" "+ (M+15));
            }
            else {
                System.out.println(23 +" "+ (M+15));
            }
        }
    }
}
