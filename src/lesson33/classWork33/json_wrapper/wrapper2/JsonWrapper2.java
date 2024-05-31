package lesson33.classWork33.json_wrapper.wrapper2;

public class JsonWrapper2 <T> {

    private T value;

    public JsonWrapper2(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value:" + value + "}";
    }
}
