package C13ClassLacture;

import java.util.Arrays;

public class C13_08RecursiveBasic {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//        System.out.println(add_acc(10));
//        System.out.println(fac(7));


        int first = 1, second = 1;
        for (int i = 2; i < 10; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        System.out.println(fac(10));

        System.out.println(Fibonacci(10));

        int n = 10;
        int[] arr = new int[n];
//        피보나치 for문 배열
//        메모이제이션 ( 기억알고리즘 DP ), 단계마다 게산결과값이 필요할때 메모이제이션 활용
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
    }

//    메서드가 자기 자신을 호출하는 메서드를 재귀 함수라고 한다.
//    이러한 호출방식을 재귀호출이라고 한다.
    static int add_acc(int n) {
        if (n == 1) {
            return n;
        }
        return n + add_acc(n-1);

    }

    //    누적곱하기합 팩토리얼 구현
    static int fac(int n) {
        if (n == 1) {
            return n;
        }
        return n * fac(n - 1);
    }

    static int Fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);

    }
}
