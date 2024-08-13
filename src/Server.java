import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=null;
        boolean running=true;

        serverSocket = new ServerSocket(7777);
        System.out.println("서버가 준비되었습니다.");

        while (running){
            System.out.println("클라이언트 접속 요청을 기다립니다.");
            Socket socket=serverSocket.accept();
            System.out.println("클라이언트 요청을 받았습니다.");
            String addr=socket.getRemoteSocketAddress().toString();
            System.out.println("접속 요청:"+addr);

            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    BufferedReader reader=null;
                    PrintWriter writer=null;

                    try {
                        InputStream in=socket.getInputStream();
                        OutputStream out=socket.getOutputStream();

                        // 클라이언트로부터 데이터를 읽기 위한 BufferedReader
                        // (InputStream을 문자 스트림으로 변환하고 버퍼링을 통해 효율적으로 읽기 위함)
                        reader=new BufferedReader(new InputStreamReader(in));

                        // 클라이언트에게 데이터를 전송하기 위한 PrintWriter
                        // (OutputStream을 문자 스트림으로 변환하고 버퍼링을 통해 효율적으로 출력하기 위함)
                        writer=new PrintWriter(out,true);

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    //char[] buf=new char[1024];
                    String msg=null;
                    while (true){
                        try {
                            //reader.read(buf);
                            msg= reader.readLine();
                        } catch (IOException e) {
                            String addr=socket.getRemoteSocketAddress().toString();
                            System.out.println("접속 종료:"+addr);
                        }
                        writer.println(msg);
                        System.out.println(msg);
                    }
                }
            });
            thread.start();
        }
    }
}
