package ch18;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input;
        int sum = 0;

        //input = sc.nextInt();

        do {
            input = sc.nextInt();
            sum += input;
        } while (input != 0);

            System.out.println("총 합:" + sum);

    }

}
