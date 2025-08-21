package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {

        //참조형 변수는 하나의 인스턴스를 공유할 수 있음
        Address a = new Address("서울");
        Address b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산");   //b -> 변경
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //즉, a와 b는 모두 동일한 Address 인스턴스를 바라보고 있다. (동일한 위치값을 공유)
    }
}
