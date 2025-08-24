package enumeration.ex3;

import static enumeration.ex3.Grade.*;

public class StringGradeEx3_1 {
    public static void main(String[] args) {
        int price = 10000;

        enumeration.ex3.DiscountService discountService = new DiscountService();
        int basic = discountService.discount(BASIC, price);
        int gold = discountService.discount(GOLD, price);
        int diamond = discountService.discount(DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
