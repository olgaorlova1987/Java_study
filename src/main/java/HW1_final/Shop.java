package HW1_final;

import java.util.ArrayList;

public class Shop {

   private ArrayList<category> Catalog;

   public Shop() {
       this.Catalog = new ArrayList<category>();
       initcatalog();
    }

    private void initcatalog(){
        Product product;

       //drinks
        ArrayList<Product>  products = new ArrayList<Product>();
        products.add(new Product("Фанта", 25.1, 10));
        products.add(new Product("Спрайт", 35.1, 8));
        products.add(new Product("Кола", 35.1, 8));

        addcategorytocatalog("Drinks", products);

       //foods
        products = new ArrayList<Product>();
        products.add(new Product("Морковь", 25.1, 10));
        products.add(new Product("Свекла", 22.2, 7));
        products.add(new Product("Картошка", 22.2, 7));

        addcategorytocatalog("Foods", products);
    }

    private void addcategorytocatalog(String namecategory, ArrayList<Product> products){
        category newcat;
        newcat = new category(namecategory);
        newcat = newcat.addproductstocategory(products);
        Catalog.add(newcat);
    }

    public ArrayList<category> getcatalog(){
        return Catalog;
    }

    public void printcatalog(){
        System.out.println("============НАЧАЛО ВЫВОДА КАТАЛОГА==============");
        System.out.println("Общее количество товаров в каталоге - " + countCatalogItems());
         for (category CurrentCategory: Catalog) {
            System.out.println("Категория: "+ " " + CurrentCategory.getname());
            ArrayList<Product> products = CurrentCategory.getproducts();
            for (Product product: products) {
                System.out.println("Продукт:" + " " + product.getname() + " "+ "Цена: " + " " + product.getcost() + " " + "Рейтинг: " + " " + product.getrating());
            }
        }
        System.out.println("============КОНЕЦ ВЫВОДА КАТАЛОГА==============");
    }

    public User buy(User user, Basket basket){
       //обходим все что в корзине и удаляем из общего каталога
       //обход корзины
        for (Product product: basket.getproducts()) {
            //обход категорий общего каталога
            for (category CurrentCategory: Catalog) {
                CurrentCategory.getproducts().remove(product);
            }
        }

        //после удаления из общего каталога, добавляем корзину пользователю
        user.setBasket(basket);
        return user;
    }

    public int countCatalogItems(){
       int items = 0;
         for (category CurrentCategory: Catalog) {
             items = items + CurrentCategory.getproducts().size();

        }
         return items;
    }
}
