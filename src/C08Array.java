import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;

// 배열의 길이는 고정 (추가 할 수 없음)
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

////        SteamApi, lamda를 활용한 내림차순 정렬
//        int[] arr2 = {67,78,89,1,2,3,5,6,7,99};
//        int[] sort_arr = Arrays.stream(arr2) //arr2를 복사해서 steam객체 생성
//                               .boxed() // Integer 형 변환 steam객체 생성
//                               .sorted(Comparator.reverseOrder()) //내림차순정렬
//                               .mapToInt(a->a) //Integer를 int로 변환
//                               .toArray(); //배열로 변환
//        System.out.println(Arrays.toString(sort_arr));

////        선택정렬
//        int[] arr = {30, 22, 20, 25, 12};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

////        숫자 조합의 합 : 각기 다른 숫자의 배열이 있을떄  만들어질 수 있는 2개의 조합의 합을 출력하라.
//        int[] int_arr = {10, 20, 30, 40, 50, 60};
//        int count =0;
//        for (int i = 0; i < int_arr.length-1; i++) {
//            for (int j = i+1; j < int_arr.length; j++) {
//                System.out.printf("%d + %d = %d \n",int_arr[i],int_arr[j],int_arr[i]+int_arr[j]);
//            }
//        }

////        배열 복사
//        int[] temp = {10, 10, 40, 5};
//        int[] copy_temp = Arrays.copyOfRange(temp, 0, 3);
//        System.out.println(Arrays.toString(copy_temp));

////        중복제거하기
//        Arrays.sort(temp);
//        int[] new_temp2 = new int[temp.length];
//        int index = 0;
//        for (int i = 0; i < temp.length-1; i++) {
//            if (temp[i] != temp[i + 1]) {
//                new_temp2[index] = temp[i];
//                index++;
//            }
//        }
//        new_temp2[index++] = temp[new_temp2.length-1];
//
//        int[] answer2 = Arrays.copyOfRange(new_temp2,0,index);
//        System.out.println(Arrays.toString(answer2));

////        버블정렬
//        int[] temp_arr = {1, 10, 40, 5, 8};
//        int[] temp_arr = {5, 1, 2, 3, 4};
//        for (int i = 0; i < temp_arr.length-1; i++) {
//            boolean isChanged = false;
//            for (int j =0;  j < temp_arr.length-1-i; j++) {
//                if (temp_arr[j] > temp_arr[j+1]) {
//                    int temp = temp_arr[j];
//                    temp_arr[j] = temp_arr[j+1];
//                    temp_arr[j+1] = temp;
//                    isChanged = true;
//                }
//            }
//            if(isChanged == false) break;
//        }
//        System.out.println(Arrays.toString(temp_arr));

////        배열의 검색
//        int[] arr = {5, 2, 3, 1, 8, 7};

////        이진검색(Binary Search)
////        사전에 오름차순 정렬이 되어있어야 이진검색 가능
//        Arrays.sort(arr);
//        int ans = Arrays.binarySearch(arr, 8);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(ans);

//        // 배열 간 비교 : equals , 순서까지 동일해야 true
//        int[] arr1 = {10, 20, 30};
//        int[] arr2 = {10, 20, 30};
//        System.out.println(Arrays.equals(arr1,arr2));

////        배열복사: copyOf(배열, end), copyOfRange(배열, start, end)
//        int[] arr = {10,20,30,40,50};
//        int[] arr1 = Arrays.copyOf(arr, 10);
//        int[] arr2 = Arrays.copyOfRange(arr, 1, 4);
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));

////        2차원배열 : 배열안에 또 다른 배열이 있는 경우
//        int[][] arr1 = new int[2][3];
//        arr1[0][0] = 1;
//        arr1[0][1] = 2;
//        arr1[0][2] = 3;
//        arr1[1][0] = 4;
//        arr1[1][1] = 5;
//        arr1[1][2] = 6;
//        System.out.println(Arrays.deepToString(arr1));

////        2차원 가변배열 선언 및 할당
//        int[][] arr2 = new int[3][];
//        arr2[0] = new int[1];
//        arr2[1] = new int[2];
//        arr2[2] = new int[3];
////        arr2[0][0] = 10;
////        arr2[1][0] = 20;
////        arr2[2][0] = 30;
//        System.out.println(Arrays.deepToString(arr2));


////        가변배열 리터럴 방식
//        int[][] arr3 = {{10}, {10, 20}, {10, 20, 30}};
//        System.out.println(Arrays.deepToString(arr3));

//        [3][4]사이즈의 배열을 선언 한 뒤
//        1,2,3 ~ 12까지의 숫자값 각 배열에 할당
        int[][] arr4 = new int[3][4];
        int count = 1;
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                arr4[i][j] = count;
                count++;
            }
        }
        System.out.println(Arrays.deepToString(arr4));

//        가변배열 만들기 : 전체사이즈 [5]
//        각 배열마다 사이즈 1,2,3,4,5로 커지도록
//        값은 1은 10 모두 2는 20이 모두
        int[][] arr5= new int[5][];
        int count2 = 10;
        for (int i = 0; i < arr5.length; i++) {
            arr5[i]= new int[i+1];
            for (int j = 0; j < arr5[i].length; j++) {
                arr5[i][j] = count2;
            }
            count2 += 10;
        }
        System.out.println(Arrays.deepToString(arr5));
    }
}
