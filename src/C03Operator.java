public class C03Operator {
    public static void main(String[] args) {
////        산술 연산자
//        int num1 = 8, num2 = 3;
////        * 곱하기, / 몫, % 나머지
//        System.out.println("num1*num2 = " + num1 * num2);
//        System.out.println("num1/num2 = " + num1 / num2);
//        System.out.println("num1%num2 = " + num1 % num2);
//
////        대입 연산자
//        int n1 = 7, n2 = 7, n3 = 7;
//        System.out.println(n1 -= 3);
//        System.out.println(n2 += 3);
//        System.out.println(n3 =- 3);
//
////        /=, %=
//        int n4 = 10, n5 = 10;
//        System.out.println(n4 %= 3);
//        System.out.println(n5 /= 3);
//
////        증감 연산자
//        int a = 5;
//        int b = a++; //후위 연산자 : 살행문이 끝나고 증감
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//
//        a = 5;
//        b = ++a; // 전위 연산자 : 실행문이 끝나기전에 증감
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//
////        비교 연산자
//        // char1 = a, char2 = A
//        // char1이 char2와 같은지 출력 false
//        // char1이 char2와 같지않은지 출력 true
//        char char1 = 'a', char2 = 'A';
//        System.out.println(char1 == char2);
//        System.out.println(char1 != char2);

//        논리 연산자 : && (AND), || (OR), ! (NOT)
        int num3 = 10, num4 = 20;
        boolean result1, result2;
//        result1에 num3이 5보다 큰지 조건과 num3이 20보다 작은 조건을 and조건을 통해 boolean 담기
//        result2에 num4가 10보다 작은 조건과 num4가 30보다 작은 조건을 or조건을 통해 boolean 담기
//        result1, result2각각 출력
//        result2에 !달아서 출력
        result1 = (num3>5 && num3 <20);
        result2 = (num4<10 || num4 <30);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(!result2);

//        비트 연산자 &


    }
}
