package Exercise1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    public String owner;
    public double balance;
    public int numberOfTransactions;


    public double BalanceWithdraw(double withdraw) {
        balance = getBalance() - withdraw;
        numberOfTransactions = numberOfTransactions + 1;
        return balance;
    }

    public double BalanceDeposit(double deposit) {
        balance = getBalance() + deposit;
        numberOfTransactions = numberOfTransactions + 1;
        return balance;
    }


}