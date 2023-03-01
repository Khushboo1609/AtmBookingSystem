import bankAtmApp.Account;
import bankAtmApp.AccountHolder;

public class Main {
    public static void main(String[] args) {
        Account account =new Account();
        AccountHolder ah=new AccountHolder(account);
        Thread t1=new Thread(ah);
        Thread t2=new Thread(ah);
        t1.setName("jack");
        t2.setName("joya");
        t1.start();
        t2.start();

    }
}