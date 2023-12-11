import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
    import java.util.regex.Pattern;

public class C07String {
    public static void main(String[] args) {
//        참조 자료형 : 기본 자료형을 제외한 모든 자료형
//        Wrapper class : 기본형 타입에 없는 다양한 기능을 지원하기 위한 클래스

//        int a = 10;
//        Integer b = new Integer(20);
////        오토 언박싱 : Integer -> int로 형변환
//        int c = b;
////        언박싱 : Integer -> int 형변환
//        int d = b.intValue();
////        오토박싱
//        Integer e = a;
////        박싱
//        Integer f = Integer.valueOf(a);

////        String, int 형변환
//        int a = 10;
//        String str_a = Integer.toString(a); // int -> String : "10"
//        String str_a2 = String.valueOf(a); // int -> String : "10"
//        int c = Integer.parseInt(str_a); // String -> int : 10

////        char -> String 형변환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);

//        String str = "01asb가나다123";
//        String replace_str = "";
//        String str_re = str.replaceAll("[a-z]", "");

////        참조자료형에 원시자료형을 담을떄에는 wrapper 클래스를 사용해야한다.
////        ex) 컬렉션 프레임워크 (List, set, ...)
//        List<Integer> list_a = new ArrayList<>();
//        list_a.add(10);
//        list_a.add(20);
//        list_a.add(30);
//        System.out.println(list_a);

////        String pool, String 객체
//        String st1 = new String("hello");
//        String st2 = new String("hello");
//        String st3 = "hello";
//        String st4 = "hello";
//        String st5 = st1;

//        System.out.println(st1 == st2); // false
//        System.out.println(st1 == st3); // false
//        System.out.println(st3 == st4); // true
//        System.out.println(st1 == st5); // true

//        System.out.println(st1.equals(st2));
//        System.out.println(st1.equals(st3));
//        System.out.println(st1.equals(st4));
//        System.out.println(st1.equals(st5));

////        문자열길이 : length()
//        String mySt = " hello ";
//        System.out.println(mySt.length());

////        indexOf() : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치 반환
//        String mySt2 = "hello java";
//        int mySt2_index = mySt2.indexOf("java");
//        System.out.println(mySt2_index);
//
////        contains() : 문자열에서 특정 문자열이 포함되어 있는지의 여부를 리턴
//        boolean mySt2_contains = mySt2.contains("java");
//        System.out.println(mySt2_contains);

////        charAt() : 문자열에서 특정 위치(index)의 문자(char)를 리턴
//        String st = "abcedfabcedf";
//        char a_char = st.charAt(1);
//        System.out.println(a_char);

//        문자열 st에서 a의 개수를 출력
//        int count = 0;
//        for(int i=0; i<st.length(); i++){
//            if (st.charAt(i) == 'a') {
//                count++;
//            }
//        }
//        System.out.println(count);

//        substring(a,b) : a이상 b미만의 index를 자른다.
        String st1 = "hello world";
        System.out.println(st1.substring(0,5));
        System.out.println(st1.substring(6,st1.length()));

////        문자열 더하기
//        String a = "hello";
//        a += " world"; // 새롭게 선언하는거, 성능이 떨어짐
//        System.out.println(a);

////        toUpperCase()/toLowerCase() : 대소문자 변환 리턴
//        String a = "Hello";
//        System.out.println(a.toUpperCase()); // 대문자로 변환
//        System.out.println(a.toLowerCase()); // 소문자로 변환

////        trim() == strip() : 왼쪽, 오른쪽에 있는 공백을 다 제거한다.
////        아스키코드에서 저의된 공백을 제외한 유니코드의 공백을 인식못한다.
//        String st = "        hello wolrd        ";
//        st.trim(); // 원본을 바꾸는게 아님
//        System.out.println(st.strip());

////        replace(a,b) : 문자열중에 특정 문자열울 바꿔 새로운 문자열을 return
//        String st1 = "hello java";
//        String st2 = st1.replace("java", "world");
//        System.out.println(st2);
////        replaceAll(a,b)
//        String st3 = st1.replaceAll("java", "python");
//        System.out.println(st3);

//        String str = "01ADASDAasb가나다123";
////        [a-z] : 소문자 알파벳
//        String str_re = str.replaceAll("[a-z]", "");
//        System.out.println(str_re);
////        [가-힣] : 한글
//        String str_re2 = str.replaceAll("[가-힣]","");
//        System.out.println(str_re2);
////        [0-9] : 숫자
//        String str_re3 = str.replaceAll("[0-9]", "");
//        System.out.println(str_re3);
////        숫자,알파벳 대소문자 다 없애기
//        String str_re4 = str.replaceAll("[A-z0-9]", "");
//        System.out.println(str_re4);
//
////        Pattern 클래스
//        boolean checker = Pattern.matches("[a-z]+","한he글ll한ow글orld");
//        boolean checker2 = Pattern.matches(".*[a-z].*+","한he글ll한ow글orld");
//        System.out.println(checker);
//        System.out.println(checker2);
//
////        전화번호 검증
////        \d: 숫자, {}: 연속으로
//        boolean checker3 = Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", "010-1234-1234");
//        System.out.println(checker3);
//
////        이메일 검증
//        boolean checker4 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", "dasd1234@naver.com");
//        System.out.println(checker4);

////        split() : 문자열을 특정 구분자로 분리하는 메소드 (String -> String[])
//        String a = "a:b:c:d";
//        String[] starr = a.split(":");
//        System.out.println(Arrays.toString(starr));
//        String b = "a b c d";
//        String[] starr2 = b.split(" ");
//        System.out.println(Arrays.toString(starr2));
//        String c = "   a    b  c d   ";
//        String[] starr3 = c.strip().split("\\s+"); // \\s+ : 여러개의 공백을 의미
//        System.out.println(Arrays.toString(starr3));

////        isEmpty() : 문자열이 비어있는지 여부, null이랑 다름
//        String st1 = null;
//        String st2 = "";
//
//        System.out.println(st1 == null);
//        System.out.println(st2 == null);
//        System.out.println(st2.isEmpty());
////        NullPointerException 예외 발생
//        System.out.println(st1.isEmpty());

////        Join : String[] -> String
////        여러문자열을 하나로 결합하며, 각 문자열 사이엔 지정한 구분자가 삽입
//        String[] arr = {"Java", "C#", "Python","C++"};
//        String arr_str = String.join(", ", arr);
//        System.out.println(arr_str);

//        StringBuffer는 문자열을 추가하거나 변경할때 주로 사용하는 객체
//        String st1= "hello";
//        StringBuffer sb = new StringBuffer(st1);
////        append : 문자열 마지막에 추가대상 문자열을 추가
//        sb.append(" world");
////        insert : 특정 n번째 위치에 원하는 문자열을
//        sb.insert(6, "java "); // 0으로 지정하면 맨앞에 넣음
////        substring  : String 자료형의 substring메소드와 동일하게 사용
//        System.out.println(sb.substring(6, 10));
////        delete(int start, int end): start부터 end만큼 삭제
//        sb.delete(6,11);
//        String new_str = sb.toString();
//        System.out.println(new_str);

////        String < StringBuffer < StringBuilder(스레드 safe X)
//        StringBuilder sb2 = new StringBuilder(st1);
//        sb2.append(" world");
//        System.out.println(sb2.indexOf("o"));
//        System.out.println(sb2);
    }
}
