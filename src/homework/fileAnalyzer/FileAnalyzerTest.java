package homework.fileAnalyzer;


import java.io.IOException;
import java.util.Map;

public class FileAnalyzerTest {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\User\\IdeaProjects\\JavaCore\\src\\homework\\fileAnalyzer\\text.txt";
        Map<String, Integer> stringIntegerMap = FileAnalyzer.wordMap(path);
        for (Map.Entry<String, Integer> stringIntegerEntry : stringIntegerMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " -> " + stringIntegerEntry.getValue());
        }
        System.out.println("totalWordCount -> " + FileAnalyzer.totalWordCount(path));
        System.out.println(FileAnalyzer.uniqueWordCount(path));
        System.out.println(FileAnalyzer.topFrequentWords(path,5));
        System.out.println(FileAnalyzer.countWordOccurrences(path,"on"));
    }
}
