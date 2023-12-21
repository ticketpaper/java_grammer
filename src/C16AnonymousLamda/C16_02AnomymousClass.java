package C16AnonymousLamda;

public class C16_02AnomymousClass {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public void sound(int n) {
                System.out.println("멍멍" + n);
            }
        };
        dog.sound(10);

//        익명객체에 구현메서드가 1개 밖에 없을경우에 람다표현식(화살표)로 표현가능
//        ()부분에 매개변수 저장하여 구현체에서 활용, 변수의 개수가 많을때는 개수에 맞춰 지정
        Animal cat = (n) -> System.out.println("야옹" + n);
        cat.sound(20);
    }
}

interface Animal {
    void sound(int n);
}
