package C17EtcClass;

public class C17_05EnumMain {
    public static void main(String[] args) {
        EnumStudent s1 = new EnumStudent();
        s1.setName("존 시나");
        s1.setClassGrade(classGrade.c1);

        EnumStudent s2 = new EnumStudent();
        s2.setName("언더테이커");
//        타입이 여전히 String 타입이므로, 클래스 변수를 사용하지 안
        s2.setClassGrade("first");
//        Enum타입 사용시에는 static final변수와 동일한 방법으로 사용
        s2.setRole(Role.GENERAL_USER);
        System.out.println(s2.getRole());

        System.out.println(s2.getRole().ordinal());

    }
}

// 각 열거형 상수는 콤마로 구분하고,
enum Role {
    GENERAL_USER, ADMIN_USER, SUPER_USER;
}
class classGrade {
    static final String c1 = "first Grade";
    static final String c2 = "Second Grade";
    static final String c3 = "Third Grade";
}


class EnumStudent {
    private String name;
    private String classGrade;

    //    String 타입이아닌 Role타입을 신규로 지정
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getClassGrade() {
        return classGrade;
    }

    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

