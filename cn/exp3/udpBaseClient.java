import java.net.*;
import java.util.*;
public class udpBaseClient {
public static void main(String[] args) throws Exception {
DatagramSocket ds = new DatagramSocket();
InetAddress ip = InetAddress.getLocalHost();
Scanner sc = new Scanner(System.in);
while (true) {
System.out.print("Enter msg: ");
String msg = sc.nextLine();
byte[] buf = msg.getBytes();
DatagramPacket dp = new DatagramPacket(buf, buf.length, ip, 1234);
ds.send(dp);
if (msg.equals("bye"))
break;
}
ds.close();
sc.close();
}
}