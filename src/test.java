import java.util.*;

public class test {
//      numbers	    result
//      [2,1,3,4,1]	[2,3,4,5,6,7]
//      [5,0,2,7]	[2,5,7,9,12]
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        int index = 0, index2 = 0;
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] temp = new int[numbers.length*numbers.length];
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                temp[index]= numbers[i]+numbers[j];
                index++;
            }
        }
        System.out.println(Arrays.toString(temp));
        int[] temp_ans = Arrays.copyOfRange(temp, 0, index);
        Arrays.sort(temp_ans);
        System.out.println(Arrays.toString(temp_ans));

        int[] temp_answer = new int[temp_ans.length];
        for (int i = 0; i < temp_ans.length - 1; i++) {
            if (temp_ans[i] != temp_ans[i + 1]) {
                temp_answer[index2] = temp_ans[i];
                index2++;
            }
        }
        temp_answer[index2++] = temp_ans[temp_ans.length - 1];
        int[] answer = Arrays.copyOfRange(temp_answer, 0, index2);
        System.out.println(Arrays.toString(answer));


//        int[] numbers_combi = new int[numbers.length * numbers.length];
//        int combi_cnt = 0;
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                numbers_combi[combi_cnt] = numbers[i]+numbers[j];
//                combi_cnt++;
//            }
//        }
//        int[] temp2 = Arrays.copyOfRange(numbers_combi, 0, combi_cnt);
//        System.out.println(Arrays.toString(temp2));



    }
}

