package ch15;

public class Taxi {

    String taxiCompanyName;
    int income;

    public Taxi(String taxiCompanyName){
        this.taxiCompanyName = taxiCompanyName;
    }

    public void takeMoney(int income){
        this.income += income;
    }

    public void showTaxiInfo(){
        System.out.println(taxiCompanyName + " 회사의 수입은 " + income + "원 입니다.");
    }
}
