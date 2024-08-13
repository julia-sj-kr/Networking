import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        boolean running=true;
        Socket socket = new Socket("192.168.0.108",7777);
        OutputStream out=socket.getOutputStream();
        InputStream in=socket.getInputStream();
        PrintWriter writer=new PrintWriter(out, true);
        BufferedReader reader=new BufferedReader(new InputStreamReader(in));

        while (running){
            System.out.println(">> ");
            Scanner scanner=new Scanner(System.in);
            String strMsg=scanner.nextLine();
            writer.println(strMsg);
        }
    }
}
