package C17EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class C17_02Calendar {
    public static void main(String[] args) {
////        날짜 관련 클래스의 종류 : Calendar(java.util), java.time패키지 안에 있는 Local~ 클래스
//        Calendar time = Calendar.getInstance();
//        System.out.println(time.getTime());
//
////        특정한 숫자값은 get함수의 input값으로 주어 원하는 날짜 정보를 출력할 수 있게 해준다.
//        System.out.println(time.get(Calendar.YEAR));
//        System.out.println(time.get(Calendar.MONTH)+1);
//        System.out.println(time.get(Calendar.DAY_OF_MONTH));
//        System.out.println(time.get(Calendar.DAY_OF_WEEK));
//        System.out.println(time.get(Calendar.HOUR_OF_DAY));
//        System.out.println(time.get(Calendar.MINUTE));
//        System.out.println(time.get(Calendar.SECOND));

////        java.time패키지 : Local~ 클래스
//        LocalTime now_time = LocalTime.now();
//        System.out.println(now_time);
//
//        LocalDate now_date = LocalDate.now();
//        System.out.println(now_date);
//
//        LocalDateTime now_dateTime = LocalDateTime.now();
//        System.out.println(now_dateTime);

//        임의로 특정시간을 만들어 내고 싶을떄 : of 메서드 사용
        LocalDate birthDay = LocalDate.of(1999, 4, 12);
        System.out.println(birthDay.getYear());
        System.out.println(birthDay.getMonth());
        System.out.println(birthDay.getDayOfMonth());
        LocalTime birthTime = LocalTime.of(14, 30);
        LocalDateTime birthDayTime = LocalDateTime.of(birthDay, birthTime);

//        크로노필드 enum 타입 사용 : 매개변수로 크르노필드를 받아 프로그램 유연성 향상
        System.out.println(birthDayTime.get(ChronoField.YEAR));
        System.out.println(birthDayTime.get(ChronoField.MONTH_OF_YEAR));
//        0 : 오전 1 : 오후
        System.out.println(birthDayTime.get(ChronoField.AMPM_OF_DAY));

        LocalDateTime now = LocalDateTime.now();
        System.out.println((now.get(ChronoField.AMPM_OF_DAY) == 0) ? "현재시간은 오전 입니다." : "현재시간은 오후 입니다.");


    }
}
