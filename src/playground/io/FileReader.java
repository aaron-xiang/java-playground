package playground.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by aaron on 7/23/17.
 */
public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/aaron/dummy.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
