package playground.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by henry on 7/23/17.
 */
public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/User/henry/dummy.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }

}
