import FileUtils.FileUtil;
import FileUtils.FileValidation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        FileUtil fileUtil = new FileUtil();
        FileValidation validation = new FileValidation();

        System.out.println("Please enter file path and press Enter or q to exit: ");
        String filepath = keyboard.next();

        validation.isFileValid(filepath);
    }
}
