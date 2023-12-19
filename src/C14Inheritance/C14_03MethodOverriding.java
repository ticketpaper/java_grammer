package C14Inheritance;

import java.sql.SQLOutput;

/**
 * Animal class : sound() -> 동물은 소리를 냅니다
 * Dog class : Animal -> sound overriding : 멍멍
 * Cat class : Animal -> sound overriding : 야옹
 * 객체 2개 생성해서 sound 호출
 */
public class C14_03MethodOverriding {
    public static void main(String[] args) {
//        상속 관계일때 부모 클래스 타입을 자식 클래스 객체에 타입으로 지정가능하다.
//        Animal클래스에 정의된 메서드만 사용 가능하도록 제약이 발생
        Animal dog1 = new Dog();
        dog1.sound();
//        Animal 클래스에는 sound2 메서드가 정의되어 있지않아 제약 발생
//        dog1.sound2();
        Cat cat2 = new Cat();
        cat2.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("동물은 소리를 냅니다.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("멍멍");
    }
    void sound2() {
        System.out.println("멍멍멍멍");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("야옹");
    }
}

