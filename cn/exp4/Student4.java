import java.io.*;
import java.net.*;
public class Student4 {
public static void main(String[] args) throws Exception {
Socket s = new Socket("localhost", 7777);
System.out.println("Connected. Receiving file...");
InputStream in = s.getInputStream();
FileOutputStream fout = new FileOutputStream("received.txt");
int ch;
while ((ch = in.read()) != -1) {
fout.write(ch);
}
System.out.println("File Received as 'received.txt'.");
fout.close();
in.close();
s.close();
}
}