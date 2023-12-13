import java.util.*;

public class test {
//    해시 / 달리기 경주
// players : ["mumu", "soe", "poe", "kai", "mine"]
// callings : ["kai", "kai", "mine", "mine"]
// result : ["mumu", "kai", "mine", "soe", "poe"]
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
//                             1등   2등      3등    4등     5등
        String[] callings = {"kai", "kai", "mine", "mine"};
//                         "mumu", "soe", "kai", "poe", "mine"
//                         "mumu", "kai", "soe", "poe", "mine"
//                         "mumu", "kai", "soe", "mine", "poe"
//                         "mumu", "kai", "mine", "soe", "poe"
        Map<String, Integer> p_map = new LinkedHashMap<>();


////        두 개 뽑아서 더하기
////        numbers	    result
////        [2,1,3,4,1]	[2,3,4,5,6,7]
////        [5,0,2,7]	    [2,5,7,9,12]
//        int[] numbers = {2, 1, 3, 4, 1};
//        Set<Integer> answer_set = new TreeSet<>();
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                answer_set.add(numbers[i]+numbers[j]);
//            }
//        }
//        int[] answer = new int[answer_set.size()];
//        int count = 0;
//        for (Integer i : answer_set) {
//            answer[count] = i;
//            count++;
//        }
//        System.out.println(Arrays.toString(answer));

////        array	                result
////        [1, 2, 3, 3, 3, 4]	    3
//        int[] array = {1, 2, 3, 3,3,4};
//            int[] checker = new int[1001];
//            int answer = 0, max =0;
//            for (int i = 0; i < array.length; i++) {
//                checker[array[i]]++;
//            }
//            for (int i = 0; i < checker.length; i++) {
//                if (max < checker[i]) {
//                    max=checker[i];
//                    answer = i;
//                }else if (max == checker[i]) {
//                    answer = -1;
//                }
//            }
//        System.out.println(Arrays.toString(checker));
//        System.out.println(answer);

////        해시 / 전화번호 목록
////        phone_book	                        return
////        ["119", "97674223", "1195524421"]	    false
//        String[] phone_book = {"119", "97674223", "1195524421"};

    }
}

