package ch19;

public class ForTest {

    public static void main(String[] args) {
        int sum = 0;

        for(int i=1; i<=10; i++) { // '<='은 잘 쓰지 않는다.
            sum += i;
        }

        System.out.println(sum);
    }

}
