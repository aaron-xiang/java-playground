package playground.network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by aaron on 4/1/17.
 */
public class EchoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9090);
        Socket socket = server.accept();
        if (socket != null) {
            System.out.println(socket.getRemoteSocketAddress());
        }
        Scanner scanner = new Scanner(socket.getInputStream());
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals("")) {
                socket.close();
            }
            else {
                PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
                System.out.println(line);
                output.println(line);
            }
        }
    }
}
