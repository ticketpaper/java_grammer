package C17EtcClass;

import java.util.Arrays;

public class C17_03GenericMain {
    public static void main(String[] args) {

        String[] stArr = {"java", "Python", "C++"};
//        0번째와 1번째 자리 change
//        String temp = stArr[0];
//        stArr[0] = stArr[1];
//        stArr[1] = temp;
        change(stArr, 0, 1);
        System.out.println(Arrays.toString(stArr));

        Integer[] intArr = {1, 2, 3, 4, 5};
//        1번째와 2번째 자리 change
        change(intArr,1,2);
        System.out.println(Arrays.toString(intArr));


        GenericStudent<String> stu1 = new GenericStudent<>("존 시나", "20");
        GenericStudent<Integer> stu2 = new GenericStudent<>("브록 레스너", 20);

//        .getClass() : 무슨 클래스 인지 알려줌
        System.out.println(stu1.getAge().getClass());
        System.out.println(stu2.getAge().getClass());

    }

//    static void Stringchange(String[] arr, int a, int b) {
//        String temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }
//
//    static void Integerchange(Integer[] arr, int a, int b) {
//        int temp = arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }

//      제네릭 메서드 생성 : 변환타입 완쪽에 <T> 선언
//      제네릭은 객체타입이 들어와야함에 유의
    static<T> void change(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

class GenericStudent<T> {
    private String name;
    private T age;

    public GenericStudent(String name, T age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }
}