import java.io.*;
import java.net.*;

public class RMIClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 7000);

            BufferedReader brKeyboard =
                    new BufferedReader(new InputStreamReader(System.in));

            BufferedReader brServer =
                    new BufferedReader(new InputStreamReader(s.getInputStream()));

            PrintWriter pw =
                    new PrintWriter(s.getOutputStream(), true);

            System.out.println("Type something:");
            String input = brKeyboard.readLine();

            pw.println(input);

            String reply = brServer.readLine();
            System.out.println("Server says: " + reply);

            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
