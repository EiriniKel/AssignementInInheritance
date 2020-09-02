package Exercise2;

import java.util.ArrayList;
import java.util.List;

public class InventoryRetailStore implements IStore {

    public double totalBuyBalance = 0;
    public double totalSellBalance = 0;
    double sumRevenue = 0;

    List<Product> myList = new ArrayList<>();

    public InventoryRetailStore() {
        myList = new ArrayList<>();
    }

    public void buy(Product product) {
        double buyPrice = product.getPriceWhenBuy();
        totalBuyBalance = totalBuyBalance + buyPrice;
        myList.add(product);
    }

    public void sell(Product product) {
        double sellPrice = product.getPriceWhenSell();
        totalSellBalance = totalSellBalance + sellPrice;
        myList.remove(product);
    }

    public double getRevenue() {
        sumRevenue = totalSellBalance - totalBuyBalance;
        return sumRevenue;
    }

    public void getInventory() {

        for (Product product : myList) {
            System.out.println("Product id : " + product.getId() + ", product name : " + product.getName() + ", buy price : " + product.getPriceWhenBuy() + ", sell price : " + product.getPriceWhenSell());
        }
    }

    public void reset() {
        myList.clear();
    }
}



