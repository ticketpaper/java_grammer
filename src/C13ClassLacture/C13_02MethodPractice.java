package C13ClassLacture;

public class C13_02MethodPractice {
    public static void main(String[] args) {
//        소수인지 아닌지 판별하는 메서드
//        return boolean : 소수면 true, 아니면 false
//        메인메서드에서 호출해서 테스트
        System.out.println(is_prime(9));
        is_prime_print(9);
    }

    public static boolean is_prime(int a) {
        boolean is_prime = true;
        for (int i = 2; i*i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return is_prime;
    }

    static void is_prime_print(int a) {
        boolean is_prime = true;
        for (int i = 2; i*i <= a; i++) {
            if (a % i == 0) {
                System.out.println("소수 아닙니다.");
                return;
            }
        }
        System.out.println("소수입니다.");
    }
}
