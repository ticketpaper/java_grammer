import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {
        // 비밀번호 1234, 스캐너를 이용해 사용자의 input int로 받아서
        // 비밀번호 맞으면 "문이 열렸습니다"
        // 틀리면 비밀번호 "틀렸습니다" 출력

//        int passwd = 1234;
//        String password = "0123"; // int형으로 선언시 0이 날아가서 string으로 선언
//        Scanner sc = new Scanner(System.in);
//        System.out.print("비밀번호 입력 : ");
////        int input = sc.nextInt();
//        String input_pw = sc.nextLine();
////        if (passwd == input) System.out.println("문이 열렸습니다");
//        if (password.equals(input_pw)) System.out.println("문이 열렸습니다."); // 문자열 비교시 .equals 사용
//        else System.out.println("틀렸습니다");
//
//        // 사용자한테 알파벳을 입력받고, 그 알파벳이 대문자인지 소문자인지 판별
//        System.out.print("알파벳을 입력하세요 : ");
//        char ur_alpha = sc.nextLine().charAt(0);
//        if ('A' <= ur_alpha && ur_alpha <= 'Z') {
//            System.out.println("대문자 입니다.");
//        } else if ( 'a' <= ur_alpha && ur_alpha <= 'z'){
//            System.out.println("소문자 입니다.");
//        } else {
//            System.out.println("알파벳이 아닙니다.");
//        }

        // 돈얼마 있는지 입력, 버스요금은 1500원
        // 돈 비교 후 적으면 "탑승불가" 같거나 많으면 "정상처리"
        // 도난여부 boolean 설정(입력X)
//        System.out.print("돈입력 : ");
//        int money = sc.nextInt();
//        boolean s = false;
//        if ( 1500 <= money && s == false ) {
//            System.out.println("탑승 가능");
//        }
//        else {
//            System.out.println("탑승 불가능");
//        }

//        삼항연산자
        String password = "0123"; // int형으로 선언시 0이 날아가서 string으로 선언
        Scanner sc = new Scanner(System.in);
        System.out.print("비밀번호 입력 : ");
//        String input_pw = sc.nextLine();
//        String result = (password.equals(input_pw) ? "문이 열렸습니다." : "틀렸습니다." );
        String result = (sc.nextLine().equals(password) ? "문이 열렸습니다." : "틀렸습니다." );
        System.out.println(result);

        // 택시 10000, 버스 3000, 킥보드 2000
        System.out.print("돈입력 : ");
        int money = sc.nextInt();
        if(10000 <= money) System.out.println("택시");
        else if(3000 <= money && money < 10000 ) System.out.println("버스");
        else if(2000 <= money && money < 3000) System.out.println("킥보드");
        else System.out.println("걸어");
//        if(money<2000) System.out.println("걸어");
//        else if(money<3000) System.out.println("킥보드");
//        else if(money<10000) System.out.println("버스");
//        else System.out.println("택시");
//        금액 지정시 상세하게 할것

//        switch
//        원하는 번호를 입력해주세요 ->
//        1:대출서비스 2:예금 3:적금 0:상담사 연결 그외: 잘못누르셨습니다.
        System.out.print("원하는 번호를 입력해주세요 : ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("대출서비스 입니다.");
                break;
            case 2:
                System.out.println("예금");
                break;
            case 3:
                System.out.println("적금");
                break;
            case 0:
                System.out.println("상담사 연결 입니다.");
                break;
            default:
                System.out.println("잘못 누르셨습니다.");
                break;
        }


    }
}
