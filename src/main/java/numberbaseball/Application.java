package numberbaseball;

import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 야구 게임을 시작합니다!");
        System.out.println("1부터 9까지의 서로 다른 숫자 3개를 맞춰보세요.");

        int com1 = 3;
        int com2 = 6;
        int com3 = 9;

        while (true) {
            // 사용자 입력 받기 (이 부분은 완성되어 있음)
            System.out.print("\n첫 번째 숫자를 입력하세요: ");
            int user1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int user2 = scanner.nextInt();
            System.out.print("세 번째 숫자를 입력하세요: ");
            int user3 = scanner.nextInt();


            // TODO: strike 개수를 계산하세요
            int strike = 0;


                if (com1 == user1) {
                    strike++;
                }
                if (com2 == user2) {
                    strike++;
                }
                if (com3 == user3) {
                    strike++;
                }
                // TODO: ball 갯수를 계산
            int ball = 0;
            if (com2 == user1  || com3 == user1 ) {
                ball++;
            }
            if ( com1 == user2 || com3 == user2 ) {
                ball++;
            }
            if (com1 == user3  || com2 == user3 ) {
                ball++;
            }
            if (strike == 0 && ball == 0) {
                System.out.println("아웃");
            } else {
                System.out.println(strike + " 스트라이크, " + ball + " 볼");
            }
            // TODO: 결과를 출력하세요 (예: "1 스트라이크")
            if (strike == 0) {
                System.out.println("아웃");
            }

            // TODO: 3 스트라이크인 경우 게임을 끝내세요
            if (strike == 3) {
                System.out.println("축하합니다! 정답을 맞추셨습니다.");
                break;
            }
        }
        scanner.close();
    }
}




