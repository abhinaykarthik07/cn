import java.io.*;
public class Rs232c {
public static void main(String[] args) {
try {
FileOutputStream out = new FileOutputStream("COM1_simulated.txt");
String data = "Hello Serial Port";
out.write(data.getBytes());
out.close();
System.out.println("Data sent to COM1.");
FileInputStream in = new FileInputStream("COM1_simulated.txt");
int ch;
System.out.print("Received: ");
while ((ch = in.read()) != -1) {
System.out.print((char) ch);
}
in.close();
} catch (Exception e) {
System.out.println(e);
}
}
}