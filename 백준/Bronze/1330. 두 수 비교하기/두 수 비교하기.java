import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       String[] input = scanner.nextLine().split(" ");
       int A = Integer.parseInt(input[0]);
       int B = Integer.parseInt(input[1]);
        
       if (A > B){
            System.out.println(">");
       }
       else if (A == B){
           System.out.println("==");
       }
       else {
           System.out.println("<");
       } 
    }
}