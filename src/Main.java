import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(7777);
            System.out.println("서버가 준비되었습니다.");

            Socket clientSocket=serverSocket.accept();
            System.out.println("클라이언트 요청을 받았습니다.");

            //클라이언트로부터 데이터 읽기
            InputStream in=clientSocket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String receivedMessage = reader.readLine();
            System.out.println("클라이언트로부터 받은 메시지: " + receivedMessage);

            // 클라이언트에게 데이터 전송
            OutputStream out = clientSocket.getOutputStream();
            String responseMessage = "안녕하세요, 클라이언트!";
            out.write(responseMessage.getBytes());
            out.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
