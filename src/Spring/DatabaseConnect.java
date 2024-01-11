package Spring;

import java.sql.*;

public class DatabaseConnect {
    public static void main(String[] args) {
//        db의 url : localhost:3306 필요
        String url = "jdbc:mysql://localhost:3306/ott";
        String userName = "root";
        String pw = "1234";

        try {
            Connection conn = DriverManager.getConnection(url, userName, pw);
            System.out.println("DB 커넥션 성공");
//            Statement : 쿼리를 담아 DB에 보낼수 있는 객체이다.
            Statement st = conn.createStatement();
            String myQuery = "select * from actor";
            ResultSet resultSet = st.executeQuery(myQuery);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("actor");
                String info = resultSet.getString("info");
                System.out.println("id:" + id + " 이름은 " + name + " 소속은 " + info);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
