//Tasks
//1. Implement a base class Account with the following fields
//owner:String, balance:Double, numberOfTransactions:int
//2. Provide suitable constructor(s), the methods withdraw and
//deposit.
//3. Write a tester method that uses all the methods of the
//class and displays suitable messages
//4. Implement a subclass StoreAccount, using as base the
// Account class with the following extra fields
// storeName:String, accountCategory:string
// 5. Provide suitable constructor(s), the methods withdraw and
// deposit, changeCategory
// 6. Write a tester method that uses all the methods of the class
//and displays suitable messages
// Note: categories are basic, mid, extra, premium.


package Exercise1;

public class Main {

    public static void main(String[] args) {

        Tester1();
        Tester2();
    }

    public static void Tester1() {
        Account account = new Account("Eirini Kelidou", 450, 0);
        System.out.println("Account holder's name : " + account.getOwner() +
                ", balance : " + account.getBalance() +
                ", number of transactions : " + account.getNumberOfTransactions());
        //withdraw
        System.out.println("Account holder's name : " + account.getOwner() +
                ", balance : " + account.BalanceWithdraw(20) +
                ", number of transactions : " + account.getNumberOfTransactions());
        //deposit
        System.out.println("Account holder's name : " + account.getOwner() +
                ", balance : " + account.BalanceDeposit(50) +
                ", number of transactions : " + account.getNumberOfTransactions());
    }

    public static void Tester2() {
        StoreAccount storeaccount = new StoreAccount("Vasiliki Kelidou", 1000, 0,
                "AlphaBank Thessaloniki", Category.MID);
        System.out.println("Account holder's name : " + storeaccount.getOwner() +
                ", balance : " + storeaccount.getBalance() +
                ", number of transactions : " + storeaccount.getNumberOfTransactions() +
                ", store name : " + storeaccount.getStoreName() +
                ", category : " + storeaccount.getAccountCategory());
        //withdraw, change category
        System.out.println("Account holder's name : " + storeaccount.getOwner() +
                ", balance : " + storeaccount.BalanceWithdraw(800) +
                ", number of transactions : " + storeaccount.getNumberOfTransactions() +
                ", store name : " + storeaccount.getStoreName() +
                ", category : " + storeaccount.ChangeCategory());
        //deposit, change category
        System.out.println("Account holder's name : " + storeaccount.getOwner() +
                ", balance : " + storeaccount.BalanceDeposit(1700) +
                ", number of transactions : " + storeaccount.getNumberOfTransactions() +
                ", store name : " + storeaccount.getStoreName() +
                ", category : " + storeaccount.ChangeCategory());

    }
}