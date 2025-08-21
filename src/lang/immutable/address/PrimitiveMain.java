package lang.immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {

        //기본형은 절대로 같은 값을 공유하지 않음
        int a = 10;
        int b = a;  //a->b 값 복사 후 대입
        //즉, 이렇게 하더라도 b에 복사된 10은 a와는 완전히 다른 10임 => 너무 당연함

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b= 20;
        System.out.println("20 -> b = " + b);
    }
}
