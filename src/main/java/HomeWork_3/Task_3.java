package HomeWork_3;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Task_3 {
    public static void main(String[] args) {
        String[] planets = new String[]{
                "Меркурий", "Венера", "Земля",
                "Марс", "Юпитер", "Сатурн",
                "Уран", "Нептун"
        };

        Random rnd = new Random();
        ArrayList<String> list = new ArrayList<>();
        int listSize = rnd.nextInt(100,126);
        for (int i = 0; i < listSize; i++) {
            list.add(planets[rnd.nextInt(planets.length)]);
        }

        System.out.println(list);
        TreeSet<String> set = new TreeSet<>(list);
        System.out.println(set);

    }
}
