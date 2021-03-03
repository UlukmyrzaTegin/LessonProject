package less_11_encapsulation.example;



/**
 * TheSusanin
 * 03 март 2021
 */
public class TestAccountEncap {
    public static void main(String[] args) {
        AccountEncap accountEncap = new AccountEncap();
        accountEncap.setAcc_no(996709858858L);
        accountEncap.setName("Ulukmyrza Zhakypbekov");
        accountEncap.setEmail("ulukmyrza.zhakypbekov@gmail.com");
        accountEncap.setAmount(500000f);
        System.out.println("Phone: " + accountEncap.getAcc_no() + " Full Name: " + accountEncap.getName() + " e-gmail: " + accountEncap.getEmail() + " Salary: " + accountEncap.getAmount());
    }
}
