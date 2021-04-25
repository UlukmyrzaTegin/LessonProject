package less_16_MapHashMap.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * TheSusanin
 * 4/22/2021
 */
public class MapRandom {
    public static void main(String[] args) {
        Random random = new Random(36);
        Map<Integer, Integer> randomMap = new HashMap<>();
        for (int i = 0; i <  100; i++) {
            //Создадим число от 0 до 99
            int number = random.nextInt(99);
            Integer frequency = randomMap.get(number);
            randomMap.put(number, frequency == null ? 1 : frequency + 1);
        }
        System.out.println(randomMap);
    }
}

// Метод get() возвращает null, если ключ отсутствует,
// т.е число было сгенерировано впервые или в противном случае метод возвращает
// для данного ключа ассоциированное значение, которое увеличивается на единицу.

