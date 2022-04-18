package ch08;

//키가 180이고 몸무가 78킬로 Tomas, 나이는 37세

public class UserInfo {
    public int height;
    public int weight;
    public String name;
    public int age;

    public UserInfo(){}

    public UserInfo(int height, int weight, String name, int age){
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.age = age;
    }

    public String showUserInfo() {
        return name + "의 키는 " + height + "cm, 몸무게는 " + weight + "kg, 나이는 " + age + "살 입니다.";
    }


}
