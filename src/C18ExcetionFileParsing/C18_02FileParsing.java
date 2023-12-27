package C18ExcetionFileParsing;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class C18_02FileParsing {
    public static void main(String[] args) throws IOException {
//        text파일 parsing
//        src/C18ExcetionFileParsing
        Path filePath = Paths.get("src/C18ExcetionFileParsing/text_file.txt");
//        버퍼기능이 구현돼있고, nio패키지에서는 non-blocking방식 사용
        try {
            if (Files.exists(filePath)) {
                Files.write(filePath, "손흥민\n".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
            } else {
                Files.write(filePath, "".getBytes(), StandardOpenOption.CREATE_NEW);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        파일읽기 : readString, readAllLines(List형태)
        try {
            String mySt = Files.readString(filePath);
            System.out.println(mySt);
            List<String> arr = Files.readAllLines(filePath);
            for (String s : arr) {
                System.out.println(s+" 선수");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
