package Generics;

public class ValueHolder <T>{
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    private T value;
}
