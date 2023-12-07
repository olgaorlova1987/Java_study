package HW5.model;

import lombok.Getter;

import java.util.List;

@Getter
public class UchebGruppa  {

private Teacher teacher;
    private List<Student> students;

    public UchebGruppa(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    @Override
public String toString() {
    return "UchebGruppa{" +
            "students=" + students +
            '}';
}
}