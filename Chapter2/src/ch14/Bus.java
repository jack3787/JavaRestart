package ch14;

public class Bus {

    int busNumber;
    int passengerCount; //승객은 탈 때마다 늘어나므로.
    int money;

    public Bus(int busNumber) { //Bus 생성자
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++; //돈 낸 사람이 늘어난 것 = 승객이 탄 것
    }

    public void showBusInfo(){
        System.out.println(busNumber + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
    }
}
