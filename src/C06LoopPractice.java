public class C06LoopPractice {
    public static void main(String[] args) {
////         1~20까지 짝수의 합 계산하기
//        int sum = 0;
//        for(int i=0; i<=20; i++){
//            if(i%2==0){
//                sum+=i;
//                System.out.println("i = " + i);
//            }
//        }
//        System.out.println("sum = " + sum);

        // 숫자 뒤집기
//        int num = 1234, revers_num = 0;
//        for(int i=0; i<4; i++){
//            int temp = num % 10;
//            revers_num = revers_num*10 + temp;
//            num/=10;
//            if(num==0) break;
//        }
//        System.out.println("revers_num = " + revers_num);

//        최대 공약수 구하기
//        int a = 24, b = 36;
//        int min = (a>b ? b : a);
//        int answer = 0;
//        for (int i = 1; i <= min; i++) {
//            if (a % i == 0 && b % i == 0 ) {
//                answer = i;
//            }
//        }
//        System.out.println("최대 공약수는 " + answer);


//        라벨문 활용1 :
//        int[][] metrix = {{1, 2, 3, 4}, {5, 6, 7}, {8, 9}, {10, 11, 12, 13, 14}};
//        int target = 11;
//        loop :
//        for (int i = 0; i < metrix.length; i++) {
//            for (int j = 0; j < metrix[i].length; j++) {
//                if (metrix[i][j] == target) {
//                    System.out.printf("target은 metrix[%d][%d]번째 배열에 있습니다", i, j);
//                    break loop;
//                }
//            }
//        }

//        라벨문 활용 2 : 1~20 숫자가 있을때, 이 중 약수가 5개 이상인 숫자중에 가장 작은값을 구하시오.
//        불필요한 빈복은 없게하라
        int min = 0;
        loop1 :
        for (int i = 1; i < 20; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 ) {
                    count++;
                    if (count >= 5) {
                        min=i;
                        break loop1;
                    }
                }
            }
        }
        System.out.println(min);
    }
}
