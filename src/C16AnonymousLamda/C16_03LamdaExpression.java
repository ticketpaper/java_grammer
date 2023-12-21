package C16AnonymousLamda;

public class C16_03LamdaExpression {
    public static void main(String[] args) {
//        실행문이 1개일때 {}제외하고 return 생략
        LamdaInterface li = (str1, str2) -> str1 + str2;
//        실행문 2개 이상일때에는 {}포함하여 return 필요
//        매개변수를 순서로 인지하므로, 타입을 지정해줄 필요는 없다.
        LamdaInterface li2 = (str1, str2) -> {
            String answer = str1 + str2;
            return answer;
        };
        System.out.println(li.makeString("a", "b"));
        System.out.println(li2.makeString("abc", "def"));
    }
}

interface LamdaInterface {
    String makeString(String str1, String str2);
}
