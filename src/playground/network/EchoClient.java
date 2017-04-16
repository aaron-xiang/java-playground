package playground.network;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by aaron on 4/1/17.
 */
public class EchoClient {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Socket socket = new Socket("127.0.0.1", 9090);
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
        InputStreamReader response = new InputStreamReader(socket.getInputStream());
        int data;
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            output.println(line);
//            output.flush();
            while((data = response.read()) != -1) {
                System.out.print(data);
            }
        }
    }
}
