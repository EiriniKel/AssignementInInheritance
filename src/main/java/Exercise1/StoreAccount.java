package Exercise1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StoreAccount extends Account {

    public StoreAccount(String storeName, Category accountCategory) {
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }

    public StoreAccount(String owner, double balance, int numberOfTransactions, String storeName, Category accountCategory) {
        super(owner, balance, numberOfTransactions);
        this.storeName = storeName;
        this.accountCategory = accountCategory;
    }

    public String storeName;
    public Category accountCategory;

    public Category ChangeCategory() {
        if (balance <= 400) {
            accountCategory = Category.BASIC;
        } else if (balance <= 700) {
            accountCategory = Category.MID;
        } else if (balance <= 1200) {
            accountCategory = Category.EXTRA;
        } else {
            accountCategory = Category.PREMIUM;
        }
        return accountCategory;
    }
}
