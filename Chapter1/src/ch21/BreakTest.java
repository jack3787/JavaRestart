package ch21;

public class BreakTest {

    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

            while(true) {
                sum += num;
                if(sum>100){
                    break;
                }
                System.out.println(num + "번째까지의 합: " + sum);
                num++;
            }

    }

}
