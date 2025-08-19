package lang.object.toString;

public class ToStringMain1 {
    public static void main(String[] args) {

        Object object = new Object();
        String string = object.toString();

        //toString()의 반환값 출력
        System.out.println(string);

        //object 직접 출력
        System.out.println(object);

        //두 값은 같다. 왜? System.out.println => toString()을 이용해 결과를 출력하기 때문.

    }
}
