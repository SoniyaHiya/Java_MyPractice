package classobj;

class Dog {

    String name;
    int age;
    String breed;

    void bark() {
        System.out.println(name + " is barking");
    }

    void spin() {
        System.out.println(name + " is spinning");
    }

    void run() {
        System.out.println(name + " is running");
    }
}

public class DogMain {

    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.name = "Tommy";
        d1.age = 3;
        d1.breed = "German Shepherd";

        d1.bark();
        d1.spin();
        d1.run();
    }
}