package C17EtcClass;

public class C17_01Math {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            // 0.0 부터 1.0미만의 임의 double형을 반환
//            double random = Math.random()*100;
//            System.out.println((int)random);
//        }

////        abs() 메소드 : 절대값 반환
//        System.out.println(Math.abs(-4));

////        floor() : 소수점내림, ceil() : 소수점올림, round() : 소수점반올림
//        System.out.println(Math.floor(5.7));
//        System.out.println(Math.ceil(5.7));
//        System.out.println(Math.round(5.7));

////        max, min
//        System.out.println(Math.max(6, 8));
//        System.out.println(Math.min(6, 8));

//        pow(a,b) : 제곱 연산 수행 : a^b
        System.out.println(Math.pow(5, 2));

//        sqrt() : 제곱근 연산 수행
        System.out.println(Math.sqrt(25));

//        1~n까지의 소수 구하기
        int n = 100;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("소수가 아님");
                break;
            }
        }
    }
}
