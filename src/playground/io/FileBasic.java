package playground.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by aaron on 7/23/17.
 */
public class FileBasic {
    public static void main(String[] args) throws IOException {
        String pathname = "/Users/aaron/dummy.txt";
        File file = new File(pathname);
        if (!file.exists()) {
            System.out.println("Creating new file " + pathname);
            file.createNewFile();
        }
        System.out.println("File exists " + file.exists());
        System.out.println("File timestamp: " + new Date(file.lastModified()));
        System.out.println("File path " + file.getParent());
        System.out.println("Is directory " + file.isDirectory());
        System.out.println("Is hidden " + file.isHidden());
        System.out.println("File size " + file.length());
        if (file.isDirectory()) {
            for (String f : file.list()) {
                System.out.println(f);
            }
        }
    }
}
