package time;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime of = LocalDateTime.of(2025, 8, 1, 8, 10, 1);

        System.out.println("now = " + now);
        System.out.println("of = " + of);
    }
}
