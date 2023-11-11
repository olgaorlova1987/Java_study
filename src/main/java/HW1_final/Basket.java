package HW1_final;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> products;

    public Basket(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getproducts() {
        return products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "products=" + products +
                '}';
    }
}
