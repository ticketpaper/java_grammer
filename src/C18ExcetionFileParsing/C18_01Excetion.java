package C18ExcetionFileParsing;

import java.util.IllformedLocaleException;
import java.util.Scanner;

/**
 * 예외처리를 왜 하는가?
 * -> 발생할 수 있는 오류와 상황을 미리 예측해서 예외 발생시 사용자(USER, 개발자)에게 적절한 처리(message) 전달
 * -> logging, debugging 목적
 */
public class C18_01Excetion {
    public static void main(String[] args) {
////        ArithmeticException : 0으로 나눌때
//        System.out.println("나눗셈 프로그램. 숫자 10에 나눌 분모값을 입력 :");
//        int num = 10;
//        Scanner sc = new Scanner(System.in);
////        예외가 발생할 것으로 예상되는 코드에 try catch로 감싸준다.
//        try {
//            int in = sc.nextInt();
//            System.out.println("10에 " + in + "을 나누면 " + num / in + "입니다.");
//        } catch (IllegalAccessError e) {
//            e.printStackTrace();
//            System.out.println("정상적이지 않은 입력값을 넣었습니다.");
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//        } catch (ArithmeticException e) {
////        catch에는 발생가능한 예외사항을 적어야 정상적으로 catch가 된다.
//            System.out.println("0으로 나눌수 없습니다.");
////            e안에 예외관련된 정보들이 들어있음.
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        } catch (Exception e) {
//            System.out.println("알 수 없는 예외가 발생했습니다.");
//            e.printStackTrace();
//        } finally {
////        반드시 실행되어야만 하는 구문 삽입
//        }
//        System.out.println("감사합니다.");


//        throw와 throws 예제
        String pwd = "1234";
        try {
            login(pwd);
        } catch (IllegalArgumentException e) {
//            e.getMessage는 login메서드에서 throw new한 곳에서 넘어온 메시지
            System.out.println(e.getMessage());
        }
    }

    /**
     * Checked Exception = 외부 시스템과의 인터랙션(파일시스템, 네트워크 등)에서 발생할 수 있는 예외
     * checked exception은 예외처리가 강제되고, 해다메서드에서 예외처리를 하든지 throws를 통해 호출한곳에 위임
     * 이때에 호출한 쪽에서는 예외처리가 발생한다.
     *
     * Unchecked Exception = 주로 프로그램 내부에서 발생할 수 있는 예외*
     * unchecked exception에서 thorws를 하지 않더라도 예외는 호출한곳으로 전파
     * 이때에 throws를 하는 이유는 명시적으로 예외가 발생할 수 있음을 알리는 것일 뿐
     */

    static void login(String pwd) throws IllegalAccessError {
//        여기서 잡고 컨트롤러에 던져라
        if (pwd.length() < 10) {
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }
    }
}
