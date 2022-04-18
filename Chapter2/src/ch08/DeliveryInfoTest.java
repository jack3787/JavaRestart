package ch08;

public class DeliveryInfoTest {
//    return "주문 접수 번호: " + orderNumber +
//            "\n주문 핸드폰 번호: " + phoneNumber +
//            "\n주문 집 주소: " + address +
//            "\n주문 날짜: " + date +
//            "\n주문 시간: " + time +
//            "\n주문 가격: " + price +
//            "\n메뉴 번호: " + menuNumber;
    public static void main(String[] args) {
        DeliveryInfo A = new DeliveryInfo(1, 01012341234,
                "서울 xx구 xx동 11-22", 220401, 121313, 33000, 003);
        System.out.println(A.showDeliveryInfo());
    }

}
