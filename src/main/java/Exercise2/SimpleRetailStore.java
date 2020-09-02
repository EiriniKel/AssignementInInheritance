package Exercise2;


public class SimpleRetailStore implements IStore {

    public double totalBuyBalance =0;
    public double totalSellBalance=0;


    @Override
    public void buy(Product product) {
        double buyPrice = product.getPriceWhenBuy();
        totalBuyBalance = totalBuyBalance + buyPrice;
    }

    @Override
    public void sell(Product product) {
        double sellPrice = product.getPriceWhenSell();
        totalSellBalance = totalSellBalance + sellPrice;
    }

    @Override
    public double getRevenue() {
    double revenue = 0;
    revenue = totalSellBalance - totalBuyBalance;
    return revenue;
    }
}
