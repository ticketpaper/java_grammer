package C16AnonymousLamda;

import java.util.*;

public class C16_04ComparableComparator {
    public static void main(String[] args) {
//        자바에서는 비교를 위한 인터페이스가 대표적으로 2개 제공 : Comparable, Comparator
//        Comparable 인터페이스에는 compareTo메서드가 선언, 그리고 java의 많은 클래스에서 구현하고 있음
//        -> 일반적으로 클래스내에서 직접 구현해서 사용방식.
//        Comparator 인터페이스에는 compare메서드가 선언되어 있다.
//        -> 일반적으로 익명객체를 만들어서 사용

////        두 만자열의 각 문자를 앞에서부터 순차적으로 비교
////        문자열의 자릿수의 차이가 발생할때, 그 문자의 유니코드 값의 처이를 반환
//
//        String a = "hello";
//        String b = "world";
//        System.out.println(a.compareTo(b));
//        List<String> li = new ArrayList<>();
//        li.add(a);
//        li.add(b);
//        Collections.sort(li); // Comparable의 compareTo 메서드를 통해 정렬
//        li.sort(Comparator.naturalOrder());
//
//        Integer intA = 1;
//        Integer intB = 1;
//        System.out.println(intA.compareTo(intB));
//
////        Student객체 정렬
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("존시나", 11));
//        studentList.add(new Student("브록 레스너", 15));
//        studentList.add(new Student("더락", 13));
//        studentList.add(new Student("언더테이커", 10));
//        studentList.add(new Student("빅쇼", 12));
//
//        System.out.println(studentList);

//        방법1. Comparator를 익명객체 방식으로 활용하여 정렬 (매개변수 2개)
//        studentList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        });

////        나이로 정렬
//        studentList.sort((o1, o2) -> o1.getAge() - o2.getAge()); // 오름차순
//        System.out.println(studentList);
////        studentList.sort((o1, o2) -> o2.getAge() - o1.getAge()); // 내림차순
//
////        이름으로 정렬
//        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
//        System.out.println(studentList);
//
////        글자 길이 순으로 정렬
//        String[] strArr = {"hello", "java", "C++", "world!!!!!!!!!!!"};
//        Arrays.sort(strArr, (o1, o2) -> o1.length()-o2.length());
//        System.out.println(Arrays.toString(strArr));
//
////        Priority Queue 내림차순
//        Queue<String> Que = new PriorityQueue<>((o1, o2) -> o2.length() - o1.length());

////        3, 30 , 34
//        int[] arr3 = {1,0,0,0};
//        int count = 0;
//        String[] arr4 = new String[arr3.length];
//        for (Integer i : arr3) {
//            arr4[count] = String.valueOf(i);
//            count++;
//        }
//        Arrays.sort(arr4, (o1, o2) -> (o2+o1).compareTo(o1+o2));
//
//        String answer = String.join("",arr4);
//
//        if (arr4[0].equals("0")) answer="0";
//
//        System.out.println(answer);

////        방법2. Comparable인터페이스 implements 후 compareTo메서드 구현 (매개변수 1개)
//        Collections.sort(studentList);
//        System.out.println(studentList);

//        쓰레드 구현방식 : 쓰레드 상속, Runnable 방식
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("새로 만든 쓰레드 입니다.");
            }
        });
        t1.start();

        // new Thread(() -> System.out.println("새로 만든 쓰레드 입니다.")).start();


        System.out.println("main의 쓰레드 입니다.");



    }

}
/**
 * 1) Comparable을 구현해서 compareTo 구현
 * 2) Comparator를 구현해서 compare 구현
 * a-b 음수면 b가 큼 이런 식,,
 *
 * Student객체 : private name, age 변수 생성
 * 생성자를 토해 두 변수 초기화
 * getter만 생성
 */
class Student implements Comparable<Student>{
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

//    조상 클래스인 Object클래스의 toString을 ovveriding하여 객체호출시 자동으로 toString메서드 호출
    @Override
    public String toString() {
        return "이름은 " + name  + " 나이는 " + age;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }
}