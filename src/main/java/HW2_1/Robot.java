package HW2_1;

public class Robot extends Participant {
    public Robot(String name, Integer age) {
        super(name, age, 500, 5.9);
    }


    @Override
    public void run(int distance) {
        super.run(distance);
    }

    @Override
    public void jamp(Double height) {
        super.jamp(height);
    }


}
