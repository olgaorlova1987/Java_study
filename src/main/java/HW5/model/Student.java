package HW5.model;


import lombok.Getter;

@Getter
public class Student extends User {
        private Integer id;

        public void setId(Integer id) {
            this.id = id;
        }

        public Student(String name, String secondName, Integer year, Integer id) {
            super(name, secondName, year);
            this.id = id;
        }


    @Override
        public String toString() {
            return "Имя : "+ " "+ getName()+ "\n"+ "id="  +id +"\n"+ "Фамилия"+" "+ getSecondName()+" "+"\n"+ "Год"+ " "+ getYear() ;
        }
    }