package C13ClassLacture;

import java.util.ArrayList;
import java.util.List;

public class C13_07MethodOverloading {
    public static void main(String[] args) {
        C13_07MethodOverloading c1 = new C13_07MethodOverloading();
//        메서드 오버로딩을 통해 같은 메서드명 재활용
        System.out.println(c1.sum(3D,3));
        System.out.println(c1.sum(3.0,3));
        System.out.println(c1.sum(1,2));
        System.out.println(c1.sum(1, 2, 3));
//        제네릭을 통해 타입 재활용
        List<Integer> l1 = new ArrayList<>();

    }

    double sum(double a, double b) {
        return a + b;
    }
    int sum(int a, int b) {
        return a+b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}



