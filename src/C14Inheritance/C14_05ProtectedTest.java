package C14Inheritance;

public class C14_05ProtectedTest {
    public static void main(String[] args) {
        C14_04ProtectedClass c14 = new C14_04ProtectedClass();
//        public 접근 가능
        System.out.println(c14.st0);
//        protected 접근 가능
        System.out.println(c14.st1);
//        default 접근가능
        System.out.println(c14.st2);


    }
}
