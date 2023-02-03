package Homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {

    public static String readFile(String fileRead) throws IOException {
        File file = new File(fileRead);
        InputStream fis = new FileInputStream(file);
        Scanner scanner = new Scanner(fis);

        String numb = "";

        while (scanner.hasNext()) {
            numb = scanner.nextLine();

            numb = numb + " " + scanner.nextLine();
        }
        fis.close();
        scanner.close();
        return numb;
    }

    public void wordCount(String fileRead) throws IOException {
        String[] str = readFile(fileRead).split(" ");
        Map<String, Integer> mapWords = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            String word = str[i];
            if (mapWords.containsKey(word)) {
                int o = mapWords.get(word);
                mapWords.put(word, o + 1);
            } else {
                mapWords.put(word, 1);
            }
        }

        mapWords.forEach((k, v) -> System.out.println(k + " " + v));
    }

}