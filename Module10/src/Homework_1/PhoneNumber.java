package Homework_1;

import java.io.*;
import java.util.Scanner;


public class PhoneNumber {

    public String phoneFilter(String pathFile) throws IOException {
        File file = new File(pathFile);
        String numb = "";

        InputStream fis = new FileInputStream(file);
        Scanner scanner = new Scanner(fis);

        while (scanner.hasNext()) {
            numb = scanner.nextLine();
            if (numb.matches("^[1-9]\\d{2}-\\d{3}-\\d{4}") ||
                    numb.matches("^\\(\\d{3}\\)\\s\\d{3}-\\d{4}")) {
                System.out.println(numb);
            }

        }
        fis.close();
        scanner.close();
        return numb;

    }
}

//    public static void main(String[] args) throws IOException {
//       File file = new File("file/file.txt");
//       String numb = "";
//
//           InputStream fis = new FileInputStream(file);
//           Scanner scanner = new Scanner(fis);
//
//           while(scanner.hasNext()){
//              numb = scanner.nextLine();
//               if(numb.matches("^[1-9]\\d{2}-\\d{3}-\\d{4}") ||
//                                numb.matches("^\\(\\d{3}\\)\\s\\d{3}-\\d{4}")){
//                   System.out.println(numb);
//               }
//
//           }
//           fis.close();
//           scanner.close();
//       }
//    }

