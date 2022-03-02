package Main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //solution1, 2
        List<Integer> numbers1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> numbers2 = new ArrayList<>();
        Set<Integer> numbers3 = new HashSet<>();
        for (Integer number : numbers1) {
            if (number % 2 != 0) {
                numbers2.add(number);
            } else {
                numbers3.add(number);
            }
        }
        System.out.println(numbers2);
        System.out.println(numbers3);

        //solution3

        List<String> words1 = new ArrayList<>(List.of("Мяч", "Доска", "Бита", "Карандаш", "Мяч", "Ветка", "Доска"));
        Set<String> words2 = new HashSet<>(words1);
        System.out.println(words2);

        //solution4

        List<String> words3 = new ArrayList<>(List.of("Дом", "Стена", "Лес", "Озеро", "Река", "Лес", "Проспект", "Дом", "Лес"));
        Map<String, Integer> mapWords = new HashMap<>();

        for (String string : words3) {
            if (mapWords.containsKey(string)) {
                mapWords.put(string, mapWords.get(string) + 1);
            } else {
                mapWords.put(string, 1);
            }
        }

        for (String key : mapWords.keySet()) {
            if (mapWords.get(key) > 1) {
                System.out.println(mapWords.get(key));
            }
        }
    }
}
