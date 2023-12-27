package C18ExcetionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class C18_04JsonWithJacksonRaw {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
////            readTree를 통해서 json을 게층적 트리구조 형태로 변환
//            File myPath = Paths.get("src/C18ExcetionFileParsing/test-data1.json").toFile();
//            JsonNode data1 = mapper.readTree(myPath);
//            Map<String, String> studentMap = new HashMap<>();
//            studentMap.put("id", data1.get("id").asText());
//            studentMap.put("name", data1.get("name").asText());
//            studentMap.put("classNumber", data1.get("classNumber").asText());
//            studentMap.put("city", data1.get("city").asText());
//            System.out.println(studentMap);

////            key:value중에 vlaue의 타입이 예상되지 않을떄는 Object타입으로 받기 가능하다.
////            Map<String, Object> studentMap2 = mapper.readValue(myPath, Map.class);
//            Map<String, String> studentMap2 = mapper.readValue(myPath, Map.class);
//            System.out.println(studentMap2);

            File myPath2 = Paths.get("src/C18ExcetionFileParsing/text_file2.json").toFile();
            JsonNode data2 = mapper.readTree(myPath2).get("students");
            List<Students> studentList = new ArrayList<>();
            for (JsonNode s : data2) {
                Students student = mapper.readValue(s.toString(), Students.class);
                studentList.add(student);
            }
            System.out.println(studentList);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class Students {
    Students() {}

    int id;
    String name;
    int classNumber;
    String city;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classNumber=" + classNumber +
                ", city='" + city + '\'' +
                '}';
    }
}
