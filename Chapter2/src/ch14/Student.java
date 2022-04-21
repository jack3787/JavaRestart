package ch14;

public class Student {

    String studentName; //studentName 멤버변수
    int money; //money 멤버변수

    public Student(String studentName, int money){ //Student 생성자
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus){ //takeBus 메소드
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway){ //takeSubway 메소드
        subway.take(1200);
        this.money -= 1200;
    }

    public void showInfo(){ //showInfo 메소드
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }
}
