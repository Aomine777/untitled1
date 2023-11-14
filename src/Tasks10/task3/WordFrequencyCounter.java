package Tasks10.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String filePath = "words.txt";
        Map<String, Integer> wordFrequency = countWordFrequency(filePath);

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordFrequency.entrySet());

        sortedList.sort(Map.Entry.<String,Integer>comparingByValue().reversed());

        for (Map.Entry<String,Integer> entry : sortedList){
            System.out.println(entry.getKey()+ ": " + entry.getValue());
        }
    }
    public static Map<String, Integer> countWordFrequency(String filePath){
        Map<String, Integer> wordFrequency = new HashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = br.readLine()) != null){
                String [] words = line.split("\\s");
                for(String word: words){
                    if(!word.isEmpty()){
                        wordFrequency.put(word,wordFrequency.getOrDefault(word,0) + 1);
                    }
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return wordFrequency;
    }
}
