package FileUtils;

import java.io.File;
import java.util.Scanner;

public class FileValidation {

    public void isFileValid(String filepath){
        File file = new File(filepath);
        Scanner keyboard = new Scanner(System.in);


        if (file.exists() && file.isFile()) {
            FileUtil.readFromFile(filepath);
        } else if (filepath.equalsIgnoreCase("q")){
            System.out.println("Have a nice day!");
        } else {
            do {
                System.out.println("Please enter valid file path and press Enter: ");
                filepath = keyboard.next();
                file = new File(filepath);
            }while (!(file.exists() && file.isFile()));
            FileUtil.readFromFile(filepath);
        }
    }
}
