import java.util.*;

public class C11Set {
    public static void main(String[] args) {
////        Set의 특성 : 순서 없음, 중복 안됨
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);

////        반 학생들이 좋아하는 운동종목 list로 만들고, 좋아하는 종목명의 개수를 출력 set으로 변경
//        List<String> favorit_list = new ArrayList<>();
//        favorit_list.add("baseball");
//        favorit_list.add("baseball");
//        favorit_list.add("baseball");
//        favorit_list.add("basketball");
//        favorit_list.add("basketball");
//        favorit_list.add("tennis");
//        favorit_list.add("basketball");
//        favorit_list.add("tennis");
//        favorit_list.add("tennis");
//
////        List를 인자값으로 받아 초기값 세팅 가능하다.
//        Set<String> list_set = new HashSet<>(favorit_list);
//        System.out.println(list_set.size());

//        set은 수학에서 집합과 유사한 성질을 지닌 자료형
//        list를 인자로 사용하여 set으로 변환하여 많이 사용 (배열은 인자로 안들어감)

////        배열을 인자값으로 받아 set 초기값 세팅
//        String[] str_arr = {"java", "java", "spring", "python", "python"};
//        Set<String> str_set = new HashSet<>(Arrays.asList(str_arr));
//        System.out.println(str_set);
//        str_set.remove("java");
//        System.out.println(str_set);
//
//        int[] int_arr = {1, 2, 3, 1, 2, 3, 1, 1, 1, 1, 2, 3, 4, 4};
//        List<Integer> int_list = new ArrayList<>();
//        for (int i : int_arr) {
//            int_list.add(i);
//        }
//        Set<Integer> int_set = new TreeSet<>(int_list);
//        System.out.println(int_set);

        Set<String> str_set1 = new HashSet<>(Arrays.asList("java", "python", "javascript"));
        Set<String> str_set2 = new HashSet<>(Arrays.asList("java", "html", "css"));
//        교집합 : retainAll
        Set<String> copy1 = new HashSet<>(str_set1);
        copy1.retainAll(str_set2);
        System.out.println(copy1);
//        합집합 : addAll
        Set<String> copy2 = new HashSet<>(str_set1);
        copy2.addAll(str_set2);
        System.out.println(copy2);
//        차집합 : removeAll
        Set<String> copy3 = new HashSet<>(str_set1);
        copy3.removeAll(str_set2);
        System.out.println(copy3);

//        순서가 없으므로 enhanced for, iterator 사용

//        LinkedHashSet, TreeSet
        Set<String> mySet = new TreeSet<>();
        mySet.add("hello5");
        mySet.add("hello4");
        mySet.add("hello3");
        mySet.add("hello2");
        mySet.add("hello1");
        System.out.println(mySet);
    }
}
