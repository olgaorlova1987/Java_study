package HW2_1;

public class Living extends Participant {
    public Living(String name, Integer age) {
        super(name, age, 900, 5.8);
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


