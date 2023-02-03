package Homework;

import java.io.IOException;

public class WTest {

    public static void main(String[] args) throws IOException {

        System.out.println("-----Homework-1-----");

        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.phoneFilter("file/file.txt");

        System.out.println("-----Homework-2-----");

        MyJSON myJson = new MyJSON();
        System.out.println(myJson.saveJson("file/fiile.txt","file/user.json" ));

        System.out.println("-----Homework-3-----");

        WordCount wordCount = new WordCount();
        wordCount.wordCount("file/words.txt");



    }
}