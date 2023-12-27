package C18ExcetionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class C18_03JsonWithJacksonClass {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
//            readTree를 통해서 json을 게층적 트리구조 형태로 변환
            JsonNode data1 = mapper.readTree(Paths.get("src/C18ExcetionFileParsing/test-data1.json").toFile());
            Map<String, String> studentMap = new HashMap<>();
            studentMap.put("id", data1.get("id").asText());
            studentMap.put("name", data1.get("name").asText());
            studentMap.put("classNumber", data1.get("classNumber").asText());
            studentMap.put("city", data1.get("city").asText());
            System.out.println(studentMap);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
