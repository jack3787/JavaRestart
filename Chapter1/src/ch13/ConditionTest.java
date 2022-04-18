package ch13;

import java.sql.SQLOutput;
import java.util.Scanner; // import == Scanner는 요 라이브러리에 있는 놈이다.

public class ConditionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // System.in == 표준 입력

        int max;
        System.out.println("두 수를 입력하시오: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("더 큰 수를 출력합니다...");

        max = (num1 > num2) ? num1 : num2; // num1 > num2 ? 참 -> num1, 거짓 -> num2 출력.
        System.out.println(max);
    }
}
