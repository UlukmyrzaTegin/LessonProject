package less_16_MapHashMap.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * TheSusanin
 * 4/22/2021
 */
public class MapCat {
    public static void main(String[] args) {
        //Создадим хеш-карточку
        Map<String, Integer> catMap = new HashMap<>();

        //Помещаем данные на карточку
        catMap.put("Васька", 5);
        catMap.put("Мурзик", 8);
        catMap.put("Рыжик", 12);
        catMap.put("Барсик", 2);

        //получаем набор элементов
        Set<Map.Entry<String, Integer>> set = catMap.entrySet();

        //Отобразим набор элементов - выбираем все ключи и значения одновременно
        for (Map.Entry<String, Integer> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        //Добавляем значение
        int value = catMap.get("Рыжик");
        catMap.put("Рыжик", value + 3);
        System.out.println("У Рыжика стало " + catMap.get("Рыжик"));

    }
}
