abstract class Animal1 {
   abstract void sound();
}
class Lion extends Animal1{

    /**
     *
     */
    @Override
    void sound() {
        System.out.println("Lion is Roaring...");

    }
}
class Tiger extends Animal1{
    void sound(){
        System.out.println("Tiger gives Aggression...");
    }
}
class Dog extends Animal1{
    void sound(){
        System.out.println("Dog is Barking...");
    }
}
class main8{
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Dog dog = new Dog();

        lion.sound();
        tiger.sound();
        dog.sound();

    }
}
