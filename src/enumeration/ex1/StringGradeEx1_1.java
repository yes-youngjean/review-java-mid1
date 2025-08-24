package enumeration.ex1;


import static enumeration.ex1.StringGrade.*;

public class StringGradeEx1_1 {
    public static void main(String[] args) {
        int price = 10000;

        enumeration.ex1.DiscountService discountService = new DiscountService();
        int basic = discountService.discount(BASIC, price);
        int gold = discountService.discount(GOLD, price);
        int diamond = discountService.discount(DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
