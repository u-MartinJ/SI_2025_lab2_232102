import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SILab2Test {

    @Test
    public void testEveryStatment(){
        List<Item> items = Arrays.asList(new Item("item1", 1, 100, 0));
        assertEquals(100.0, SILab2.checkCart(items, "1234567890123456"), 0.01);
    }

    @Test
    public void testMultipleCondition() {
        // Тестирање на if (price > 300 || discount > 0 || quantity > 10)
        List<Item> items = Arrays.asList(new Item("item1", 11, 100, 0));
        assertEquals(1070.0, SILab2.checkCart(items, "1234567890123456"), 0.01);
    }

}

class Item {
    String name;
    int quantity; //numerical
    int price;
    double discount;

    public Item(String name, int quantity, int price, double discount) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}

