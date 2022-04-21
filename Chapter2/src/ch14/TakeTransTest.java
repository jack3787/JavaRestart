package ch14;

public class TakeTransTest {

    public static void main(String[] args) {

        Student studentA = new Student("Jin", 5000); // studentA = Student 클래스의 studentName이 "Jin"인 객체
        Student studentB = new Student("Tom", 5000); // studentB = Student 클래스의 studentName이 "Tom"인 객체

        Bus bus1 = new Bus(102); // bus1 = Bus 클래스의 busNumber가 102인 객체
        Bus bus2 = new Bus(153); // bus2 = Bus 클래스의 busNumber가 153인 객체

        studentA.takeBus(bus1);  // studentA가 bus1을 탔다.
        studentB.takeBus(bus2);  // studentB가 bus2을 탔다.

        Subway greenSubway = new Subway(2);  // greenSubway = Subway 클래스의 lineNumber가 2인 객체
        studentB.takeSubway(greenSubway);  // studentB가 greenSubway를 탔다.

        studentA.showInfo(); // studentA의 돈 현황
        studentB.showInfo(); // studentB의 돈 현황

        bus1.showBusInfo(); // bus1의 돈 현황
        bus2.showBusInfo(); // bus2의 돈 현황
        greenSubway.showSubwayInfo(); // greenSubway의 돈 현황
    }

}
