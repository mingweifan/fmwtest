package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author fanmw
 * @create 2021-06-26 18:02
 */
public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String tmp = iter.next();
            System.out.println(tmp);
            if (tmp.equals("4")) {
                list.remove("4");
            }
        }

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        new ConcurrentHashMap<String,String>().put(null,null);

    }
}
