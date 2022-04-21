package ch15;

public class Passenger {

    String passengerName;
    int money;

    public Passenger(String passengerName, int money){ //생성자 (매개변수)
        this.passengerName = passengerName;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi){
        taxi.takeMoney(3800);
        money -= 3800;
    }

    public void showInfo(){
        System.out.println(passengerName + "님의 남은 돈은 " + money + "원 입니다.");
    }

}
