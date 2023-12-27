package C16AnonymousLamda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C16_05StreamAPI1 {
    public static void main(String[] args) {
//        int[] arr = {20, 10, 4, 12};
////       데이터 접근하는 전통적인 방식
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        데이터와 객체 중심이 아닌, 입력에 따른 출력 만 존재하는 함수형 프로그래밍 방식
//        java에서 함수형 프로그래밍을 지원하기위한 라이브러리 -> StreamAPI
//        foreach : 스트림의 각 요소를 소모하면서 동작을 수행
//        Arrays.stream(arr).forEach(a -> System.out.println(a));

//        String[] str = {"hI", "Java", "c++", "WORLD"};
//
//        Arrays.stream(str).sorted((s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase())).forEach(a-> System.out.println(a));
//        Arrays.stream(arr).sorted().forEach(a -> System.out.println(a));
//
////        스트림의 생성
//        String[] strArr = {"HTML", "CSS", "JAVA", "PYTHON"};
////        stream<객체> : 제네릭타입으로 stream객체가 생성
//        Stream<String> myStream = Arrays.stream(strArr);
//
//        int[] intArr = {10, 20, 30, 40, 50};
//        IntStream muStream2 = Arrays.stream(intArr);
//        int[] array = muStream2.filter(a -> a > 20).toArray();

//        참조변수의 스트림변환 경우 제네릭의 타입소거 문제 발생
//        제네릭의 타입소거 : java버전의 호환성을 위해 제네릭 타입을 런타임 시점에 제거하는 것을 의미.
//        String[] strArr2 = myStream.filter(a -> a.length() <= 4).toArray(a->new String[0]);
//        메소드 참조 방식으로 표현하는 것이 더 일반적
//        메소드 참조 방식 : 클래스::메서드
//        String[] strArr2 = myStream.filter(a -> a.length() <= 4).toArray(String[]::new);


////        stream 중개연산 : filter, map, sorted, distinct
//        int[] intArr = {10, 20, 30, 40, 50};
//        int answer = Arrays.stream(intArr).distinct().sum();
//        System.out.println(answer);

//        String[] strArr = {"java", "java", "python", "C++"};
////        중복 제거후 새로운 배열 생성
//        String[] strArr2 = Arrays.stream(strArr).distinct().toArray(String[]::new);
//
////        중복 제거하고 길이가 3개 이하 인것으로 제한하고, 남은 배열의 길이 종합(sum)
////        mapToInt를 통해 IntStream으로 변환
//        IntStream myStream = Arrays.stream(strArr).distinct().filter(a -> a.length() <= 3).mapToInt(a -> a.length());

////        sorted: 정렬된 스트림반환
//        int[] intArr = {4, 1, 2, 3, 6, 7};
////        내림차순 정렬된 숫자 신규 배열 반환
//        int[] intArr2 = Arrays.stream(intArr).sorted().toArray();

//        List<Integer> intList = new ArrayList<>(Arrays.asList(6, 1, 2, 3, 1, 6));
//        intList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
////        streamAPI를 사용해서 문자열의 길이가 4개 이상, 문자열의 길이를 기준으로 내림차순 정렬후 신규 list 생성
//        List<String> strList = new ArrayList<>(Arrays.asList("java", "python", "C++", "javascript"));
//        List<String> str_filter = strList.stream().filter(a -> a.length() >= 4).sorted((o1, o2) -> o2.length()-o1.length()).collect(Collectors.toList());
//        System.out.println(str_filter);

//        int[] intArr3 = Arrays.stream(intArr).map(a -> a += 10).toArray();
//        System.out.println(Arrays.toString(intArr3));
//
////        intArr에서 짝수만 골라서 해당 수의 제곱의 총합을 구하라.
//        int sum = Arrays.stream(intArr).filter(a -> a % 2 == 0).map(a -> a *= a).sum();
//        System.out.println(sum);

////        스트림 소모 : forEach, reduce
//        int[] arr = {10, 20, 30, 40};
//        Arrays.stream(arr).forEach(a-> System.out.println(a));
//        Arrays.stream(arr).forEach(System.out::println);


//        reduce : 누적연산
//        초기값을 지정하지 않으면 Optional 객체 return
//        Optional 객체 : 값이 있을수도 있고, 없을수도 있다는 것을 명시한 타입이다. (java 8이후 도입)

////        List<String> mylist1 = new ArrayList<>(Arrays.asList("hello", null, "java")); // 널포인트 에러남
//        Optional<String> myOp = Optional.ofNullable("hello");
//        if (myOp.isPresent()) {
//            System.out.println(myOp.get().length());
//        }

//        int result = Arrays.stream(arr).reduce(1, (a, b) -> a * b);
//        OptionalInt sum2 = Arrays.stream(arr).reduce( (a, b) -> a + b);
//        int sum3 = Arrays.stream(arr).reduce((a, b) -> a + b).getAsInt();
//        System.out.println(sum2);
//        System.out.println(sum3);
//
//        String[] str_arr = {"hello", "java", "world"};
//        String answer = Arrays.stream(str_arr).reduce((a, b) -> (a + ", " + b)).get();
//        Optional<String> answer2 = Arrays.stream(str_arr).reduce((a, b) -> a + ", " + b);
//        System.out.println(answer);
//        if (answer2.isPresent()) {
//            System.out.println(answer2.get());
//        }

////        최소/최대/평균/총합/개수 : min/max/average/sum/count
//        List<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
//        System.out.println(myList.stream().mapToInt(a -> a).max().getAsInt());
//        System.out.println(myList.stream().mapToInt(a -> a).min().getAsInt());
//        System.out.println(myList.stream().count());
//        System.out.println(myList.stream().mapToInt(a -> a).average().getAsDouble());
//        System.out.println(myList.stream().mapToInt(a -> a).sum());

////        findfirst
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("존시나", 10));
//        students.add(new Student("브록 레스너", 25));
//        students.add(new Student("더락", 30));
//        students.add(new Student("언더테이커", 40));
//        students.add(new Student("빅쇼", 35));
//        Student s1 = students.stream().filter(a -> a.getAge() >= 30).findFirst().get();
//        System.out.println(s1);
//
//        /**
//         * 1. 가장 어린 사람
//         * 2. 30대가 몇명인지 출력
//         * 3. 모든 객체의 평균나이 출력
//         * 4. 30대 이하 선착순 누구인지 객체 출력
//         */
//        System.out.println(students.stream().min((o1, o2) -> o1.getAge() - o2.getAge()).get());
//        System.out.println(students.stream().filter(a->30<=a.getAge() && a.getAge()<40).count());
//        System.out.println(students.stream().mapToInt(a->a.getAge()).average().getAsDouble());
//        System.out.println(students.stream().filter(a -> a.getAge() <= 30).findFirst().get());

//        기존의 java의 null
        String st = null;
//        System.out.println(st.compareTo("abc"));

//        java8 이후에 나온 Optional객체를 통해 특정 객체에 값이 없을지도 모른다는것을 명시적으로 표현
//        Optional객체에 빈값을 명시적으로 넣는 방법 : Optional.empty();
        Optional<String> opt1 = Optional.empty();
//        빈값인지 아닌지 check하는 메서드 : isPresent()
        if (opt1.isPresent()) {
            System.out.println(opt1.get().compareTo("abc"));
        } else {
            System.out.println("값이 없습니다.");
        }

//        optional객체 생성
        Optional<String> opt2 = Optional.ofNullable("hello"); // null 있을수도 있음을 의미

//        orElse 관련 메서드 사용하여 null(빈값)처리
//        orElse(), orElseGet(), orElseThrow()

//        orElse(): 값이 있으면 해당값 return, 없으면 default지정값 return
        System.out.println(opt1.orElse("").compareTo("abc"));
//        orElseGet() : 값이 있으면 해당값 return, 없으면 람다함수 또는 메소드 참조 실행
        System.out.println(opt1.orElseGet(String::new).compareTo("abc"));
        System.out.println(opt1.orElseGet(()->new String()).compareTo("abc"));
//        orElseThrow(): 값이 있으면 해당값 return, 없으면 지정된 예외 강제 발생
        int abc = opt1.orElseThrow(()-> new NoSuchElementException("객체에 값이 없습니다.")).compareTo("abc");
//        System.out.println(abc);

//        OptionalInt, OptionalDouble
        OptionalInt oi = new ArrayList<>(Arrays.asList(1, 2, 3, 4)).stream().mapToInt(a -> a).max();
//        방법1. isPersent check
        if (oi.isPresent()) {
        } else {
        }
//        방법2. orElse 등의 방법 사용
        System.out.println(oi.orElseThrow(() -> new NoSuchElementException("no values")));

//        streamAPI는 디버깅이 어려움 중간에 .peek로
    }
}
