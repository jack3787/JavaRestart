package ch10;

public class ConstantTest {
    public static void main(String[] args) {

//        int MAX_NUM = 100;
//        MAX_NUM = 20;
//        final 없이 int 자료형으로 선언, 초기화 하는 경우 변경이 가능하다.

        final int MAX_NUM = 10;
//        MAX_NUM = 20;
//        final로 선언, 초기화한 상수는 변경이 불가능하다.

        final int MIN_NUM;
        MIN_NUM = 20;
//        상수는 반드시 값을 초기화(지정) 해주어야 한다.

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);

    }
}
