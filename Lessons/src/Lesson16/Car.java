package Lesson16;



public class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    final static int a = 5;


    public Car abs(String cvet) {
        Car c10 = new Car(cvet, "V4");
        return c10;
    }

    class TestCar {
        final static Car c = new Car("Red", "V8");

        public static void main(String[] args) {
          Car car = new Car("red","V6");
          Car c2 = car.abs("Black");
            System.out.println(car.color);
        }
    }
}
