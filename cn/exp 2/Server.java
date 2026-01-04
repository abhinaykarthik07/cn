import java.net.*;
import java.util.*;
public class Server {
public static void main(String[] args) {
try {
ServerSocket ss = new ServerSocket(5000);
System.out.println("Server Waiting...");
Socket s = ss.accept();
Scanner in = new Scanner(s.getInputStream());
while (true) {
String msg = in.nextLine();
if (msg.equals("Over"))
break;
System.out.println("Client: " + msg);
}
s.close();
in.close();
ss.close();
} catch (Exception e) {
System.out.println(e);
}
}
}