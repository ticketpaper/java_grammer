import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09List {
    public static void main(String[] args) {
//        List는 여러개의 요소를 저장하는 자료구조로서 배열과 다르게 요소의 추가와 삭제가 가능
//        List 선언 방법
//        ArrayList<String> my_list = new ArrayList<String>();
//        ArrayList<String> my_list = new ArrayList<>();
//        가장 일방적인 방식
//        왼쪽엔 인터페이스, 오른쪽엔 구현체
        List<String> my_list = new ArrayList<>();
//        초기값 생성 방법 1. 하나씩 add
        my_list.add("java");
        my_list.add("python");
        my_list.add("c++");
        System.out.println(my_list);

//        초기값 생성 방법 2. 한번에 add (배열을 이용한 변환)
        String[] my_arr = {"java", "python", "c++"};
        List<String> my_list2 = new ArrayList<>(Arrays.asList(my_arr));
//        List<String> my_list2 = new ArrayList<>(Arrays.asList("java", "python", "c++"));
//        배열이 int인 경우
        int[] my_intArr = {1, 2, 3};
        List<Integer> my_intList = new ArrayList<>();
        for (int i : my_intArr) {
            my_intList.add(i);
        }
        System.out.println(my_intList);




    }
}
