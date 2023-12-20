package C14Inheritance;

// public : 프로젝트 젠처에서 접근가능
// protected : 패키지를 벗어나더라도 상속관계인 경우에는 접근가능, 같은 패키지만 접근가능 default + @ 임
// default : 패키지 내에서만 접근가능
// private : 클래스 내에서만 접근가능
// public > protected > default > private 순서

public class C14_04ProtectedClass {

    public String st0 = "hello world!0";
    protected String st1 = "hello world!1";

    String st2 = "hello world!2";
    private String st3 = "hello world!3";
}
