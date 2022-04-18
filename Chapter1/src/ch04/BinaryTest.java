package ch04;

public class BinaryTest {
    public static void main(String[] args) {
        int num = 10;
        int binaryNum = 0B1010; // = 10 (2진수로)
        int octalNum = 012; // = 10 (8진수로)
        int xNum = 0XA; // = 10 (16진수로)

        System.out.println(num);
        System.out.println(binaryNum);
        System.out.println(octalNum);
        System.out.println(xNum);
    }
}
