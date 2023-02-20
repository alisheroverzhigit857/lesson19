import lessonTask.City;

public class Main {
    public static void main(String[] args) {
    /*    DaysOfWeek days =  DaysOfWeek.TUESDAY;
        System.out.println(days.getTranslate());
    }*/

        for (City city1: City.values() ) {
            System.out.println(city1.name());
            System.out.println(city1.getOzgocholuktoru());
        }

    }
}