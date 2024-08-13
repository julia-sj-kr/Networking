import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        boolean running=true;
        Socket socket = new Socket("192.168.0.108",7777);
        //Socket socket = new Socket("127.0.0.1",7777);
        OutputStream out=socket.getOutputStream();
        InputStream in=socket.getInputStream();
        PrintWriter writer=new PrintWriter(out, true);
        BufferedReader reader=new BufferedReader(new InputStreamReader(in));

        boolean threadRunning=true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(threadRunning) {
                    String strMsg2 = null;
                    try {
                        strMsg2 = reader.readLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(strMsg2);
                }
            }
        }).start();

        while (running){
            System.out.println(">> ");//사용자 입력
            Scanner scanner=new Scanner(System.in);
            String strMsg=scanner.nextLine();
            writer.println(strMsg);
            //String strMsg2 = reader.readLine();//통신입력
            //System.out.println(strMsg2);

        }
    }
}
