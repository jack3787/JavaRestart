package ch09;

public class LocalVariableInter {
    public static void main(String[] args) {

        var i = 10;
        var j = 10.0;
        var str = "hello";
        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

//        str = "test";
//        System.out.println(str);
        String str1111 = String.valueOf("3"); //???????
//        System.out.println(str);

//        String str11 = 5;
//        String str22 = "5";

        var str2 = str;
        System.out.println(str2);


    }
}
