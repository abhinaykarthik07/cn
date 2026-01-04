import java.io.*;
import java.net.*;
public class Cyber4 {
public static void main(String[] args) throws Exception {
ServerSocket ss = new ServerSocket(7777);
System.out.println("Waiting for client...");
Socket s = ss.accept();
FileInputStream fin = new FileInputStream("send.txt");
OutputStream out = s.getOutputStream();
int ch;
while ((ch = fin.read()) != -1) {
out.write(ch);
}
System.out.println("File Sent.");
fin.close();
out.close();
s.close();
ss.close();
}
}