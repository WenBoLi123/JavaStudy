package Gennric;

public class Demo {
    public static void main(String[] args) {
        Generic<String> g1 = new Generic<String>();

        g1.show("林青霞");
        Generic3<String> g2= new Generic3Impl<>();
        g2.show("王祖贤");
    }
}
