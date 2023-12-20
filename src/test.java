import java.util.*;

public class test {
//    해시 / 달리기 경주
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
//        int pcount = 1;
//        String[] answer = new String[players.length];
//        Map<String, Integer> p_map = new LinkedHashMap<>();
//        Map<Integer, String> rev_map = new LinkedHashMap<>();
//        for (String s : players) {
//            p_map.put(s, pcount);
//            rev_map.put(pcount, s);
//            pcount++;
//        }
//        for (String call : callings) {
//            String s_temp= "";
//            Integer i_temp = 0;
//
//            i_temp = p_map.get(call)-1; // call 앞에 있는 선수 등수
//            s_temp = rev_map.get(p_map.get(call)-1); // call 앞에 있는 선수 이름
//            p_map.put(call, p_map.get(call) - 1);
//            p_map.put(s_temp, i_temp + 1);
//            rev_map.put(p_map.get(call), call);
//            // 불러진 선수의 변경된 값 넣기
//            rev_map.put(i_temp+1, s_temp);
//            // 불려진 선수의 앞에 있는애 순위 조절
//        }
//        int index = 0;
//        for (String value : rev_map.values()) {
//            answer[index]=value;
//            index++;
//        }




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

//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
//        List<List<Integer>> combi2 = new ArrayList<>();
//        List<Integer> temp2 = new ArrayList<>();
//        int n = 2, start = 0;
//        combi(list,combi2,temp2,n,start);
//        System.out.println(combi2);

        int[] answers = {1, 3, 2, 4, 2};
        List<Integer> stu1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> stu2 = new ArrayList<>(Arrays.asList(2, 1, 2, 3, 2, 4, 2, 5));
        List<Integer> stu3 = new ArrayList<>(Arrays.asList(3, 3, 1, 1, 2, 2, 4, 4, 5, 5));


    }
static int count1, count2, count3;

//    static void combi(List<Integer> list, List<List<Integer>> combi, List<Integer> temp, int n, int start) {
//        if (temp.size() == n) {
//            combi.add(new ArrayList<>(temp));
//            return; // 직전 호출 자리로
//        }
//        for (int i = start; i < list.size(); i++) {
//            temp.add(list.get(i));
//            combi(list, combi, temp, n, i + 1);
//            temp.remove(temp.size() - 1);
//            System.out.printf("%d번째 입니다.",i);
//        }
//    }

}


