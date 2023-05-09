import java.io.IOException;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        System.out.println("Port 12345 is open for connection...");
        try {
            ServerSocket serverSocket =new ServerSocket(12345);
            serverSocket.accept();
            System.out.println("A new client connected");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}