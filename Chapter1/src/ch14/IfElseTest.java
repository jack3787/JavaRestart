package ch14;

public class IfElseTest {
    public static void main(String[] args) {

        int age = 7;

        while(age<=10) {
            if (age >= 8) {
                System.out.println(age+"살 입니다.");
                System.out.println("학교에 다닙니다.\n");
            } else {
                System.out.println(age+"살 입니다.");
                System.out.println("학교에 다니지 않습니다.\n");
            }
            age++;
        }
    }
}
