import java.net.*;
import java.io.*;

public class MulticastServer {
    public static void main(String[] args) throws IOException {
System.out.println("\nDhunuku Manoj - 231061101256");


        InetAddress group = InetAddress.getByName("230.0.0.0");
        int port = 4446;

        MulticastSocket socket = new MulticastSocket();

        String message = "Hello Clients! This is a multicast message.";
        DatagramPacket packet =
                new DatagramPacket(message.getBytes(),
                        message.length(), group, port);

        socket.send(packet);
        System.out.println("Message sent to multicast group.");

        socket.close();
    }
}
