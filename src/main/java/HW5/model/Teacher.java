package HW5.model;


public class Teacher extends User {
    private Integer id;

    public Teacher(String name, String secondName, Integer year, Integer id) {
        super(name, secondName, year);
        this.id = id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                '}';
    }

}
