package HW2_1;

import lombok.Getter;

@Getter
public class Cat extends Living {
    private String name;

    public Cat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void run(int distance) {
        super.run(distance);
    }

    @Override
    public void jamp(Double height) {
        super.jamp(height);
    }

    public void setName(String name) {
        this.name = name;
    }

    }

