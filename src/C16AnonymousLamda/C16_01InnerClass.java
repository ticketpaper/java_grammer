package C16AnonymousLamda;

public class C16_01InnerClass {
    public static void main(String[] args) {
        MemberInnerClass.StaticInnerClass si = new MemberInnerClass.StaticInnerClass();
        si.display();
        MemberInnerClass mi = new MemberInnerClass();
        mi.display();

    }
}

// 일반 내부 클래스
class MemberInnerClass {

    private int a;
    void display() {
        System.out.println("a 값은 "+a+"입니다.");
    }
//    static 내부 클래스
//    이 클래스는 C16_01InnerClass의 정적 멤버처럼 활용
    static class StaticInnerClass {
        private int data;
        void display() {
            System.out.println("data 값은 "+data+"입니다.");
        }

    }
}
