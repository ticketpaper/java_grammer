package Spring;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

//8080웹서버 생성 spring 하기전 java로 만들기
public class WebServer1 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8081); //소켓 통신의 창구, 창구의 번호는 8081
            System.out.println("8081 서비스 시작");
            while (true){
//                꺼지지 않도록
                try(Socket accept = serverSocket.accept()) {
                    String httpRes = "HTTP/1.1 200 OK\r\n\r\n" + "Hello Spring";
                    accept.getOutputStream().write(httpRes.getBytes(StandardCharsets.UTF_8));
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}