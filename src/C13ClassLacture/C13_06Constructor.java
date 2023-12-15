package C13ClassLacture;

public class C13_06Constructor {
    public static void main(String[] args) {
        Calender c1 = new Calender("1999", "4", "12");
        Calender c2 = new Calender("1999", "4");
        Calender c3 = new Calender("2024");

    }
}

//    내부클래스 : Calender
//    인스턴스변수 : year, month, day -> String
//    1) 생성자1 : year, month, day 를 초기화 하는
//    2) 생성자2 : year, month 를 초기화 하는
//    3) 생성자3 : 초기화 없음
class Calender {
    String year;
    String month;
    String day;

    Calender(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
//    메서드 오버로딩을 통해 같은 이름의 생성자 생성가능
    Calender(String year, String month) {
        this.year = year;
        this.month = month;
    }

    Calender(String year) {
//        this() 키워드를 통해 클래스내 매개변수에 맞는 생성자 호출 가능
        this(year, null, null);
    }
}
