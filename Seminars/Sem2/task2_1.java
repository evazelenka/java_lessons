package Seminars.Sem2;
// Напишите метод, который вернет содержимое текущей папки
// в виде массива строк.

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class task2_1 {
    public static void main(String[] args) {
        readFileNames("C:\\ZELENKA\\test");
    }

    public static void readFileNames(String path) {
        FileReader reader = null;
        try {
            File file = new File(path);
            reader = new FileReader(file);
            if (file.isDirectory()){
                File[] arrayFiles = file.listFiles();
                for ( File elem: arrayFiles){
                    System.out.println(elem.getName());
                }
            }
            else{
                throw new IOException("File is not a directory");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    
}
