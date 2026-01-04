import java.io.*;
import java.net.*;
import java.util.*;
public class Client {
public static void main(String[] args) {
try {
Socket s = new Socket("localhost", 5000);
System.out.println("Connected to Server");
Scanner sc = new Scanner(System.in);
PrintWriter out = new PrintWriter(s.getOutputStream(), true);
while (true) {
System.out.print("Enter msg: ");
String msg = sc.nextLine();
out.println(msg);
if (msg.equals("Over"))
break;
}
sc.close();
s.close();
} catch (Exception e) {
System.out.println(e);
}
}
}