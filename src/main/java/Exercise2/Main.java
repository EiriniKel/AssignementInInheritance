package Exercise2;

public class Main {

    public static void main(String[] args) {
        Product x1 = new Product(1, "Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product(2, "Painting Tsarouxis. Naftis A", 200, 2000);
        Product x4 = new Product(3, "Chair. Luis XV", 100, 1000);
        System.out.println(x1.getId() + " " + x1.getName() + " " + x1.priceWhenBuy + " " + x1.getPriceWhenSell());
        System.out.println(x2.getId() + " " + x2.getName() + " " + x2.priceWhenBuy + " " + x2.getPriceWhenSell());
        System.out.println(x4.getId() + " " + x4.getName() + " " + x4.priceWhenBuy + " " + x4.getPriceWhenSell());

        IStore simple = new SimpleRetailStore();
        simple.buy(x1);
        simple.buy(x4);
        simple.sell(x1);
        System.out.println(simple.getRevenue());

        System.out.println("\n");
        IStore invStore = new InventoryRetailStore();
        invStore.buy(x1);
        invStore.buy(x4);
        invStore.sell(x1);
        System.out.println(invStore.getRevenue());
        invStore.sell(x2);
        invStore.getInventory();
        System.out.println("Revenue is " + invStore.getRevenue());

    }
}