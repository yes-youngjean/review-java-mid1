package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {

        //해결방법: 아예 다른 객체로 만들면 됌
        Address a = new Address("서울");
        Address b = new Address("서울");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");   //b -> 변경
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
