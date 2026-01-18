import java.net.*;

public class MulticastClient {
    public static void main(String[] args) throws Exception {
System.out.println("\nDhunuku Manoj - 231061101256");


        InetAddress group = InetAddress.getByName("230.0.0.0");
        int port = 4446;

        MulticastSocket socket = new MulticastSocket(port);

        NetworkInterface ni = NetworkInterface.getByInetAddress(
                InetAddress.getLocalHost());

        InetSocketAddress groupAddr =
                new InetSocketAddress(group, port);

        socket.joinGroup(groupAddr, ni);

        byte[] buffer = new byte[256];
        DatagramPacket packet =
                new DatagramPacket(buffer, buffer.length);

        socket.receive(packet);

        String msg = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Received message: " + msg);

        socket.leaveGroup(groupAddr, ni);
        socket.close();
    }
}
