import java.rmi.*;
import java.util.*;
public class RMIClient {
public static void main(String[] args) {
try (Scanner sc = new Scanner(System.in)) {
System.out.print("Enter string: ");
String str = sc.next();
MyInterface stub = (MyInterface) Naming.lookup("rmiInterface");
System.out.println(stub.countInput(str));
} catch (Exception e) {
System.out.println(e);
}
}
}