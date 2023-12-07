package HW5.controller;

import HW5.View.StudentView;
import HW5.model.Student;
import HW5.model.UchebGruppa;
import HW5.model.User;
import HW5.service.UchebGruppaService;
import HW5.service.UserService;
import lombok.Getter;

import java.util.List;

//Создать package – controller. Работу продолжаем в нем
//� Создать класс Controller агрегирующий в себе необходимые классы в виде
//полей, а инициализируем прям в поле.
//� Создаем метод созданиеСтудента – реализующий логику, путем вызова
//соответствующих методов интерфейсов:
//� Создания Студента в сервисе
//� Возвращение всех студентов в сервисе
//� Вызов view и передача списка найденных студентов
@Getter
public class Controller {
    private UserService userService;
    private StudentView studentView;
    private UchebGruppaService uchebGruppaService;


    public Controller(UchebGruppaService uchebGruppaService) {
        this.uchebGruppaService = uchebGruppaService;
    }

    public Controller() {
        this.userService = new UserService();
        this.studentView = new StudentView();
    }

    public Student createStudent(Student student) {
        return (Student) userService.create(student);
    }

    public void printStudents(Student student) {
        studentView.printStudent(student);
    }

    public List<User> returnStudents() {
        return userService.read();
    }


    public UchebGruppa createUchebGruppa(long teacherId, List<Long> studentsId) {
        long teacher = getTeacher(teacherId);
        List<Student> students = getStudents(studentsId);
        return UchebGruppaService.createUchebGruppa(teacher, students);
    }

    private List<Long> getStudents(List<Long> studentsId) {
        return studentsId;
    }

    private long getTeacher(long teacherId) {
        return teacherId;
    }

//    private List<Student> getStudents(List<Long> studentsId) {
//        return students;
//    }
//
//    private Teacher getTeacher(long teacherId) {
//        return teacher;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setStudentView(StudentView studentView) {
        this.studentView = studentView;
    }

    public void setUchebGruppaService(UchebGruppaService uchebGruppaService) {
        this.uchebGruppaService = uchebGruppaService;
    }

    public Controller(UserService userService, StudentView studentView, UchebGruppaService uchebGruppaService) {
        this.userService = userService;
        this.studentView = studentView;
        this.uchebGruppaService = uchebGruppaService;
    }

    public UchebGruppa createUchebGruppa(long l, long l1, long l2) {
    }
}



