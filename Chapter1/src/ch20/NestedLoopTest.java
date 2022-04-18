package ch20;

public class NestedLoopTest {

    public static void main(String[] args) {

        int num = 0;

        //for문
        for(int dan=1; dan<10; dan++){
            for(int i=1; i<10; i++){
                num = dan * i;
                System.out.print(dan + "x" + i + "=" + num + " ");
            }
            System.out.println();
            System.out.println();
        }

        //while문
        int dan = 1;
        int i = 1;

        while(dan<10){
            while(i<10){
                num = dan * i;
                System.out.print(dan + "x" + i + "=" + num + " ");
                i++;
            }
            System.out.println();
            dan++;
            i = 1; // ***
        }
    }

}
