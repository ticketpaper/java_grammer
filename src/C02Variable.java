import java.math.BigDecimal;

public class C02Variable {
    public static void main(String[] args) {
//        byte -128 ~ 127까지 표현 가능하다. 그 이상 세팅할때 오버/언더 플로우 발생
        byte num1 = 127, num2 = -128;
        num1++;
        num2--;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

//        실수 : float, double(기본)
        float f1 =  1.12345567879f;
        double d1 = 1.12345678990d;

        System.out.println("f1 = " + f1);
        System.out.println("d1 = " + d1);


//        부동소수점 오차 테스트
        double num = 0.1;
//        미세오차는 조정되어 정상적으로 출력
        System.out.println(num);
//        반복적인 연산시 오차가 확대되어 오차확인 가능
        double temp = 0;
        for(int i=0; i<1000; i++){
//            temp += 0.1;
            temp += 10 * 0.1;

        }
//        System.out.println("temp = " + temp);
        System.out.println("temp = " + temp/10);


        double num_d1 = 1.03;
        double num_d2 = 0.42;
        System.out.println("num_d1 - num_d2 = " + (num_d1 - num_d2));

//        문자열로 저장하는 이유는 실수형 오차 떄문
//        저장 : 문자열 저장 -> 계산 : 정수 변환 -> 반환 : 실수 반환
        BigDecimal bd1 = new BigDecimal("1.03");
        BigDecimal bd2 = new BigDecimal("0.42");
        double result = bd1.subtract(bd2).doubleValue();
        System.out.println("result = " + result);
        System.out.println("bd1.subtract(bd2) = " + bd1.subtract(bd2));

//        문자형 : char
        char my_char = '가';
        System.out.println("my_char = " + my_char);

//        boolean : true(1), false(0)
//        기본값 : false
        boolean my_bool = true;
        System.out.println("my_bool = " + my_bool);

        int bool_n1 = 20;
        int bool_n2 = 10;

        if(bool_n1 > bool_n2) System.out.println("조건식이 참입니다.");

//        묵시적 타입 변환
        char ch1= 'a';
//        char -> int
        int ch1_num = ch1;
        System.out.println("'a' to int : " + ch1_num);

//        char형 알파벳을 비교하면 묵시적 타입 변환을 함
        System.out.println('A'>'a');

//        int -> double
        int my_int1 = 10;
        double my_double1 = my_int1;
        System.out.println("10 to double : " + my_double1);
//      에러 발생 :  my_int1 = my_double1;
//      double -> int  명시적 타입은 가능 : 소수점값 손실발생
        my_int1 = (int) my_double1;

        double my_double2 = 7.2f;
//        double -> float
        System.out.println("7.2F to double : " + my_double2);

//      명시적 타입변환
        char my_char2 = 'b';
        int char_num = (int)my_char2;

//        int a가 1 int b가 4일때 둘을 나눈값을 int c에 담아 출력. double d에 담아 출력
        int a = 1, b = 4, c= a/b;
        double d = a/b;
        System.out.println(c);
        System.out.println(d);
        double d2 = a/(double)b;
        System.out.println(d2);

//        변수와 상수
//        선언과 동시에 초기화
        int a1 = 10;
//        변수값 변경 가능
        a1 = 20;
//        선언만 하고 나중에 초기화
        int a2; // 선언만 됐을떄 초기값은 0;
        a2 = 30;
//        상수는 값의 재할당이 불가능
        final int AGES = 20;
//        AGES = 1000; 에러 발생
//        상수는 선언만 한 뒤에 나중에 초기화 하는 방식이 java8 이전은 안됐으나, 이후 가능해짐
        final int AGES2 ;
        AGES2 = 1000;


    }
}
