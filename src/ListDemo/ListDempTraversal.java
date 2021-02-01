package ListDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDempTraversal {
    public static void main(String[] args) {
        //创建集合对象，Arraylist
        ArrayList<String> array = new ArrayList<String>();
        array.add("Hello");
        array.add("World");
        array.add("java");
        for(String s: array){
            System.out.println(s);
        }
        System.out.println("--------");
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("hello");
        linkedList.add("java");
        linkedList.add("java");

        for(String s :linkedList){
            System.out.println(s);
        }
    }
}
