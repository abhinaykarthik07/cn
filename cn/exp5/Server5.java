import java.io.*;
import java.net.*;
import java.util.*;
public class Server5 {
public static void main(String[] args) throws Exception {
ServerSocket ss = new ServerSocket(3000);
System.out.println("Server Ready...");
Socket s = ss.accept();
Scanner in = new Scanner(s.getInputStream());
PrintWriter out = new PrintWriter(s.getOutputStream(), true);
while (true) {
String op = in.nextLine();
int a = Integer.parseInt(in.nextLine());
int b = Integer.parseInt(in.nextLine());
int res = 0;
if (op.equals("add"))
res = a + b;
else if (op.equals("sub"))
res = a - b;
else if (op.equals("mul"))
res = a * b;
else if (op.equals("div"))
res = a / b;
else if (op.equals("exit"))
break;
out.println("Result: " + res);
}
s.close();
in.close();
ss.close();
}
}