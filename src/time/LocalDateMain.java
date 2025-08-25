package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        //현재 날짜
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(1991, 6, 6);

        System.out.println("nowDate = " + nowDate);
        System.out.println("ofDate = " + ofDate);

        //주의! plusDays를 해도 불변값이라 리턴값을 받아야 함
        ofDate = ofDate.plusDays(15000);
        System.out.println("ofDate = " + ofDate);
    }
}
