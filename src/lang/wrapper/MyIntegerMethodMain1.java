package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);

        //객체지향적으로 객체를 만들고, 객체의 메서드를 제공하는 방식
        int i1 = myInteger.compareTo(5);
        int i2 = myInteger.compareTo(10);
        int i3 = myInteger.compareTo(20 );

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
