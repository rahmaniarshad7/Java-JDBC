public class Main1{
    public static void main(String[] args) {
        // Create an array of Flyable objects, including a Spacecraft, Airplane, and Helicopter
        Flyable[] flyingObject = {new SpaceCraft() , new Aeroplane() , new Helicopter()};
        for (Flyable obj : flyingObject){
            obj.fly_obj();
        }
    }
}
