import java.io.*;
import java.net.*;

public class RMIServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(7000);
            System.out.println("Server Started... Waiting for client...");

            Socket s = ss.accept();
            System.out.println("Client connected");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));
            PrintWriter pw = new PrintWriter(s.getOutputStream(), true);

            String input = br.readLine();
            System.out.println("Received from client: " + input);

            pw.println("You have typed " + input.length() + " letters!!");

            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
