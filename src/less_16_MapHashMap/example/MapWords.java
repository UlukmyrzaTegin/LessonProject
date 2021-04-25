package less_16_MapHashMap.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * TheSusanin
 * 4/22/2021
 */

/* Одинаковые слова в списке
Ввести с клавиатуры в список 20 слов. Нужно подсчитать количество одинаковых слов в списке. Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка, а второй – число, сколько раз данная строка встречалась в списке.
Вывести содержимое словаря на экран.
*/
public class MapWords {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите 20 слов");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 20 ; i++) {
            words.add(reader.readLine());
        }
        Map<String, Integer> map = countWords(words);
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for (String word : list) {
            result.put(word, result.containsKey(word) ? result.get(word) + 1 : 1);
        }
        return  result;
    }
}
