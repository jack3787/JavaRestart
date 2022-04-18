package ch04;

public class StudentTest {

    public static void main(String[] args) {

        Student studentLee = new Student();
//      데이터타입 인스턴스(객체)  new 생성자

        studentLee.studentId = 201710009;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울 강남구";

        studentLee.showStudentInfo();

        Student studentKim = new Student();

        studentKim.studentId = 201710009;
        studentKim.studentName = "Kim";
        studentKim.address = "경기도 남양주시";

        studentKim.showStudentInfo();


        System.out.println(studentKim);
        System.out.println(studentLee);
    }
}
