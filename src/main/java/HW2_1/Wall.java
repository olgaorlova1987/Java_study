package HW2_1;

import lombok.Getter;

@Getter
public class Wall {
private String name;
private Double height;

    public Wall(String name, Double height) {
        this.name = name;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void pryczok (Participant participant) {
        if (participant.getMaxJampDistance()>= height) {
            System.out.println("Участник" + " " + participant.getName() + " перепрыгнул препятствие");
        } else {
            System.out.println("Участник" + " " + participant.getName() + " не перепрыгнул препятствие");
        }
    }


    @Override
    public String toString() {
        return "Wall{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}

