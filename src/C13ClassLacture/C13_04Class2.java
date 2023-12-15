package C13ClassLacture;

import java.util.regex.Pattern;

public class C13_04Class2 {
    public static void main(String[] args) {
        person per_1 = new person();
//        변수값에 직접 접근하여 값을 할당하는 방식
//        per_1.name = "가나다";
//        per_1.email = "ganada@naver.com";
//        per_1.age = 25;
//        per_1.whoIs();
        per_1.setName("동해물과백두산이마르고닳도록");
        per_1.setEmail("!!!#c.co");
        per_1.setAge(19);
        System.out.println(per_1.getName() + " " + per_1.getEmail() + " " + per_1.getAge());

        person per_2 = new person();
        per_2.setName("존 시나");
        per_2.setEmail("john@naver.com");
        per_2.setAge(25);
        System.out.println(per_2.getName() + " " + per_2.getEmail() + " " + per_2.getAge());

    }
}

//    person 클래스를 만들고
//    객체 변수 : name, email, age
//    객체 메서드 whoIs() : name, email, age 입니다 -> 출력
class person {
    private String name;
    private String email;
    private int age;


    // setter, getter 패턴
//    age 20세 미만 세팅 x
//    email @가없으면 세팅 x
//    name 10글자 초과 세팅 안되도록
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.length() < 10) {
            this.name = name;
        } else {
            System.out.println("이름이 너무 깁니다");
        }
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (Pattern.matches("^[a-z0-9]+@[a-z]+.com$", email)) {
            this.email = email;
        } else {
            System.out.println("올바른 이메일이 아닙니다.");
        }
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 20) {
            this.age = age;
        } else {
            System.out.println("20세 이상만 가능");
        }
    }
//    public void whoIs() {
//        System.out.printf("이름은 %s 이메일은 %s 나이는 %d 입니다.\n"
//                ,this.name,this.email,this.age);
//    }
}
