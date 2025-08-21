package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {

        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        //회원A와 회원B의 주소는 모두 서울
        System.out.println("memberA: " + memberA);
        System.out.println("memberB: " + memberB);

        //회원B의 주소를 부산으로 변경해야 한다면? => 부산을 값으로 갖는 새로운 불변 객체가 필요함
        memberB.setAddress(new ImmutableAddress("부산"));
        System.out.println("memberA: " + memberA);
        System.out.println("memberB: " + memberB);
    }
}
