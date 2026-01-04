import java.io.*;
import java.util.*;
public class arp_rarp {
public static void main(String[] args) throws Exception {
Process p = Runtime.getRuntime().exec("arp -a");
Scanner pIn = new Scanner(p.getInputStream());
FileWriter fw = new FileWriter("ARPTable.txt");
while (pIn.hasNextLine()) {
fw.write(pIn.nextLine() + "\n");
}
fw.close();
pIn.close();
Scanner sc = new Scanner(System.in);
System.out.print("Enter IP to find MAC: ");
String ip = sc.next();
searchFile("ARPTable.txt", ip);
System.out.print("Enter MAC to find IP: ");
String mac = sc.next();
searchFile("ARPTable.txt", mac);
sc.close();
}
static void searchFile(String file, String query) throws Exception {
Scanner fSc = new Scanner(new File(file));
boolean found = false;
while (fSc.hasNextLine()) {
String line = fSc.nextLine();
if (line.contains(query)) {
System.out.println("Found: " + line);
found = true;
}
}
if (!found)
System.out.println("Not Found");
fSc.close();
}
}