package ch12;

public class LogicalTest {
    public static void main(String[] args) {

        int num1 = 10;
        int i = 2;

        boolean value = ((num1 += 10) < 10) && ((i += 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i); // 앞의 항이 false이기 때문에, 뒤의 항까지 연산하지 않았다.
    }
}