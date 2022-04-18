package ch10;

public class TypeConversionText {
    public static void main(String[] args) {

//        byte bNum = 125;
//        int iNum = bNum;
//        System.out.println(iNum);

        int iNum = 255;
        byte bNum = (byte) iNum;
        System.out.println(bNum);
//        truncate(손실) 발생

        double dNum = 3.14;
        int intNum = (int)dNum;
        System.out.println(intNum);
//        truncate 발생

        double dNum2 = 1.2;
        float fNum = 0.9F;
        int iNum2 = (int)dNum2 + (int)fNum;
        int iNum3 = (int)(dNum2 + fNum);
        System.out.println(iNum2);
        System.out.println(iNum3);
//        결과가 다르다.

    }
}
