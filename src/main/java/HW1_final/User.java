package HW1_final;

public class User {
    private String login;
    private String password;

    private Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public void printbasket(){
        System.out.println("============НАЧАЛО ВЫВОДА КОРЗИНЫ==============");
        System.out.println("Общее количество товаров в корзине - " + basket.getproducts().size());
        for (Product product: basket.getproducts()) {
            System.out.println("===Продукт:" + product.getname() + "===Цена===" + product.getcost()+ "===Рейтинг===" + product.getrating());
        }

        System.out.println("============КОНЕЦ ВЫВОДА КОРЗИНЫ==============");
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", basket=" + basket +
                '}';
    }
}
