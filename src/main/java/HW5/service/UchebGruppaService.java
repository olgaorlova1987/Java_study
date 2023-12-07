package HW5.service;

import HW5.model.Student;
import HW5.model.Teacher;
import HW5.model.UchebGruppa;

import java.util.List;

public class UchebGruppaService {

    public UchebGruppaService() {
    }

    public static UchebGruppa createUchebGruppa(Teacher teacher, List<Student> students){
        return new UchebGruppa(teacher, students);
    }
}
