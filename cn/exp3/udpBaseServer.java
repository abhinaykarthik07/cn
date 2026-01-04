import java.net.*;
public class udpBaseServer {
public static void main(String[] args) throws Exception {
DatagramSocket ds = new DatagramSocket(1234);
byte[] buf = new byte[1024];
System.out.println("UDP Server Ready...");
while (true) {
DatagramPacket dp = new DatagramPacket(buf, buf.length);
ds.receive(dp);
String msg = new String(dp.getData(), 0, dp.getLength());
System.out.println("Client: " + msg);
if (msg.equals("bye"))
break;
}
ds.close();
}
}