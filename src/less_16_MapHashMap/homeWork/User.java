package less_16_MapHashMap.homeWork;

import java.util.Date;

/**
 * TheSusanin
 * 4/21/2021
 */
public class User {
    private Long id;
    private String login;
    private String password;
    private boolean active;
    private Date blockDate;
    private int loginCount;

    public User(Long id,String password, boolean active, Date blockDate, int loginCount) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.active = active;
        this.blockDate = blockDate;
        this.loginCount = loginCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin(String s) {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword(String s) {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getBlockDate() {
        return blockDate;
    }

    public void setBlockDate(Date blockDate) {
        this.blockDate = blockDate;
    }

    public int getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(int loginCount) {
        this.loginCount = loginCount;

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", blockDate=" + blockDate +
                ", loginCount=" + loginCount +
                '}';
    }
}
