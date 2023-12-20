package C15Interface;

public class StaticFinalInterface {
    public static void main(String[] args) {
        MyImplements a = new MyImplements();
        System.out.println(a.my_constant);
        System.out.println(a.a);
        System.out.println(MyInterface.my_constant);
    }
}

interface MyInterface {
    String a = "abc";
//    아래 변수는 컴파일 타임에 static final이 붙는다.
    int my_constant = 100; // 상수이자, 클래스 변수

    void method();
}

class MyImplements implements MyInterface {
    @Override
    public void method() {
    }
}