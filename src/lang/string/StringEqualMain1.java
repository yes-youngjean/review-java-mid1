package lang.string;

public class StringEqualMain1 {
    public static void main(String[] args) {

        String str1 = new String("hello");  //x001
        String str2 = new String("hello");  //x002

        System.out.println("new String == 비교: " + (str1 == str2));
        System.out.println("new String equals 비교: " + str1.equals(str2));

        //문자열 pool에 넣음 => 동일한 문자열이 있으면 기존에 pool에 있는 것을 사용함
        String str3 = "hello";
        String str4 = "hello";

        System.out.println("리터럴 == 비교: " + (str3 == str4));         //왜 true? 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용함
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));

    }
}
