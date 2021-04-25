package less_16_MapHashMap.homeWork;

import java.util.HashMap;

/**
 * TheSusanin
 * 4/23/2021
 */
public class LoginAndPassword {
    HashMap<String, User> loginInfo = new HashMap<>();

    User firstUser = new User(1L, "123321", true, null, 0);
    User secondUser = new User(2L, "456654", true, null, 0);
    User threeUser = new User(3L, "789987", true, null, 0);

    LoginAndPassword() {
        loginInfo.put("Dima", firstUser);
        loginInfo.put("Adi", secondUser);
        loginInfo.put("Elina", threeUser);
    }

    public HashMap<String, User> getLoginInfo() {
        return loginInfo;
    }
}
