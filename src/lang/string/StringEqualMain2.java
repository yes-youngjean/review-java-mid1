package lang.string;

public class StringEqualMain2 {
    public static void main(String[] args) {

        String str1 = new String("hello");  //x001
        String str2 = new String("hello");  //x002
        System.out.println("메서드 호출 비교1: " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3, str4));

    }

    private static boolean isSame(String str1, String str2) {
//        return str1 == str2;
        return str1.equals(str2);       //문자열 비교는 항상 equals를 사용해서 동등성 비교를 해야 함!
    }
}
