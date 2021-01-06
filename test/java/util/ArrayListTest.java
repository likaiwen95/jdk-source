package test.java.util;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        testModCount();
    }

    private static void testModCount() {
        List<String> list = new ArrayList<>();
//        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            if (str.equals("2")){
                list.remove(str);
            }else{
                System.out.println(str);
            }
        }

    }

}
