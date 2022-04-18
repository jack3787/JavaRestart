package ch08;

public class CharacterTest {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1); // ch1을 int 자료형으로 강제 변환하여 출력하는 방법

        char ch2 = 66;
        System.out.println(ch2);
        System.out.println((char)ch2);

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3);

//        char ch = -66; // 음수는 취급하지 않는다.

        char han = '한';
        char ch = '\uD55C'; //UNICODE

        System.out.println(han);
        System.out.println(ch);
    }
}
