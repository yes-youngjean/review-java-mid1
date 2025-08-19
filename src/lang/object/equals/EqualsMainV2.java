package lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {

        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        //참조값이 다름 => false
        System.out.println("동일성= " + (user1 == user2));

        //직접 구현한 id 비교 equals => true
        System.out.println("동등성= " + (user1.equals(user2)));

    }
}
