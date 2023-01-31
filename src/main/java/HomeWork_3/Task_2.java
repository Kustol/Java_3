package HomeWork_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(-100, 100));
        }
        System.out.println("Generated list: " + list);
        System.out.println("Minimum value: " + findMin(list).toString());
        System.out.println("Maximum value: " + findMax(list).toString());
        System.out.println("Average value: " + findAverage(list).toString());
    }

    public static Integer findMin(List<Integer> list) {
        int min = list.get(0);
        for(Integer value: list) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static Integer findMax(List<Integer> list) {
        int max = list.get(0);
        for(Integer value: list) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static Double findAverage(List<Integer> list) {
        double value = 0;
        for(Integer i: list) {
            value += i;
        }
        double result = value / list.size();
        return result;
    }
}
