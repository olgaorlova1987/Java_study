package HW2_1;

import lombok.Getter;

@Getter
public abstract class Participant {
    public static int count;
    protected String name;
    protected Integer age;
    protected Integer maxRunDistance;
    protected Double maxJampDistance;

    public Participant(String name, Integer age, Integer maxRunDistance, Double maxJampDistance) {
        this.name = name;
        this.age = age;
        this.maxRunDistance = maxRunDistance;
        this.maxJampDistance = maxJampDistance;
    }


    public static void setCount(int count) {
        Participant.count = count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMaxRunDistance(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
    }

    public void setMaxJampDistance(double maxJampDistance) {
        this.maxJampDistance = maxJampDistance;
    }

    public void run(int distance) {
        if (distance < maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " метров.");
        } else {
            System.out.println(name + " не пробежал " + distance + " метров.");
        }
    }

    public void jamp(Double height) {
        if (height < maxJampDistance) {
            System.out.println(name + " прыгнул " + height + " метров.");
        } else {
            System.out.println(name + " не прыгнул " + height + " метров.");
        }
        ;
    }


    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", maxRunDistance=" + maxRunDistance +
                ", maxJampDistance=" + maxJampDistance +
                '}';
    }
}


