package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj){
        //obj.move()
        //obj.sound()
        //Object는 dog든 car든 다 모름 => 그럼 객체에 맞는 다운캐스팅이 필요함 => 다형성을 하기에는 한계가 존재함. 바로, '메서드 오버라이딩 불가'

        if (obj instanceof Dog dog){
            dog.sound();
        } else if (obj instanceof Car car){
            car.move();
        }

    }
}
