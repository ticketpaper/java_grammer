package C13ClassLacture;
public class C13_03Class {
    public static void main(String[] args) {
//        System.out.println(MyCalculator.sum(1, 3));
//        MyCalculator.sum_acc(10);
//        MyCalculator.sum_acc(20);
//
////        A부서
//        MyCalculator.sum_acc(30);
//        MyCalculator.sum_acc(30);
////        B부서
//        MyCalculator.sum_acc(20);
//        MyCalculator.sum_acc(40);
////        클래스 변수를 공용으로 사용하나보니, 변수와 메서드에 고유성이 보장되지 않음
//        System.out.println(MyCalculator.total_sum);

//        A부서 매출
        MyCalInstance calA = new MyCalInstance();
        calA.sum_acc(10);
        calA.sum_acc(20);
        calA.sum_acc(30);

//        B부서 매충
        MyCalInstance calB = new MyCalInstance();
        calB.sum_acc(10);
        calB.sum_acc(20);
        calB.sum_acc(30);

        System.out.println(calA.total_sum);
        System.out.println(calB.total_sum);

    }



}

// 내부 클래스
class MyCalculator {
    //    매개변수2개 받아서 더한값 return sum
    static int total_sum = 0;
    static int sum(int a, int b) {
        return a+b;
    }

    static int sum_acc(int a) {
        total_sum += a;
        return total_sum;
    }
}

class MyCalInstance {
//    static이 붙어있는 변수는 클래스 변수, static이 붙어있지 않으면 객체변수
    //    매개변수2개 받아서 더한값 return sum
    int total_sum = 0;
    int sum(int a, int b) {
        return a+b;
    }

    void sum_acc(int total_sum) {
//        this는 객체 그 자신을 의미
        this.total_sum += total_sum;
    }
}