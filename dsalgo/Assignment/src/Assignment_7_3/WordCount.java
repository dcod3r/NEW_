package Assignment_7_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    
    public static void main(String[] args) {
        // Replace the filename with your file path
        String filename = "sample.txt"; 
        
        // Count word occurrences
        Map<String, Integer> wordCounts = countWordsInFile(filename);
        
        // Print word occurrences
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
    public static Map<String, Integer> countWordsInFile(String filename) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");  // Split on non-word characters
                for (String word : words) {
                    if (word.isEmpty()) continue;
                    word = word.toLowerCase();  // Convert to lowercase to count "Word" and "word" as the same
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
        
        return wordCountMap;
    }
}
