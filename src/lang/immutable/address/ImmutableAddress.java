package lang.immutable.address;

public class ImmutableAddress {

    //사실 set을 없애도 값을 바꿀 수 있는 방법이 없긴 함
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
