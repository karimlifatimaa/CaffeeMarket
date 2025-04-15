package cofeMarkedApp;

public class Order {
    private Customer customer;
    private Cart<CoffeeProduct> cart;

    public Order(Customer customer, Cart<CoffeeProduct> cart) {
        this.customer = customer;
        this.cart = cart;
    }

    public void placeOrder() {
        System.out.println("Sifaris Verildi: " + customer.getName());
        cart.viewAllProducts();
        System.out.println("Total : "+ cart.calculateTotalPrice());
        cart.clearCart();
        System.out.println("Sebet temizlendi.");
    }
}
