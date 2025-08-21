package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        String result1 = a.concat(b);
        String result2 = a + b;     //String은 참조형이라 원칙적으로 불가함. 하지만 Java는 편의상 해당 기능을 제공함

        System.out.println(result1);
        System.out.println(result2);
    }
}
