package ch17;

public class WhileTest {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0; // 지역변수는 초기화 필수!

        while(i <= 10) {
            sum += i;
            i++;
        }

        System.out.println(sum);
        System.out.println(i);
    }

}
