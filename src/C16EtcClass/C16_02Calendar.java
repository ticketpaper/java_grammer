package C16EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class C16_02Calendar {
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

//        java.time패키지 : Local~ 클래스
        LocalTime now_time = LocalTime.now();
        System.out.println(now_time);

        LocalDate now_date = LocalDate.now();
        System.out.println(now_date);

        LocalDateTime now_dateTime = LocalDateTime.now();
        System.out.println(now_dateTime);

    }
}
