package HW5.View;

import HW5.model.Student;

//Создать package – view. Работу продолжаем в нем
//� Создать класс StudentView, содержащий в себе метод вывода в консоль
//данных студента поданных на вход
public class StudentView {
    public void printStudent(Student st) {
        System.out.println("Студент = " + st);
    }
}
