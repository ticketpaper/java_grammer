package C14Inheritance;


//extends 키워드를 통해 상속관계를 표현
public class C14_01Inheritance extends Parents{
    int c = 30;
    public static void main(String[] args) {
        C14_01Inheritance ih = new C14_01Inheritance();
        System.out.println(ih.c);
        System.out.println(ih.a);
//        자식 클래스여도 부모의 private변수는 상속 및 접근이 불가하다.
//        System.out.println(ih.b);

        ih.parentMethod();
        ih.childMethod();
    }

    void childMethod() {
        System.out.println("자식 클래스 입니다.");
    }
//    부모클래스의 메서드명을 동일하게 사용함으로서 메소드 오버라이딩(덮어쓰기)했다.
    @Override
    void parentMethod() {
        System.out.println("부모 클래스가 아니라 자식 클래스 입니다.");
    }

}
class Parents {
    int a = 10;
    private int b = 20;

    void parentMethod() {
        System.out.println("부모 클래스 입니다.");
    }

}
