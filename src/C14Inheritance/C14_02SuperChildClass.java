package C14Inheritance;

/**
 * super(), super키워드
 * super() : 부모 클래스의 생성자를 의미
 * super 키워드 : 부모 클래스 의미
 */
public class C14_02SuperChildClass extends SuperParents {
    int b;
    int a;
    C14_02SuperChildClass() {
        super(100);
        a = 30;
        b = 20;
    }
    void display() {
        System.out.println(a); // 우선은 자식
        System.out.println(super.a); // 부모 출력시 super
        System.out.println(b);
    }
    public static void main(String[] args){
        C14_02SuperChildClass sc = new C14_02SuperChildClass();
        sc.display();
    }



}
class SuperParents {
    int a;

    SuperParents(int a) {
        this.a = a;
    }
}