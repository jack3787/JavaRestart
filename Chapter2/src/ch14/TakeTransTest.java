package ch14;

public class TakeTransTest {

    public static void main(String[] args) {

        Student studentJin = new Student("Jin", 5000);
        Student studentTom = new Student("Tom", 5000);

        Bus bus102 = new Bus(102);
        Bus bus153 = new Bus(153);

        studentJin.takeBus(bus102);
        studentTom.takeBus(bus153);

        Subway greenSubway = new Subway(2);
        studentTom.takeSubway(greenSubway);

        studentJin.showInfo();
        studentTom.showInfo();

        bus102.showBusInfo();
        bus153.showBusInfo();
        greenSubway.showSubwayInfo();
    }

}
