package C13ClassLacture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class C13_09RecurCombiPemu {
    static int answer1;
    static int count;
    static int answer;

    public static void main(String[] args) {
//        List<Integer> mylist = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
//        List<List<Integer>> combi = new ArrayList<>();
//        for (int i = 0; i < mylist.size() - 1; i++) {
//            for (int j = i + 1; j < mylist.size(); j++) {
//                List<Integer> temp = new ArrayList<>();
//                temp.add(mylist.get(i));
//                temp.add(mylist.get(j));
//                combi.add(temp);
//            }
//        }
//        List<Integer> temp = new ArrayList<>();
//        for (int i = 0; i < mylist.size() - 1; i++) {
//            temp.add(mylist.get(i));
//            for (int j = i + 1; j < mylist.size(); j++) {
//                temp.add(mylist.get(j));
//                combi.add(new ArrayList<>(new ArrayList<>(temp)));
//                temp.remove(temp.size() - 1);
//            }
//            temp.remove(temp.size() - 1);
//        }
//        System.out.println(combi);

//        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
//        List<List<Integer>> combi2 = new ArrayList<>();
//        List<Integer> temp2 = new ArrayList<>();
//        int n = 2, start = 0;
//
//        combi(list, combi2, temp2, n, start);
//        System.out.println(combi2);

//        int balls = 5, share =3 ;
//        recur(balls, share, 0);
//        System.out.println(answer);

//        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
//        List<List<Integer>> combi3 = new ArrayList<>();
//        List<Integer> temp3 = new ArrayList<>();
//        int n3 = 3 ;
//        boolean[] visited =  new boolean[list3.size()];
//        permutaiton(list3, combi3, visited, temp3, n3);
//        System.out.println(combi3);


//        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
//        List<List<Integer>> permutation_list = new ArrayList<>();
//        boolean[] visited2 = new boolean[list4.size()];
//        permutaiton2(list4, visited2, 0, 0);
//        System.out.println(answer1);

        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        boolean[] dnfvisit = new boolean[dungeons.length];
        Dnf(dungeons, dnfvisit, k, 0);
        System.out.println(answerd);
    }

//    static void combi(List<Integer> list, List<List<Integer>> combi, List<Integer> temp, int n, int start) {
//        if (temp.size() == n) {
//            combi.add(new ArrayList<>(temp));
//            return; // 직전 호출 자리로
//        }
//        for (int i = start; i < list.size(); i++) {
//            temp.add(list.get(i));
//            combi(list, combi, temp, n, i + 1);
//            temp.remove(temp.size() - 1);
//        }
//    }

//    static void recur(int balls, int share, int start) {
//        if (count == share) {
//            answer++;
//            return;
//        }
//        for (int i = start; i < balls; i++) {
//            count++;
//            recur(balls, share, i+1);
//            count--;
//        }
//    }

    static void permutaiton(List<Integer> list, List<List<Integer>> combi,boolean[] visited,List<Integer> temp, int n) {
//        0. 모든 순열
        if (temp.size() == n) {
            combi.add(new ArrayList<>(temp));
            return; // 직전 호출 자리로
        }
//
////        1. 합계가 6이상인 2개 순열만 add
//        if (temp.size() == n) {
//            for (int i = 0; i < temp.size()-1; i++) {
//                if (temp.get(i) + temp.get(i+1) >= 6) {
//                    combi.add(new ArrayList<>(temp));
//                    return; // 직전 호출 자리로
//                }
//            }
//        }
//
////        2. 합계가 6이상인 모든 순열 add
//            int sum = 0;
//            for (Integer i : temp) {
//                sum += i;
//            }
//            if (sum >= 6) {
//                combi.add(new ArrayList<>(temp));
//            }
//
////        3. 3개 순열에서 합계가 가장 큰값 찾기
////
//        for (int i = 0; i < list.size(); i++) {
//            if (visited[i] == false) {
//                visited[i] = true;
//                temp.add(list.get(i));
//                permutaiton(list, combi,visited, temp, n);
//                temp.remove(temp.size() - 1);
//                visited[i] = false;
//            }
//        }
//    }
//
//    static void permutaiton2(List<Integer> list,boolean[] visited,int temp, int count) {
//        if (count == 3) {
//            if (temp > answer1) {
//                answer1= temp;
//            }
//            return;
//        }
//        for (int i = 0; i < list.size(); i++) {
//            if (visited[i] == false) {
//                visited[i] = true;
//                temp += list.get(i);
//                permutaiton2(list,visited, temp,count+1);
//                temp -= list.get(i);
//                visited[i] = false;
//            }
//        }
    }

    static void Dnf(int[][] Dungeons, boolean[] visit, int k, int countd) {
        for (int i = 0; i < Dungeons.length; i++) {
            if (countd > answerd) {
                answerd= countd;
            }
            if (visit[i]==false && k >= Dungeons[i][0]) {
                visit[i] = true;
                k -= Dungeons[i][1];
                Dnf(Dungeons, visit, k,countd+1);
                k += Dungeons[i][1];
                visit[i] = false;
            }
        }
    }
    static int answerd;
}


