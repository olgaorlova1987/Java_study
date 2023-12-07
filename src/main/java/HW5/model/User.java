package HW5.model;
//Создать package – model. Работу продолжаем в нем
//� Реализовать абстрактный класс User и его наследники Student и Teacher.
//Родитель имеет в себе общие данные (пример: фио, год рождения и тд), а
//наследники собственные параметры (какие, по вашему выбору – Пример:
//studentId для Student, teacherId для Teacher
public abstract class User {
    private String name;
    private String secondName;
    private Integer year;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", year=" + year +
                '}';
    }

    public User(String name, String secondName, Integer year) {
        this.name = name;
        this.secondName = secondName;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public Integer getYear() {
        return year;
    }
}