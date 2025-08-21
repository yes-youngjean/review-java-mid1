package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    //새로운 객체를 만들어서 반환하는 방법도 있다.
    public ImmutableObj add(int addValue) {
        return new ImmutableObj(value + addValue);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableObj{" +
                "value=" + value +
                '}';
    }
}
