package ch15;

public class TakeTaxiTest {
    public static void main(String[] args) {

        Passenger passenger1 = new Passenger("Jin", 5000); // passenger1 = Passenger 클래스의 passengerName이 "Jin"인 객체
        Passenger passenger2 = new Passenger("Kim", 5000); // passenger2 = Passenger 클래스의 passengerName이 "Kim"인 객체

        Taxi taxi1 = new Taxi("(주)테슬라택시"); // taxi1 = Taxi 클래스의 taxiCompanyName이 "(주)테슬라택시"인 객체
        Taxi taxi2 = new Taxi("(주)기아택시"); // taxi2 = Taxi 클래스의 taxiCompanyName이 "(주)기아택시"인 객체

        passenger1.takeTaxi(taxi2); // passenger1이 taxi2를 takeTaxi 했다.
        passenger2.takeTaxi(taxi2); // passenger2이 taxi2를 takeTaxi 했다.

        passenger1.showPassengerInfo(); // passenger1의 돈 현황
        passenger2.showPassengerInfo(); // passenger2의 돈 현황
        taxi1.showTaxiInfo(); // taxi1의 돈 현황
        taxi2.showTaxiInfo(); // taxi2의 돈 현황
    }
}
