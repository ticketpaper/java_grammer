public class C13_1_StackFuntion1 {
//    스택 메모리와의 연관성
    public static void main(String[] args) {
        System.out.println("main 함수 시작");
        System.out.println(funtion1(10));
        System.out.println("main 함수 종료");
    }
    static int funtion1(int a){
        System.out.println("funtion1 함수 시작");
        System.out.println("funtion1 함수 종료");
        return funtion1(a*2);
    }

}
