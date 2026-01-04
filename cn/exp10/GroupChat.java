import java.net.*;
import java.util.*;
public class GroupChat {
public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Name: ");
String name = sc.nextLine();
InetAddress group = InetAddress.getByName("230.0.0.1");
MulticastSocket ms = new MulticastSocket(4446);
ms.joinGroup(new InetSocketAddress(group, 4446), null);
new Thread(() -> {
try {
byte[] buf = new byte[1024];
while (true) {
DatagramPacket dp = new DatagramPacket(buf, buf.length);
ms.receive(dp);
String msg = new String(dp.getData(), 0, dp.getLength());
if (!msg.startsWith(name))
System.out.println(msg);
}
} catch (Exception e) {
}
}).start();
while (true) {
String msg = sc.nextLine();
if (msg.equals("exit"))
break;
msg = name + ": " + msg;
byte[] buf = msg.getBytes();
DatagramPacket dp = new DatagramPacket(buf, buf.length, group, 4446);
ms.send(dp);
}
ms.leaveGroup(new InetSocketAddress(group, 4446), null);
ms.close();
sc.close();
}
}