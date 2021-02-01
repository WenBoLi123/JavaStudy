package Gennric;
/*泛型类、泛型方法*/
public class Generic<T> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
    public void show(T t){
        System.out.println(t);
    }
}
