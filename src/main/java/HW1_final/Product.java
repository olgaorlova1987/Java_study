package HW1_final;

import lombok.Getter;


@Getter
public class Product {
    private String name;
    private Double cost;
    private Integer rating;

    public Product(String name, Double cost, Integer rating) {
        this.name = name;
        this.cost = cost;
        this.rating = rating;
    }

    public String getname() {
        return name;
    }

    public Double getcost() {
        return cost;
    }

    public Integer getrating() {
        return rating;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", rating=" + rating +
                '}';
    }
}


