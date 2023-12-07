package HW4_OOP;

//1)расширить класс калькулятор на умножение
//        2)расширить класс калькулятор на деление
//        3)расширить класс калькулятор на бинарный перевод(принимаемые значения как стринг, так и инт - тут необходимо подумать как наилучшим образом реализовать,
//        что будет если будут приниматься округляемые Double/Float (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т))
//
//        Формат сдачи: ссылка на гитхаб проект
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();
        Calculator calc3 = new Calculator();

        System.out.println(calc1.sum(Arrays.asList(1, 2, 3, 4, 5)));
//        System.out.println(calc1.sum(Arrays.asList(1.43, 2.34, 3.12, 4.43, 5.32)));
        System.out.println(calc2.multi(Arrays.asList(1, 2, 3, 4, 5)));
       System.out.println(calc3.delenie(Arrays.asList(1, 2, 3, 4, 5)));

        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        number = sc.nextInt();
        System.out.println("Бинарное число " + Integer.toBinaryString(number));


        double number2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите десятичное число: ");
        number2 = scan.nextDouble();
        System.out.println("Бинарное число "+ Long.toBinaryString(Double.doubleToRawLongBits(number2)));

    }
}



