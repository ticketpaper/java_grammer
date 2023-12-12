import java.util.*;

public class test {
// players : ["mumu", "soe", "poe", "kai", "mine"]
// callings : ["kai", "kai", "mine", "mine"]
// result : ["mumu", "kai", "mine", "soe", "poe"]
    public static void main(String[] args) {
//        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
////                             1등   2등      3등    4등     5등
//        String[] callings = {"kai", "kai", "mine", "mine"};
////                         "mumu", "soe", "kai", "poe", "mine"
////                         "mumu", "kai", "soe", "poe", "mine"
////                         "mumu", "kai", "soe", "mine", "poe"
////                         "mumu", "kai", "mine", "soe", "poe"
//
//        List<String> player_list = new ArrayList<>(Arrays.asList(players));
//        for (String calling : callings) {
//            int callingIndex = player_list.indexOf(calling);
//            int originalIndex = callingIndex - 1;
//
//            if (originalIndex >= 0) {
//                player_list.remove(calling);
//                player_list.add(originalIndex, calling);
//            }
//        }
//        String[] answer = player_list.toArray(new String[]{});
//        System.out.println(Arrays.toString(answer));

//        array	                result
//        [1, 2, 3, 3, 3, 4]	3
        int[] array = {1, 2, 3, 3,3,4};
            int[] checker = new int[1001];
            int answer = 0, max =0;
            for (int i = 0; i < array.length; i++) {
                checker[array[i]]++;
            }
            for (int i = 0; i < checker.length; i++) {
                if (max < checker[i]) {
                    max=checker[i];
                    answer = i;
                }else if (max == checker[i]) {
                    answer = -1;
                }
            }
        System.out.println(Arrays.toString(checker));
        System.out.println(answer);
    }
}

