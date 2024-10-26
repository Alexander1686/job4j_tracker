package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
       products[index] = null;
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[7];
        products[0] = new Product("Oil", 10);
        products[1] = new Product("Egg", 4);
        products[2] = new Product("Milk", 19);
        products[3] = new Product("Bread", 19);
        products[4] = new Product("Fish", 19);
        products[5] = new Product("Fruit", 19);
        products[6] = new Product("Salt", 19);
        Product[] updatedProducts = ShopDrop.delete(products, 1);
        for (Product product : updatedProducts) {
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}