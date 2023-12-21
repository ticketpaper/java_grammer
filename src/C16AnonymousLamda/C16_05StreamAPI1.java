package C16AnonymousLamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C16_05StreamAPI1 {
    public static void main(String[] args) {
        int[] arr = {20, 10, 4, 12};
////       데이터 접근하는 전통적인 방식
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        데이터와 객체 중심이 아닌, 입력에 따른 출력 만 존재하는 함수형 프로그래밍 방식
//        java에서 함수형 프로그래밍을 지원하기위한 라이브러리 -> StreamAPI
//        foreach : 스트림의 각 요소를 소모하면서 동작을 수행
        Arrays.stream(arr).forEach(a -> System.out.println(a));

        Arrays.stream(arr).sorted().forEach(a -> System.out.println(a));
        List<Integer> list = new ArrayList<>();


    }
}
