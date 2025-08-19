package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {

        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        //참조값이 다름
        System.out.println("identity: " + (user1 == user2));

        //equals도 == 비교 수행
        System.out.println("equality: " + (user1.equals(user2)));

    }
}
