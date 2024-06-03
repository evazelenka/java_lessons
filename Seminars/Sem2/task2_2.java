package Seminars.Sem2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task2_2 {
    private static Logger LOGGER = Log.log(task2_2.class.getName());
    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "started");
        String out = "C:\\test";
        System.out.println(Arrays.toString(readFileNamesInDir("C:\\test")));
        writeFileNamesInFile("firstTest.txt", out);
    }

    private static void writeFileNamesInFile(String in, String out){
        FileWriter fw  = null;
        try{
            fw = new FileWriter(in);
            if(isThrow()){
                    LOGGER.log(Level.SEVERE, "writer error");
            }
            String[] arr = readFileNamesInDir(out);
            for (int i = 0; i < arr.length; i++) {
                fw.write(arr[i] + "\n");
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }finally{
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException("error closing file");
            }

        }

    }
    private static boolean isThrow() {
        int a = 0;
        int b = 2;
        int digit = a + (int) (Math.random() * b);
        System.out.println(digit);
        return digit > 0;
        }
    private static String[] readFileNamesInDir(String path) {
        File file = new File(path);
        if(file.isDirectory()){
            if(isThrow()){
                LOGGER.log(Level.SEVERE, "reader error");
            }
            File[] files = file.listFiles();
            String[] names = new String[files.length];
            for (int i = 0; i < files.length; i++) {
                names[i] = files[i].getName();
            }
            return names;
        }
        else{
            throw new RuntimeException("file is not a directory");
        }
        
    }
}
