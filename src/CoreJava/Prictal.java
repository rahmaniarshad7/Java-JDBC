public interface Prictal {
    void goDown();
    void goForward();
}
class Duck implements Prictal
{
    @Override
    public void goDown()
    {
        System.out.println("Duck can Swimming in water...");
    }
    @Override
    public void goForward()
    {
        System.out.println("Duck can not fly....");
    }
}
class Bird extends Duck
{
    void swim()
    {
        System.out.println("Birds Cannot swim...");
    }
    void fly()
    {
        System.out.println("Birds can fly...." + "8000121313");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.swim();
        bird.fly();
        bird.goDown();
        bird.goForward();
    }
}


