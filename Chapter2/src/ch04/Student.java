package ch04;

public class Student {

    int studentId;
    String studentName;
    String address;

    public void showStudentInfo() {
        System.out.println(studentId + "학번 학생의 이름은: " +
                studentName + "이고, 주소는 " + address + "입니다.");
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

}
