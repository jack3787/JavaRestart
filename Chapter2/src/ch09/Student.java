package ch09;

public class Student {

    int studentId;
    String studentName;

    Subject korea;
    Subject math;

    Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String subjectName, int score){
        korea.subjectName = subjectName;
        korea.score = score;
    }

    public void setMathSubject(String subjectName, int score) {
        math.subjectName = subjectName;
        math.score = score;
    }

    public void showScoreInfo() {
        int totalScore = korea.score + math.score;
        System.out.println(studentName + " 학생의 총 점수는 " + totalScore +"점 입니다.");
    }

}
