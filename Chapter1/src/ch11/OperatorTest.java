package ch11;

public class OperatorTest {
    public static void main(String[] args) {

        int myNum = 10;
        int yourNum =20;
        myNum += yourNum;
        System.out.println((myNum));


        int gameScore = 150;
        int lastScore = gameScore++;
        System.out.println(lastScore);
        lastScore = ++gameScore;
        System.out.println(lastScore);
    }
}
