package ch07;

public class FloatingPointError {
    public static void main(String[] args) {
        double dnum = 1;

        for(int i=0; i<1000; i++){
            dnum += 0.1;
        }
        System.out.println(dnum);
    }
}
