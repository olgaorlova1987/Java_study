package HW1_final;

import java.util.ArrayList;

public class category {
    private String name;

    private ArrayList<Product> products;

    public category(String name) {
        this.name = name;
    }

    public category addproductstocategory(ArrayList<Product> products){
        this.products = products;
        return this;
    }

    public ArrayList<Product> getproducts() {
        return products;
    }

    public String getname() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
