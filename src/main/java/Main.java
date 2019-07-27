import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        InetAddress host = InetAddress.getLocalHost();
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
            Socket socket = serverSocket.accept();
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            String message = ois.readUTF();
            System.out.println("Message: " + message);
        }
    }
}
