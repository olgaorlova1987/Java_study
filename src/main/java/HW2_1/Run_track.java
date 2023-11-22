package HW2_1;

import lombok.Getter;

@Getter
public class Run_track {
    private String name;  //название препятствия
    private int distance;    //длина

    public Run_track(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }


        public void setName (String name){
            this.name = name;
        }

        public void setDistance ( int distance){
            this.distance = distance;
        }

        public void pass(Participant participant) {
            if (participant.getMaxRunDistance() >= distance) {
                System.out.println("Участник" + " " + participant.getName()+ " " + "пробежал дорожку");
            } else {
                System.out.println("Участник" + " " + participant.getName()+  " " + "не пробежал дорожку");
            }


        }
    }

