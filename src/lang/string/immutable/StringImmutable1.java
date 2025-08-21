package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = str.concat(" java");
        System.out.println("str = " + str);     //String은 불변객체이기 때문에 기존 str인 'hello'가 출력됨
        System.out.println("str2 = " + str2);   //새로운 객체를 만듦

    }
}
