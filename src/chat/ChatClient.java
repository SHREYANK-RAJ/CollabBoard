
package src.chat;

import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        new Thread(() -> {
            try {
                String serverMsg;
                while ((serverMsg = in.readLine()) != null) {
                    System.out.println("Server: " + serverMsg);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

        String userInput;
        while ((userInput = input.readLine()) != null) {
            out.println(userInput);
        }
    }
}
