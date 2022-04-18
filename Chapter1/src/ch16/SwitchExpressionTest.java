package ch16;

import java.util.Scanner;

public class SwitchExpressionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("월을 입력하시오: ");
        int month = sc.nextInt();

        int day = switch(month){
            case 1, 3, 5, 7, 8, 10, 12 -> {
                System.out.println("이번 달은 31일까지 입니다.");
                yield 31;
            }
            case 2 -> {
                System.out.println("이번 달은 28일까지 입니다.");
                yield 28;
            }
            case 4, 6, 9, 11 ->{
                System.out.println("이번 달은 30일까지 입니다.");
                yield 30;
            }
            default -> {
                System.out.println("존재하지 않는 달입니다.");
                yield 0;
            }
        };

        //System.out.println(month + "월은 " + day + "일까지 있습니다.");
    }
}
