package in.collecticonsGenerices;

public class LearnGenerics {
    public static void main(String[] args) {

        Dog<String> dog = new Dog<>("Puppy");
        Dog<Integer> dog2 = new Dog<>(12);
        System.out.println("Name of Dog = " + dog.getName());
        System.out.println("Age of Dog = " + dog2.getName());
    }

}
