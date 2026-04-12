package OOPs;

public class JavaProject {
    public static void main(String[] args) {
        System.out.println("Hello, this is a simple Java project!");
        SimpleClass simple = new SimpleClass("Example");
        simple.display();
    }
}

class SimpleClass {
    private final String name;

    public SimpleClass(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}
