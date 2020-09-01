package Exercise2;

import java.util.ArrayList;

public class SimpleRetailStore implements IStore {

    public double totalBuyBalance =0;
    public double totalSellBalance=0;

    private ArrayList<Product> myArray;


    @Override
    public void buy(Product product) {
        double buyPrice = product.getPriceWhenBuy();
        totalBuyBalance = totalBuyBalance + buyPrice;
        myArray.add(product);
    }

    @Override
    public void sell(Product product) {
        double sellPrice = product.getPriceWhenSell();
        totalSellBalance = totalSellBalance + sellPrice;
        myArray.remove(product);
    }

    @Override
    public double getRevenue() {
    double revenue = 0;
    revenue = totalSellBalance - totalBuyBalance;
    return revenue;
    }
}
