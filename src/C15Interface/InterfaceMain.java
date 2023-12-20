package C15Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        AnimalInterface1 cat1 = new CatImplements();
        DogImplements dog1 = new DogImplements();
        cat1.sound();
        dog1.sound();

//        다형성: 하나의 객체가 여러개의 참조변수를 가질수 있음을 의미
//        타입을 interface1으로 선언하면 interface2에 정의된 메서드는 사용불가
        AnimalInterface1 MultiCat = new CatMultiImplements();
//        System.out.println(MultiCat.play("떼껄룩", "길냥이"));
        MultiCat.sound();

//        타입을 interface2으로 선언하면 interface1에 정의된 메서드는 사용불가
        AnimalInterface2 MultiDog = new DogMultiImplements();
        System.out.println(MultiDog.play("bori", "you"));
//        MultiDog.sound();

//        기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나, 익명내부 클래스 방식으로 사용가능
        AnimalInterface1 ai = new AnimalInterface1() {
            @Override
            public void sound() {

            }
        };
    }
}
