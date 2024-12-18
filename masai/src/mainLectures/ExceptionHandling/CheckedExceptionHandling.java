package mainLectures.ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionHandling {
    public static void main(String[] args) {
        File myFile= new File("myFirstFileCreation.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
