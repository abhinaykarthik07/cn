import java.io.*;
import java.net.*;
import java.util.*;
public class Client5 {
public static void main(String[] args) throws Exception {
Socket s = new Socket("localhost", 3000);
Scanner sc = new Scanner(System.in);
Scanner in = new Scanner(s.getInputStream());
PrintWriter out = new PrintWriter(s.getOutputStream(), true);
while (true) {
System.out.print("Enter op (add, sub, mul, div) or exit: ");
String op = sc.next();
out.println(op);
if (op.equals("exit"))
break;
System.out.print("Enter two numbers: ");
int a = sc.nextInt();
int b = sc.nextInt();
out.println(a);
out.println(b);
System.out.println(in.nextLine());
}
s.close();
in.close();
sc.close();
}
}