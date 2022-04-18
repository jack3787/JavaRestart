package ch06;

public class Student {

    public int studentNumber;
    public String studentName;
    public int grade;
    // 멤버변수는 객체가 만들어질 때 초기화 되지만,
    // 지역변수는 자동으로 초기화 되지 않는다.

    public Student() {

    }
    // constructor overloading
    public Student(int studentNumber, String studentName, int grade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo(){
        return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년입니다.";
    }
}
