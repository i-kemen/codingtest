import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt(); // 첫 번째 주사위 눈
        int dice2 = sc.nextInt(); // 두 번째 주사위 눈
        int dice3 = sc.nextInt(); // 세 번째 주사위 눈
        int prize = 0; // 상금을 저장할 변수

        // 같은 눈이 3개인 경우
        if (dice1 == dice2 && dice2 == dice3) {
            prize = 10000 + dice1 * 1000;
        }
        // 같은 눈이 2개인 경우
        else if (dice1 == dice2 || dice1 == dice3 || dice2 == dice3) {
            int sameNum = 0; // 같은 눈의 수
            if (dice1 == dice2 || dice1 == dice3) {
                sameNum = dice1;
            } else {
                sameNum = dice2;
            }
            prize = 1000 + sameNum * 100;
        }
        // 모두 다른 눈인 경우
        else {
            int max = Math.max(Math.max(dice1, dice2), dice3); // 가장 큰 눈
            prize = max * 100;
        }

        System.out.println(prize); // 계산된 상금을 출력
    }
}
