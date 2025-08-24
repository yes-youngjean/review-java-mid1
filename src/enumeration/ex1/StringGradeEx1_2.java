package enumeration.ex1;

import enumeration.ex1.DiscountService;

import static enumeration.ex1.StringGrade.*;

public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        enumeration.ex1.DiscountService discountService = new DiscountService();
        //존재하지 않는 등급 => 할인X
        int vip = discountService.discount("VIP", price);

        int basic = discountService.discount(BASIC, price);
        int gold = discountService.discount(GOLD, price);
        int diamond = discountService.discount(DIAMOND, price);

        System.out.println("vip = " + vip);
        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
