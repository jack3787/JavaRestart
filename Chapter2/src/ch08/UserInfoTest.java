package ch08;

public class UserInfoTest {

    public static void main(String[] args) {
        UserInfo Tomas = new UserInfo();
        Tomas.height = 180;
        Tomas.weight = 78;
        Tomas.name = "Tomas";
        Tomas.age = 37;

        System.out.println(Tomas.showUserInfo());

        UserInfo Jin = new UserInfo(178, 68, "Jin", 25);
        System.out.println(Jin.showUserInfo());
    }

}
