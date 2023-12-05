import java.util.Scanner;

public class C01InputOutput {
    public static void main(String[] args) {
        int a = 20;
        System.out.print("a = " + a);
//        print는 출력 후 줄바꿈 없음. println은 출력 후 줄바꿈

        String myString = "hello wolrd";
//         문자열 + 숫자 = 문자열
        System.out.println("myString + a = " + myString + a);
//           숫자 + 숫자 = 더하기 연산
        System.out.println(10+20);

//        입력 System.in(키보드 입력) + Scanner(입력을 위한 클래스)
        Scanner myScan = new Scanner(System.in);
        System.out.println("아무 문자열을 입력하세요 : ");
//        nextLine()은 입력 받은 데이터를 한줄 읽어서, String으로 반환
        String intputs = myScan.nextLine();
        System.out.println("사용자가 입력한 문자열 : " + intputs);

//        nextint()은 입력 받은 데이터를 한줄 읽어서, int로 반환
        int inputs_int = myScan.nextInt();
        System.out.println("사용자가 입력한 숫자 " + inputs_int);

//         더하기를 할 숫자 2개를 입력, 숫자 1개 입력후 엔터 -> 숫자 1개 입력후 엔터 -> 두 수를 더한 값은 xx입니다.
        System.out.println("더하기를 할 숫자 2개를 입력");
        int i1 = myScan.nextInt();
        int i2 = myScan.nextInt();
//        int sum = i1 + i2 ;
        System.out.println("입력하신 두수를 더한 값은 " + (i1+i2));

        System.out.print("실수를 입력 : ");
        double input_d = myScan.nextDouble();
        System.out.println("입력한 실수의 값 : " + input_d);
        System.out.print("true 또는 false 입력 : ");
        boolean input_b = myScan.nextBoolean();
        System.out.println("입력한 값 : " + input_b);

//        입출력 시스템 메모리 해제
        myScan.close();

    }
}
