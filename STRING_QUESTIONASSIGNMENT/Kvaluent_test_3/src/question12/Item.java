package question12;
import java.util.*;
public class Item {
	  String ItemName;
	    double price;
	    int quantity;

	    public Item(String name, double price, int quantity) {
	        this.ItemName = ItemName;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    public double getTotalCost() {
	        return price * quantity;
	    }
}
