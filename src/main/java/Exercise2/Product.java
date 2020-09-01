package Exercise2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    public int id;
    public String name;
    public double priceWhenBuy;
    public double priceWhenSell;
}
