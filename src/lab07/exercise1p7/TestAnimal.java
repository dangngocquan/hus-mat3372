package lab07.exercise1p7;

public class TestAnimal {
    public static void main(String[] args) {
        // Using subclass
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();

        // Using Polymorphism
        Animal animal1  = new Cat();
        animal1.greeting();
        Animal animal2  = new Dog();
        animal1.greeting();
        Animal animal3  = new BigDog();
        animal1.greeting();
//        Animal animal4 = new Animal(); // Error

        // Downcast
        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;
        Cat cat2 = (Cat) animal1;
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);
    }
}
