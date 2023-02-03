package Homework;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MyJSON{

static class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "MyJSON{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
//    private static String pathFileReader;
//    private static String pathFileWriter;
//
//    public  void setPathFileWriter(String pathFileWriter) {
//        this.pathFileWriter = pathFileWriter;
//
//    }
//
//    public void setPathFileReader(String pathFile) {
//        this.pathFileReader = pathFile;
//
//    }

    public static Object readerFile( String pathFileReader) throws IOException {
        File file = new File(pathFileReader);
        InputStream fis = new FileInputStream(file);
        Scanner scanner = new Scanner(fis);
        User user;
        ArrayList list = new ArrayList<>();
        int count = 0;

        while (scanner.hasNext()) {
            count++;
            String[] str = scanner.nextLine().split(" ");
            if (count > 1) {
                list.add(user = new User(str[0], Integer.valueOf(str[1])));
            }
        }
        fis.close();
        scanner.close();
        return list;
    }
    public  String saveJson(String pathFileReader, String pathFileWriter)  {
            String jsonString = "";
        try (PrintWriter out = new PrintWriter(new FileWriter(pathFileWriter))) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            jsonString = gson.toJson(readerFile(pathFileReader));
            out.write(jsonString);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  jsonString;
    }

}










