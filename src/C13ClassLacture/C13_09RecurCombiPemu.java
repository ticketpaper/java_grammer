package C13ClassLacture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C13_09RecurCombiPemu {

    static int count = 0;
    static int answer = 0;

    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<List<Integer>> combi = new ArrayList<>();
//        for (int i = 0; i < mylist.size() - 1; i++) {
//            for (int j = i + 1; j < mylist.size(); j++) {
//                List<Integer> temp = new ArrayList<>();
//                temp.add(mylist.get(i));
//                temp.add(mylist.get(j));
//                combi.add(temp);
//            }
//        }
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < mylist.size() - 1; i++) {
            temp.add(mylist.get(i));
            for (int j = i + 1; j < mylist.size(); j++) {
                temp.add(mylist.get(j));
                combi.add(new ArrayList<>(new ArrayList<>(temp)));
                temp.remove(temp.size() - 1);
            }
            temp.remove(temp.size() - 1);
        }
        System.out.println(combi);

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<List<Integer>> combi2 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        int n = 2, start = 0;

        combi(list, combi2, temp2, n, start);
        System.out.println(combi2);

        int balls = 5, share =3 ;
        recur(balls, share, 0);
        System.out.println(answer);
    }

    static void combi(List<Integer> list, List<List<Integer>> combi, List<Integer> temp, int n, int start) {
        if (temp.size() == n) {
            combi.add(new ArrayList<>(temp));
            return; // 직전 호출 자리로
        }
        for (int i = start; i < list.size(); i++) {
            temp.add(list.get(i));
            combi(list, combi, temp, n, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    static void recur(int balls, int share, int start) {
        if (count == share) {
            answer++;
            return;
        }
        for (int i = start; i < balls; i++) {
            count++;
            recur(balls, share, i+1);
            count--;
        }
    }

}
