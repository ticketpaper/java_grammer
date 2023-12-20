package C14Inheritance;

// import java.util.* 은 가능하다 : util 하위 모든 클래스/인터페이스 파일 import 가능
// import java.* 은 불가능 : 특정 패키지의 하위 모든 파일까지 import 하는것은 불가능

// final이 붙은 클래스는 상속 불가능 하다.
//public class C14_06Others extends FinalClass{}
public class C14_06Others {
    public static void main(String[] args) {
        C1406Dog dog1 = new C1406Dog();
        dog1.sound1();
        dog1.sound2();

    }

}

final class FinalClass {

}

// abstract 클래스는 abstract 메서드를 선언가능 (구현x)
// interface와 다르게 구현되어있는 메서드도 선언가능
abstract class C1406Animal {
    //    final void sound() {
//        System.out.println("동물은 소리를 낸다");
//    }
    abstract void sound1();

    void sound2() {
        System.out.println("sound2");
    }
}

class C1406Dog extends C1406Animal {
    @Override
    void sound1() {
        System.out.println("sound1");
    }

//    final이 붙은 메서드는 오버라이딩이 불가능하다.
//    @Override
//    void sound() {
//        System.out.println("멍멍");
//    }

}