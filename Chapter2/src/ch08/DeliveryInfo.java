package ch08;

public class DeliveryInfo {
    //멤버변수에 public 선언을 하지 않으면, Test 클래스에서 접근할 수 없다.
    int orderNumber;
    int phoneNumber;
    String address;
    int date;
    int time;
    int price;
    int menuNumber;

    public DeliveryInfo(int orderNumber, int phoneNumber, String address,
                        int date, int time, int price, int menuNumber){
        this.orderNumber = orderNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.date = date;
        this.time = time;
        this.price = price;
        this.menuNumber = menuNumber;
    }

    public String showDeliveryInfo(){
        return "주문 접수 번호: " + orderNumber +
                "\n주문 핸드폰 번호: " + phoneNumber +
                "\n주문 집 주소: " + address +
                "\n주문 날짜: " + date +
                "\n주문 시간: " + time +
                "\n주문 가격: " + price +
                "\n메뉴 번호: " + menuNumber;
    }
}
