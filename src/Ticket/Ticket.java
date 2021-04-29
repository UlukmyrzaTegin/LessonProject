package Ticket;

/**
 * TheSusanin
 * 28 апрель 2021
 */
public class Ticket {
    private int cost;
    private boolean isVip;

    public Ticket(int cost, boolean isVip) {
        this.cost = cost;
        this.isVip = isVip;
    }

    public Ticket() {
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "cost=" + cost +
                ", isVip=" + isVip +
                '}';
    }
}
