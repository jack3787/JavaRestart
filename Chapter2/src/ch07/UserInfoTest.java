package ch07;

public class UserInfoTest {

    public static void main(String[] args) {
        UserInfo Lee = new UserInfo();
        Lee.userId = "201710000";
        Lee.userPassWord = "votmdnjem";
        Lee.userName = "Lee";
        Lee.phoneNumber = "01012341224";
        Lee.userAddress = "Seoul, Korea";

        System.out.println(Lee.showUserInfo());

        UserInfo Kim = new UserInfo("201811111", "votmdnjem2", "Kim");
        System.out.println(Kim.showUserInfo());
    }
}
