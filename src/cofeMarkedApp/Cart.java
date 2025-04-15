package cofeMarkedApp;

import java.util.ArrayList;

public class Cart<T extends CoffeeProduct> {
    private ArrayList<T> cartProducts;
    private double totalPrice=0;
    public Cart() {
        cartProducts = new ArrayList<>();
    }
    public void addById(int id,ArrayList<T> products) {
        boolean found = false;
        for (T product : products) {
            if(product.getId()==id){
                cartProducts.add(product);
                totalPrice+=product.getPrice();
                System.out.printf("Mehsul elave edildi: "+ product.getName());
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Bele mehsul yoxdur");
        }
    }
    public void removeProduct(int productId) {
        boolean removed = false;
        for (T item : cartProducts) {
                if (item.getId() == productId) {
                    cartProducts.remove(item);
                    totalPrice-=item.getPrice();
                    System.out.println(item.getName() + " Mehsul silindi.");
                    removed = true;
                    break;
                }
        }
        if(!removed){
            System.out.println("Bele mehsul yoxdur");
        }
    }
    public void viewAllProducts() {
        if(cartProducts.size()==0){
            System.out.println("Mehsul yoxdur: ");
        }else {
            for (T item : cartProducts) {
                System.out.println(item.getName());
            }
        }

    }
    public double calculateTotalPrice() {
        return totalPrice;
    }
    public void clearCart() {
        cartProducts.clear();
        totalPrice = 0;
    }
}
