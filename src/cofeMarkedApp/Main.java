package cofeMarkedApp;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<CoffeeProduct> products = new ArrayList<>();
        products.add(new CoffeeProduct(1, 3.50, "Espresso"));
        products.add(new CoffeeProduct(2, 4.00, "Latte"));
        products.add(new CoffeeProduct(3, 4.20, "Cappuccino"));
        Customer customer = new Customer(1, "Fatime", "fatime@example.com");
        Cart<CoffeeProduct> cart = new Cart<>();
        Order order = new Order(customer, cart);

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Welcome to CaffeeMarket!");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. Remove Product from Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Place Order");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");



            try {
                int secim = scanner.nextInt();
                switch (secim) {
                    case 1:
                        System.out.println("Available Coffee:");
                        for (CoffeeProduct p : products) {
                            System.out.println(p.getId() + ". " + p.getName() + " - $" + p.getPrice());
                        }
                        break;
                    case 2:
                        System.out.print("Enter Product ID to Add: ");
                        int addId = scanner.nextInt();
                        cart.addById(addId, products);
                        break;
                    case 3:
                        System.out.print("Enter Product ID to Remove: ");
                        int removeId = scanner.nextInt();
                        cart.removeProduct(removeId);
                        break;
                    case 4:
                        System.out.println("\nItems in Cart:");
                        cart.viewAllProducts();
                        System.out.println("Total: $" + cart.calculateTotalPrice());
                        break;
                    case 5:
                        order.placeOrder();
                        break;
                    case 6:
                        System.out.println("Thank you for visiting CaffeeMarket!");
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                scanner.nextLine(); // sonsuz dovr yaranirdi
            }
        }
    }
}
