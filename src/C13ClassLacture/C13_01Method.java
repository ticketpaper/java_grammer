package C13ClassLacture;

public class C13_01Method {
    public static void main(String[] args) {

////        for문을 이용하여 1~10까지 total값 출력
//        int total1 = 0;
//        for (int i = 1; i <= 10; i++) {
//            total1 += i;
//        }
//        System.out.println(total1);
//
////        for문을 이용하여 10~20까지 total값 출력
//        int total2 = 0;
//        for (int i = 10; i <= 20; i++) {
//            total2 += i;
//        }
//        System.out.println(total2);

//        코드의 중복이 발생, 코드의 반복을 피하기위해 기능집합을 별도로 분리
        System.out.println(sum_acc(100, 200));

//        같은 클래스내의 메서드들 사이에서의 호출은 static 메서드라 할지라도 클래스명 생략가능
        System.out.println(C13_01Method.sum_acc(1,10));

//        메서드 구성요소 : 매개변수, 반환타입, 접근제어, 클래스 메서드 여부(static)
    }

//    void : 리턴 타입 없음
//    int, String 등 리턴타입 명시
    public static int sum_acc(int start, int end) {
        int total = 0;
        for (int i = start; i <= end; i++) {
            total += i;
        }
        return total; // total 값을 return
    }
}

