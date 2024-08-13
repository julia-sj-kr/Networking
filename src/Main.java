import java.io.*;
import java.net.Socket;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //127.0.0.1은 로컬 호스트를 나타내는 특수한 IP 주소
        //모든 컴퓨터와 운영 체제에서 127.0.0.1은 동일하게 동작합니다. 이 주소는 항상 "자신의 컴퓨터"를 참조하기 때문에, 네트워크 연결 테스트나 개발 중에 유용하게 사용됩니다.
        try {
            Socket socket = new Socket("127.0.0.1",7777);
            //서버에게 데이터 전송
            OutputStream out= socket.getOutputStream();
            String message = "안녕하세요, 서버!";
            out.write(message.getBytes());
            out.flush();

            // 서버로부터 데이터 읽기
            InputStream in = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String response = reader.readLine();
            System.out.println("서버로부터 받은 응답: " + response);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}