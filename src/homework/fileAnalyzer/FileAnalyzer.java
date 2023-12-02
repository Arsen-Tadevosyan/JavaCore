package homework.fileAnalyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileAnalyzer {

    public static Map<String, Integer> wordMap(String path) {
        // Читаем файл, составляем мапу слово-количество и возвращаем ее
        Map<String, Integer> resultMap = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.replaceAll(",", "").replaceAll(";", "")
                        .replaceAll("\\.", "").split(" ");
                for (String word : words) {
                    if (!word.trim().equals("")) {
                        if (resultMap.containsKey(word)) {
                            Integer count = resultMap.get(word);
                            resultMap.put(word, ++count);
                        } else {
                            resultMap.put(word, 1);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultMap;
    }

    public static int totalWordCount(String path) throws IOException {
        // Читаем файл, подсчитываем общее количество слов
        Map<String, Integer> stringIntegerMap = wordMap(path);
        int count = 0;
        for (Integer value : stringIntegerMap.values()) {
            count += value;
        }
        return count;
    }

    public static int uniqueWordCount(String path) throws IOException {
        // Читаем файл, подсчитываем количество уникальных слов
        Map<String, Integer> stringIntegerMap = wordMap(path);
        int count = 0;
        for (Integer value : stringIntegerMap.values()) {
            if (value == 1) {
                count++;
            }
        }
        return count;
    }

    public static Map<String, Integer> topFrequentWords(String path, int n) throws IOException {
        // Читаем файл, находим топ-N часто встречающихся слов
        Map<String, Integer> wordMap = wordMap(path);
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(wordMap.entrySet());
        entries.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        Map<String, Integer> resultMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            Map.Entry<String, Integer> stringIntegerEntry = entries.get(i);
            resultMap.put(stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
        }
        return resultMap;
    }

    public static int countWordOccurrences(String path, String word) throws IOException {
        // Читаем файл, находим количество вхождений слова и возвращаем это число

        Map<String, Integer> stringIntegerMap = wordMap(path);
        if (!stringIntegerMap.containsKey(word)){
            return 0;
        }
        return stringIntegerMap.get(word);


//        Map<String, Integer> stringIntegerMap = wordMap(path);
//        int value = 0;
//        for (Map.Entry<String, Integer> stringIntegerEntry : stringIntegerMap.entrySet()) {
//            if (stringIntegerEntry.getKey().equals(word)) {
//                value = stringIntegerEntry.getValue();
//            }
//        }
//        return value;

    }
}
