package HW5;

import HW5.controller.Controller;
import HW5.model.Student;
import HW5.model.UchebGruppa;
import HW5.service.UchebGruppaService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller =  new Controller();
        Student student = controller.createStudent(new Student("Ivan", "Ivanov", 2001, 1));
        controller.printStudents(student);
        controller.returnStudents();

        UchebGruppaService uchebGruppaService = new UchebGruppaService();
        Controller controller1 = new Controller(uchebGruppaService);

        List<Long> studentIds = Arrays.asList(1L,2L);
        UchebGruppa uchebGruppa = controller1.createUchebGruppa(10L, 1L, 2L);
    }
}
