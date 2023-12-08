import java.util.Arrays;
import java.util.Comparator;

public class C08Array {
    public static void main(String[] args) {
////        표현식 1
//        int[] int_arr1 = {1, 2, 3, 4};

////        표현식 2
//        int[] int_arr2 = new int[4];
//        int_arr2[0] = 1;
//        int_arr2[1] = 2;
//        int_arr2[2] = 3;
//        int_arr2[3] = 4;

////        표현삭 3
//        int[] int_arr3 = new int[]{1, 2, 3, 4};

////        표현식 4
////        int[] int_arr4 = new int[]; //배열은 반드시 길이를 지정해줘야함

////        85, 65, 90인 int 배열 선언, 종합, 평균값
//        int[] arr = {85, 65, 90};
//        int sum = 0;
//        for (int i : arr) {
//            sum += i;
//        }
//        int avg = sum / arr.length;
//        System.out.println(sum + " " + avg);

////        최대값, 최소값 구하기
//        int[] arr = {10,20,30,12,8,17};
//        int max = arr[0], min = arr[0];
//        for(int i=1; i<arr.length; i++){
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//        }
//        System.out.printf("max : %d, min : %d", max, min);

////        배열의 순서 바꾸기
//        int[] arr = {10, 20};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//        System.out.println(Arrays.toString(arr));

////        0번째 index부터 마지막까지 자리 바꾸기
//        int[] arr2 = {10, 20, 30, 40, 50, 60, 70};
//        for (int i = 0, j = 1; j < arr2.length; i++, j++) {
//            int temp = arr2[i];
//            arr2[i] = arr2[j];
//            arr2[j] = temp;
//        }
//        System.out.println(Arrays.toString(arr2));

////        배열 뒤집기
//        int[] arr = {1,2,3,4,5};
////        신규배열 선언 : arr2
//        int[] arr2 = new int[arr.length];
//        for(int i=0; i<arr.length; i++) {
//            arr2[i] = arr[arr.length-i-1];
//        }
//        System.out.println(Arrays.toString(arr2));

////        배열 뒤집기 2
//        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
//            int temp = arr[j];
//            arr[j] = arr[i];
//            arr[i] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        정렬 : sort() 함수 사용
//        int[] arr = {5,67,2,3,78,89,1,2,3,5,6,7,99}; // 오름차순 정렬 기본
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

////        내림차순 정렬
////        방법1. Comparator클래스 사용
////        객체타입인 경우에만 Comparator클래스 사용 가능
////        기본형 타입은 처리 불가하다.
//        String[] str_arr = {"hello","hi","bye","ayayaya"};
//        Arrays.sort(str_arr);
//        System.out.println(Arrays.toString(str_arr));
//        Arrays.sort(str_arr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(str_arr));

////        방법2. 오름차순 정렬 후 뒤집기
//        for (int i = 0, j = arr.length-1; i < arr.length / 2; i++, j--) {
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

//        SteamApi, lamda를 활용한 내림차순 정렬
        int[] arr2 = {67,78,89,1,2,3,5,6,7,99};
        int[] sort_arr = Arrays.stream(arr2) //arr2를 복사해서 steam객체 생성
                               .boxed() // Integer 형 변환 steam객체 생성
                               .sorted(Comparator.reverseOrder()) //내림차순정렬
                               .mapToInt(a->a) //Integer를 int로 변환
                               .toArray(); //배열로 변환
        System.out.println(Arrays.toString(sort_arr));


    }
}
