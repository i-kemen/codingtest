import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int H = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int C = scanner.nextInt();
        int C1 = C/60;
        int C2 = C%60;

        if(H+C1 >= 24){
            if(M+C2>=60){
                System.out.println((H+C1-23) + " " + (M+C2-60));
            }
            else{
            System.out.println((H+C1-24) +" "+ (M+C2));
            }
        }
        if(H+C1 <24){
            if(M+C2>=60){
                if(H+C1 == 23){
                System.out.println((0) + " " + (M+C2-60));
            }

            else{
                System.out.println((H+C1+1) +" "+ (M+C2-60));
            }
        }
        if(M+C2<60){
            System.out.println((H+C1) +" "+ (M+C2));
            }
        }
    }
}
