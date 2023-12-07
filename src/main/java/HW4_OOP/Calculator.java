package HW4_OOP;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
//   3)	Написать класс калькулятор, принимающий List целочисленных значений,
//    возвращающий сумму элементов коллекции (метод sum)

    public Double sum(List<? extends Number> arr) {
        double result = 0;
        for (Number number : arr) {
            result += number.doubleValue();
        }
        return result;
    }

    public Double multi(List<? extends Number> arr) {
        double result1 = 0;
        for (Number number : arr) {
            result1 += number.doubleValue() * number.doubleValue();
        }
        return result1;
    }

        public Double delenie (List < ? extends Number > arr){
            double result1 = 0;
            for (Number number : arr) {
                result1 += number.doubleValue() / number.doubleValue();
            }
            return result1;
        }


    private static ArrayList<Integer> extractDigit(int num) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        while (num > 0) {
            digits.add(num % 10);
            num = num / 10;
        }
        return digits;
    }


    }


