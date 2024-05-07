package question12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCartDemo {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    String collectionType = scanner.nextLine();
    List<Item> cart;
    if (collectionType.equals("ArrayList")) {
        cart = new ArrayList<>();
    } else if (collectionType.equals("HashSet")) {
        cart = new ArrayList<>(); 
    } else {
        System.out.println("Invalid collection type.");
        return;
    }

// items
    while (true) {
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            break;
        }
        String[] details = input.split(" ");
        String ItemName = details[0];
        double price = Double.parseDouble(details[1]);
        int quantity = Integer.parseInt(details[2]);
        cart.add(new Item(ItemName, price, quantity));
    }

   // Total Price
    double totalPrice = 0;
    for (Item item : cart) {
        totalPrice += item.getTotalCost();
    }
//Discount
    double discount = 0;
    if (totalPrice > 100) {
        discount = totalPrice * 0.1;
    }
//Bill
    System.out.println("Items:");
    for (Item item : cart) {
        System.out.printf("%s(%d*$%.2f)-$%.2f\n", item.ItemName, item.quantity, item.price, item.getTotalCost());
    }
    System.out.printf("Total Price: $%.2f\n", totalPrice);
    System.out.printf("Discount (10%%): $%.2f\n", discount);
    System.out.printf("Final Price: $%.2f\n", totalPrice - discount);
}
}
