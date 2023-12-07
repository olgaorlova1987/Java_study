package HW5.service;

import HW5.model.Student;
import HW5.model.Teacher;
import HW5.model.User;

import java.util.ArrayList;
import java.util.List;

//Создать package – service. Работу продолжаем в нем
//� Создать класс DataService с методами в по управлению сущностями User
//(create, read) и агрегирующий всех пользователей заведенных в системе
//� StudentId должны быть созданы по алгоритму – максимальный id в
//коллекции + 1. Аналогично и для TeacherId. Здесь решение через перебор
//элементов и instanceOf
//
//1
public class UserService implements DataService {
    List<User> listUser;

    public UserService() {
        this.listUser = new ArrayList<>();
    }

    @Override
    public User create(User user) {
        if (user instanceof Student) {
            int id = maxStudentId();
            listUser.add(new Student(user.getName(), user.getSecondName(), user.getYear(), id));
        } else {
            int id = maxTeacherId();
            listUser.add(new Teacher(user.getName(), user.getSecondName(), user.getYear(), id));
        }

        return listUser.get(listUser.size()-1);
    }

    private int maxStudentId() {
        for (int i = listUser.size() -1; i > 0; i--) {
            if (listUser.get(i) instanceof Student) {
                return i+1;
            }
        }
        return 0;
    }

    private int maxTeacherId() {
        for (int i = listUser.size() -1; i > 0; i--) {
            if (listUser.get(i) instanceof Teacher) {
                return i+1;
            }
        }
        return 0;
    }

    @Override
    public List<User> read() {
        return listUser;
    }
}


