package C14_01Protected_Test;

import C14Inheritance.C14_04ProtectedClass; //src 기준
public class C14_01ProtectedTest2 extends C14_04ProtectedClass{
    public static void main(String[] args) {
        C14_04ProtectedClass c14 = new C14_04ProtectedClass();
        System.out.println(c14.st0);
//        System.out.println(c14.st1);

        C14_01ProtectedTest2 c14_01 = new C14_01ProtectedTest2();
//        상속한 객체에서 protected 변수 접근 가능
        System.out.println(c14_01.st0);
        System.out.println(c14_01.st1);


    }
}
