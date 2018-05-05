package FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileUtil {

    static void readFromFile(String filename) {

        Scanner keyboard = new Scanner(System.in);

        try (Stream<String> stream = Files.lines(Paths.get(filename))) {

            System.out.println("Please enter word to search in file: ");
            String word = keyboard.next();

            Stream<String> containWorld = stream.filter(s -> s.contains(word));
            containWorld.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
