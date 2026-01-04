import java.io.*;
import java.net.*;
import java.util.*;
public class Main {
public static void main(String[] args) {
try {
System.out.println("Downloading...");
URL url = new URL("https://www.google.com");
Scanner in = new Scanner(url.openStream());
FileWriter fw = new FileWriter("Data.html");
while (in.hasNextLine()) {
fw.write(in.nextLine() + "\n");
}
System.out.println("Success. Saved to Data.html");
fw.close();
in.close();
} catch (Exception e) {
System.out.println(e);
}
}
}