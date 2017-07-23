package playground.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by henry on 7/23/17.
 */
public class FileWriter {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("/Users/henry/dummy.txt");
        Scanner scanner = new Scanner(file);
        StringBuffer content = new StringBuffer();
        while (scanner.hasNextLine()) {
            content.append(scanner.nextLine() + "\n");
        }
        content
            .append("something new\n")
            .append("something more ...\n");
        scanner.close();

        PrintWriter writer = new PrintWriter(file);
        writer.print(content.toString());
        writer.close();
    }
}
