package HW1_final;
/*Домашнее задание на закрепление:

        1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
        2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько
        объектов класса Категория.
        3)Создать класс Basket, содержащий массив купленных товаров.
        4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов
        класса User.
        5)Вывести на консоль каталог продуктов. (все продукты магазина)
        6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар,
         а из магазина - удаляется)

        Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре*/

import java.util.ArrayList;

public class HW1 {
    public static void main(String[] args) {

        //=======Получение и печать каталога============
        Shop Shop = new Shop();
        ArrayList<category> Catalog = Shop.getcatalog();
        Shop.printcatalog();

        //======Покупка пользователя через корзину======
        //1. набираем произвольно в корзину из общего каталога
        ArrayList<Product> partbasket1 = new ArrayList<>();
        partbasket1.add(Catalog.get(0).getproducts().get(1));
        partbasket1.add(Catalog.get(1).getproducts().get(0));

        ArrayList<Product> partbasket2 = new ArrayList<>();
        partbasket2.add(Catalog.get(0).getproducts().get(2));
        partbasket2.add(Catalog.get(1).getproducts().get(1));

        //2. создаем корзину с этими продуктами
        Basket Basket1 = new Basket(partbasket1);
        Basket Basket2 = new Basket(partbasket2);

        //3. создаем пользователя только с логином и паролем
        User User1 = new User("also", "12368712");
        User User2 = new User( "olga", "868686868");

        //4. Запускаем процедуру покупки. Из каталога магазина товар удаляем, в корзину пользователя добавляем
        User1 = Shop.buy(User1, Basket1);
        User2 = Shop.buy(User2, Basket2);

        //5. Печатаем что было в корзине
        System.out.println("Товары в корзине у: "+ User1.getLogin());
        User1.printbasket();

        System.out.println("Товары в корзине у: "+ User2.getLogin());
        User2.printbasket();


        //6. Печатаем весь каталог повторно, чтобы убедится, что удалились товары
        Shop.printcatalog();
        }
    }



