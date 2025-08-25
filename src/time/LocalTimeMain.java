package time;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(9, 10, 10);

        System.out.println("nowTime = " + nowTime);
        System.out.println("ofTime = " + ofTime);
    }
}
