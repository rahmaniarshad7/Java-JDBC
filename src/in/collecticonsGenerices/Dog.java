package in.collecticonsGenerices;

public class Dog<T>
{
    private T data;

    public Dog(T data) {
        this.data = data;
    }
    T getName()
    {
        return data;
    }
}
