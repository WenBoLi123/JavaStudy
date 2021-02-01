package Gennric;

public class Generic3Impl<T> implements Generic3<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
