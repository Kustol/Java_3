package HomeWork_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int value = rnd.nextInt(-100, 100);
            list.add(value);
        }
        System.out.println("Generated list: " + list);
        System.out.println("List of positive integers: " + removeEvenValue(list).toString());
    }

    public static List<Integer> removeEvenValue(List<Integer> list) {
        List<Integer> result = new ArrayList<>(list);
        Iterator<Integer> even = result.iterator();
        while (even.hasNext()) {
            if (even.next() % 2 == 0) {
                even.remove();
            }
        }
        return result;
    }
}
