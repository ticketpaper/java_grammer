import java.util.*;
import java.util.stream.Collectors;

public class C09List {
    public static void main(String[] args) {
//        List는 여러개의 요소를 저장하는 자료구조로서 배열과 다르게 요소의 추가와 삭제가 가능
//        List 선언 방법
//        ArrayList<String> my_list = new ArrayList<String>();
//        ArrayList<String> my_list = new ArrayList<>();
//        가장 일방적인 방식
//        왼쪽엔 인터페이스, 오른쪽엔 구현체
//        List<String> my_list = new ArrayList<>();
////        초기값 생성 방법 1. 하나씩 add
//        my_list.add("java");
//        my_list.add("python");
//        my_list.add("c++");
//        System.out.println(my_list);

////        초기값 생성 방법 2. 한번에 add (배열을 이용한 변환)
//        String[] my_arr = {"java", "python", "c++"};
//        List<String> my_list2 = new ArrayList<>(Arrays.asList(my_arr));
////        List<String> my_list2 = new ArrayList<>(Arrays.asList("java", "python", "c++"));
////        배열이 int인 경우
//        int[] my_intArr = {1, 2, 3};
//        List<Integer> my_intList = new ArrayList<>();
//        for (int i : my_intArr) {
//            my_intList.add(i);
//        }
//        System.out.println(my_intList);

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//
////        add(index, int element) : 중간에 값 삽입은 기본적으로 성능저하
//        myList.add(1, 15);
//        System.out.println(myList);
//
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(30);
//        myList2.add(40);
//        myList2.add(50);
//
////        addAll(Collection객체) : 특정 리스트의 요소를 모두 add
//        myList.addAll(myList2);
//        System.out.println(myList);
//
////        get(int index) : 특정 위치의 요소를 반환
//        System.out.println(myList.get(0));
//
////        for문을 돌려 전체 출력.
////        size() : 리스트의 개수 반환
//        for (int i = 0; i < myList.size(); i++) {
//            myList.get(i);
//        }
//
////        remove() : 요소삭제 메서드
////        remove는 value삭제, index를 통한 삭제
//
////        1. remove를 통한 index 삭제 : 0번째
//        myList.remove(0);
//        System.out.println(myList);
////        객체를 통한 삭제 : Integer.valueOf
//        myList.remove(Integer.valueOf(15));
//        System.out.println(myList);
//
////        set(int index, E element) : index자리에 값 변경
////        마지막자리값 : 100으로 변경
//        myList.set(myList.size()-1, 100);
//        System.out.println(myList);
//
////        contains() : 특정값이 있는지 boolean 반환
//        System.out.println(myList.contains(100));


//        ArrayList<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//
////        indexOf() : 몇번째 index에 위치하는지 반환, 해당 데이터가 없으면 -1을 반환
////        같은 데이터가 있으면 첫번째 index값을 반환한다.
//        System.out.println(myList.indexOf(20));
//
////        clear() : 전체삭제
////        isEmpty() : 값이 비었는지 안비었는지 boolean 반환
//        System.out.println(myList.isEmpty());
//        myList.clear();
//        System.out.println(myList);
//        System.out.println(myList.isEmpty());

////        List 출력
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[3]);
//        myList.add(new int[3]);
//        myList.add(new int[3]);
//
////        위 list에 값 1,2,3 / 10, 20 ,30 / 100, 200 ,300 넣기
//        int count =1;
//        for (int i = 0; i < myList.size(); i++) {
//            for (int j = 0; j < myList.get(i).length; j++) {
//                myList.get(i)[j]= (j+1) * count;
//            }
//            count*=10;
//        }

////        for (int[] ints : myList) {
////            System.out.println(Arrays.toString(ints));
////        }
//        System.out.println(Arrays.deepToString(myList.toArray()));
//
//        List<List<Integer>> myList2 = new ArrayList<>();
//        myList2.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
//        myList2.add(new ArrayList<>(Arrays.asList(10, 20, 30)));
//        myList2.add(new ArrayList<>(Arrays.asList(100, 200, 300)));
//        System.out.println(myList2);

//        List<Integer> myList = new ArrayList<>(Arrays.asList(6,4,21,5,10,1,2));
////        List 정렬 방법 1. Collections.sort()
//        Collections.sort(myList);
//        System.out.println(myList);
//        Collections.sort(myList,Comparator.reverseOrder());
//        System.out.println(myList);
////        List 정렬 방법 2. 객체.sort()
//        myList.sort(Comparator.naturalOrder());
//        System.out.println(myList);
//        myList.sort(Comparator.reverseOrder());
//        System.out.println(myList);

////        1. String배열을 List로 변환
//        String[] str_arr = {"java", "Spring"};
////        1-1. Arrays.asList
////        List<String> str_list = new ArrayList<>(Arrays.asList(str_arr));
//        List<String> str_list = Arrays.asList(str_arr);
//        System.out.println(str_list);
//
//        List<String> str_list2 = new ArrayList<>();
////        1-2. for문 담기
//        for (String s : str_arr) {
//            str_list2.add(s);
//        }
//        System.out.println(str_list2);
//
////        1-3. streamAPI (참고용)
//        List<String> st_list3=  Arrays.stream(str_arr).collect(Collectors.toList());
//        System.out.println(st_list3);
//
////        2. int배열을 List로 변환
//        int[] int_arr = {1, 2, 3, 4};
////        2-1. Array.asList 사용 불가 : Integer 타입이여야함
////        2-2. for문 담기 사용 가능 : 오토 박싱, 언박싱 해줌
////        2-3. streamAPI 사용가능

//        3. String List를 String 배열로 변환
//        3-1. for문으로 할당
//        List<String> str_list = new ArrayList<>(Arrays.asList("hello","java","world"));
//        String[] str_arr = new String[str_list.size()];
//        for (int i = 0; i < str_list.size(); i++) {
//            str_arr[i] = str_list.get(i);
//        }
//        System.out.println(Arrays.toString(str_arr));
//
////        3-2. streamAPI 사용가능
//        String[] str_arr2 = str_list.stream().toArray(a->new String[a]);

//        4. int List를 int 배열로 반환
//        4-1. for문으로 변환 가능
//        4-2. streamAPI 사용 가능

////        두개 뽑아서 더하기 : 리스트
////        numbers	    result
////        [2,1,3,4,1]	[2,3,4,5,6,7]
//        int[] numbers = {2,1,3,4,1};
//        List<Integer> combi = new ArrayList<>();
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if(!(combi.contains(numbers[i]+numbers[j]))){
//                    combi.add(numbers[i]+numbers[j]);
//                }
//            }
//        }
//        combi.sort(Comparator.naturalOrder());
//
//        int[] answer = new int[combi.size()];
//        for (int i = 0; i < combi.size(); i++) {
//            answer[i] = combi.get(i);
//        }
//        System.out.println(Arrays.toString(answer));

//        n의 배수
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        List<Integer> num_list = new ArrayList<>();

        for(int a : numlist){
            if(a%n==0){
                num_list.add(a);
            }
        }
        int[] answer = new int[num_list.size()];
        for(int i=0;i<num_list.size();i++){
            answer[i] = num_list.get(i);
        }
        System.out.println(num_list);


    }
}
