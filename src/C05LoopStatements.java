import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {
//        // 2~10까지 출력 (while)
//        int a = 2;
//        while (a < 11) {
//            System.out.println(a);
//            a++;
//        }

//        // 사용자 숫자 입력 구구단 출력 (while)
//        Scanner sc = new Scanner(System.in);
//        System.out.println("구구단 단수를 입력해주세요");
//        int input_num = sc.nextInt(), count = 1;
//        while (count < 10) {
//            System.out.println(input_num + " X " + count + " = " + input_num * count);
//            count++;
//        }

//        while(true){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("구구단 단수를 입력해주세요");
//            int input_num = sc.nextInt(), count = 1;
//            while (count < 10) {
//                System.out.println(input_num + " X " + count + " = " + input_num * count);
//                count++;
//            }
//        }

////        비밀번호를 맞추면 반복이 종료, 그렇지 않으면 계속적으로 다시 질문
////        최대 5번까지만 비밀번호 입력가능하도록 -> 입력횟수를 초과했습니다 라는 문구
//        String password = "0123"; // int형으로 선언시 0이 날아가서 string으로 선언
//        int count = 0;
//        while(true) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("비밀번호 입력 : ");
//            String input_pw = sc.nextLine();
//            if (password.equals(input_pw)) {
//                System.out.println("문이 열렸습니다."); // 문자열 비교시 .equals 사용
//                break;
//            }
//            else{
//                    System.out.println("틀렸습니다");
//                    count++;
//                    if(count==5){
//                        System.out.println("입력횟수를 초과했습니다");
//                        break;
//                    }
//                }
//            }

//        // 2~10까지 출력 (do - while)
//        int a = 2;
//        do{
//            System.out.println(a);
//            a++;
//        }while (a < 11);

//        for문을 통해 2~10까지 출력
//        for(int i=2; i<11; i++){
//            System.out.println(i);
//        }

////         continue 예제, 홀수만 출력
//        for (int i=0; i<10; i++){
//            if(i%2==0){
//                continue;
//            }
//            System.out.println(i);
//        }

////        배열과 enhanced for문
//        int[] myArr = {1, 5, 7, 9, 10};
////        일반 for문
//        for(int i=0; i<5; i++){
//            System.out.println(myArr[i]);
//        }
////        enhanced for
//        for (int i : myArr) {
//            System.out.println(i);
//        }
//
//        // 일반 for문을 톨해 myArr값에 10씩 더한뒤에 출력
//        for(int i=0; i<myArr.length; i++){
//            myArr[i]+=10;
//        }
//        System.out.println(Arrays.toString(myArr));

//        enhanced for 문
//        for (int i : myArr) {
//            System.out.println(i+10);
//        }

//        int num = 10;
//        if (num > 1) {
//            int abc=20;
//            num=20;
//        }
////        System.out.println(abc); if문 안에서 정의된 변수는 밖에서 인지불가
//        System.out.println(num); // if문 밖에서 선언한 변수값은 if안에서 접근하여 변경하는것은 가능

//        다중반복문
//        for(int i=1; i<10; i++){
//            System.out.println(i+"단 입니다.");
//            for (int j=1; j<10; j++){
//                System.out.println(i + " X " + j + " = " + i * j);
//            }
//        }

//        2중 for문을 통해 배열접근
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
