package Spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class WebServer3 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8081); //소켓 통신의 창구, 창구의 번호는 8081
            System.out.println("8081 서비스 시작");

//
            while (true){
//                Socket의 객체는 사용자의 client객체
                try(Socket socket = serverSocket.accept()) {
                    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    StringBuilder sb = new StringBuilder();
                    String line ;
//                    readLine
                    while (!(line = br.readLine()).isBlank()) { // 공백으로 헤더 바디 구분
                        sb.append(line + "\n");
                    }
                    if (sb.toString().contains("POST")) {
                        char[] buffer = new char[1024];
                        br.read(buffer);
                        System.out.println("POST body data : " + new String(buffer));
                        System.out.println("POST all data : " + sb);
                    }
                    String httpRes = "HTTP/1.1 200 OK\r\n\r\n" + "ok";
                    socket.getOutputStream().write(httpRes.getBytes(StandardCharsets.UTF_8));
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}